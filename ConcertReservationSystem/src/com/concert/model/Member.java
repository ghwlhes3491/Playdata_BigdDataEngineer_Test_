package com.concert.model;

/**
 * <pre>
 * 공연예매 프로그램 회원 도메인 클래스 
 * ## 회원 검증 조건 
 * 1. memberId 아이디 
 * 2. memberPw 비밀번호
 * 3. memberName 이름
 * 4. mobile 휴대폰
 * 5. email 이메일
 * 6. money 캐시 
 * 7. grade 등급 
 * </pre>
 */
public class Member {
	/** 아이디, 식별키 */
	private String memberId;
	/** 비밀번호, 필수 */
	private String memberPw;
	/** 이름, 필수 */
	private String name;
	/** 휴대폰, 필수, 형식 01012341234 */
	private String mobile;
	/** 이메일, 필수 */
	private String email;
	/** 캐시, 필수? 관리자는??null??? */
	private int cash;
	/**등급, 필수 */
	private String grade;

	/**기본 생성자 */
	public Member() {}

	/**
	 * 사용자 입력데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰번호
	 * @param email 이메일
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	
	/**
	 * 회원 필수데이터 초기화 생성자
	 * @param memberId 아이디
	 * @param memberPw 비밀번호
	 * @param name 이름
	 * @param mobile 휴대폰번호
	 * @param email 이메일
	 * @param cash 캐시
	 * @param grade 등급
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, int cash, String grade) {
		this(memberId, memberPw, name, mobile, email);
		this.cash = cash;
		this.grade = grade;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
		this.memberPw = memberPw;
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
	 * @return the money
	 */
	public int getCash() {
		return cash;
	}

	/**
	 * @param money the money to set
	 */
	public void setCash(int cash) {
		this.cash = cash;
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
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(memberId);
		builder.append(",\t");
		builder.append(memberPw);
		builder.append(",\t");
		builder.append(name);
		builder.append(",\t");
		builder.append(mobile);
		builder.append(",\t");
		builder.append(email);
		builder.append(",\t");
		builder.append(cash);
		builder.append(",\t");
		builder.append(grade);
		return builder.toString();
	}



	
	
}
