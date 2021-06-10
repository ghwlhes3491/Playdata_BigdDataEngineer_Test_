package com.work.static_test;

/**
 * 회원도메인 클래스
 * 1. 회원아이디 memberId
 * 2. 회원이름 name
 * 3. 회원휴대폰 mobile
 * 
 * # 설계규칙
 * 1. encapsulation
 * 2. 생성자 중복 정의 : 기본 전체
 * 3. toString(), equals(), hashCod() 재정의 : 아이디 같으면 같은 객체 
 * @author 김현진
 *
 */
public class SimpleMember {
	
	//Static이 붙으면? Class 변수 - 객체 생성 없이 사용가능, 모든 객체가 공유하는 변수
	public static int classcount;	
	
	// instance 변수 : 객체를 생성 후 참조변수명을 통해서 해당 객체에 사용하는 변수
	public int instancecount;
	
	//static block 초기화 **정확히 이해필요***
	static {
		classcount = 1234567;
		System.out.println(classcount + "클래스가 로드될 때(프로그램시작) 딱 한번반 수행");
	}
	
	//instance block 초기화(-> 실무에서 쓸 일은 X)=> 생성자 중복 정의 사용
	{
		System.out.println("객체 생성할 때마다 수행");
	}
	
	
	/** 회원아이디 memberId */
	private String memberId;
	/**회원이름 name*/
	private String name;
	/**회원 휴대폰 mobile*/
	private String mobile;
	
	public SimpleMember() {
		System.out.println("생성자 : 객체 생성시 수행");
	}
	
	/**
	 * @param memberId
	 * @param name
	 * @param mobile
	 */
	public SimpleMember(String memberId, String name, String mobile) {
		this.memberId = memberId;
		this.name = name;
		this.mobile = mobile;
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
		SimpleMember other = (SimpleMember) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
	
	
	
}
