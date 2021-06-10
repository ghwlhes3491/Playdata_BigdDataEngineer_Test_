package com.work.model.dto;
/**
 * <pre>
 * 회원 도메인 클래스
 * -- encapsulation  
 *  #회원 검증 조건
 *  1. id : 6자리 이상 ~ 30자리 이하
 *  2. pw : 6자리 이상 ~ 20자리 미만
 *  3. 마일리지 : 0~100000
 *  4. 등급 : G, S, Access	
 * 		>> 문자열 비교 메서드		
 * 		>> String
 * 		>> equals(Object anObject) : boolean
 * </pre>
 * @author 김현진
 * @version 1.0
 * @since jdk1.8
 *
 */

public class Member {

	private String memberId;
	private String memberPw;
	private String name;
	private String mobile;
	private String email;
	private String entryDate;
	private String grade;
	private int mileage;
	private String manager;
	
	/**
	 * 기본 생성자
	 */
	public Member() {
	}

	/**
	 * 사용자입력 데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		//this(); 아무것도 안하니까 굳이 갔다올 필요 없음.
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * 필수 데이터 초기화 생성자 
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰
	 * @param email 이메일
	 * @param entryDate 가입일
	 * @param grade	등급
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade) {
		this(memberId, memberPw, name,mobile, email);
		this.entryDate = entryDate;
		this.grade = grade;
	}

	/**
	 * 전체데이터 초기화 생성자
	 * @param memberId
	 * @param memberPw
	 * @param name
	 * @param mobile
	 * @param email
	 * @param entryDate
	 * @param grade
	 * @param mileage
	 * @param manager
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, int mileage, String manager) {
		this(memberId, memberPw, name,mobile, email, entryDate, grade);
		this.mileage = mileage;
		this.manager = manager;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * 아이디 검증규칙 :
	 * -- 최소 6자리, 최대 30자리
	 * -- 문자열의 길이 메서드 {@link String#length()}
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		//길이 검증 메서드 호출문 
		boolean result = isMemberId(memberId);
		if(result) {
			this.memberId = memberId;
		}else {
			System.out.println("[오류]아이디는 6~30자리 이내로 입력하세요.");
		}
		
	}
	//
	/**
	 * 아이디 검증 메서드 선언 
	 * @param memberId 아이디
	 * @return 아이디 길이가 6~30 자리 이내면 true, 그렇지 않으면  false
	 */
	private boolean isMemberId(String memberId) {
		
		if(memberId.length() >= 6 && memberId.length() <= 30) {
			return true;
		} else {
			return false;
		}
}

	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}

	/**
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		if(isMemberPW(memberPw)) {
			this.memberPw = memberPw;
			return;		//true면 여기서 바로 종료됨
		}
			System.out.println("[오류]비밀번호는 6~30자리 이내로 입력하세요.");
	}
	
	/**
	 * 비밀번호 검증 메서드
	 * 검증규칙 : 길이 - 6자리 ~ 20자리
	 * @param memberPW 변경 비밀번호
	 * @return 검증규칙 올바르면 true 올바르지않으면 false
	 */
	private boolean isMemberPW(String memberPW) {
		int length = memberPW.length();
		if(length >= 6 && length <= 20) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the entryDate
	 */
	public String getEntryDate() {
		return entryDate;
	}

	/**
	 * @param entryDate the entryDate to set
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		if (isGrade(grade)) {
			this.grade = grade;
		}else {
			System.out.println("[오류] 등급은 'G','S','A'만 입력가능합니다.");
		}
	}
	/**
	 * 등급 검증 메서드
	 * 검증규칙 : G, S, A
	 * @param grade 변경 등급 
	 * @return
	 */
	private boolean isGrade(String grade) {
		 return grade.equals("G") || grade.equals("S") || grade.equals("A");
		 //return this.grade.equals("G") || this.grade.equals("S") || this.grade.equals("A") 안됨.
		
//		switch(grade){
//		case("G") : 
//		case("S") : 
//		case("A") : 
//			return true;
//		default:
//			return false;
//		}

	}
	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		boolean result = isMileage(mileage);
		if(result) {
			this.mileage = mileage;
			return;
		}
		System.out.println("[오류] 마일리지의 값은 0~100000사이의 값 입니다.");
	
	}
	/**
	 * 마일리지 검증 메서드
	 * @param mileage 변경 마일리지
	 * @return 올바르면  true, 올바르지 않으면 false
	 */
	private boolean isMileage(int mileage) {
		if(mileage >= 0 && mileage <= 100000) {
			return true;
		}
		return false;
	}
	/**
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}
	//재정의하지 않으면 java.lang.Object#toString()상속 메서드를 그대로 사용
	
	//재정의 하면 => 재정의한 결과의 문자열 반환
	@Override
	public String toString() {
		return memberId + ", " + memberPw + ", " + name + ", " + mobile + ", " + email + ", " + entryDate + ", " + grade
				+ ", " + mileage + ", " + manager;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		return result;     //		return 1004;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {		//obj가 네가 갖고있는 것(this?)과 같으면?
			return true;	//현재 객체와 전달 받은 객체가 같으면 true 리턴
		}
		if (obj == null)		//(객체 타입에 null도 들어올 수 있다. )
			return false;		// null값이 들어오면 false
		//null이란 어떠한 객체도 참조하지 않는 상태!!!
		
		if (getClass() != obj.getClass())	//getClass()는 뭐야? 클래스명이 같지않으면
			return false;	
		
		Member other = (Member) obj;
		if (memberId == null) {		//memberId는 문자열
			if (other.memberId != null)	
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true; 		//memberId가 null아 아니고 위에 모두 true이면 true로 출력
	}
	

	
	
	
	
	
	
	
	
	
		

}
