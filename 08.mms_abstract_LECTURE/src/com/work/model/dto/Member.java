package com.work.model.dto;

/**
 * <pre>
 * ȸ�� ������ Ŭ���� 
 * -- encapsulation ���� �ݿ� ����
 * ## ȸ�� ��������
	1. ���̵� : 6�ڸ� ~ 30�ڸ� �̳�
	2. ��й�ȣ : 6�ڸ� ~ 20�ڸ� �̳�
	3. ���ϸ��� : 0 ~ 100,000 
	4. ��� : G, S, A
	>> ���ڿ� �� �޼���
	>> String
	>> equals(Object anObject) : boolean
 * 
 * -- inheritance ���� �ݿ� ����
 * 	>> ��� ȸ������ ����(�Ϲ�ȭ) : �θ� Ŭ���� ���� ����
 * 	1. ���̵�
 * 	2. ��й�ȣ
 * 	3. �̸�
 * 	4. �޴���
 * 	5. �̸���
 * 	6. ������
 * 	7. ���
 * 
 * </pre>
 * @author ������
 * @version ver.1.0
 * @since jdk1.8
 */
public class Member {
	/** ���̵�, �ĺ�Ű */
	private String memberId;
	
	/** ��й�ȣ, �ʼ� */
	private String memberPw;
	
	/** �̸�, �ʼ� */
	private String name;
	
	/** �޴���, �ʼ�, ���� 01012341234 */
	private String mobile;
	
	/** �̸���, �ʼ� */
	private String email;
	
	/** ������, �ʼ�, ���� 2021-05-26, �ý��� ���糯¥ ���� */ 
	private String entryDate;
	
	/** ���, �ʼ�, �Ϲ�(G), ���(S), ������(A), �ý��� ���� */
	private String grade;
	
	
	/** �⺻������ */
	public Member() {}

	/**
	 * ������Է� �ʼ������� �ʱ�ȭ ������ : ���̵�, ��й�ȣ, �̸�, �޴���, �̸���
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸�
	 * @param mobile �޴���
	 * @param email �̸���
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * ȸ�� �ʼ������� �ʱ�ȭ ������ : �Է��ʼ������� + ������, ���
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸�
	 * @param mobile �޴���
	 * @param email �̸���
	 * @param entryDate ������
	 * @param grade ���
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade) {
		this(memberId, memberPw, name, mobile, email);
		this.entryDate = entryDate;
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
		this.grade = grade;
	}

// 	���������� ������ java.lang.Object#toString() ��� �޼��带 �״�� ���
//  getClass().getName() + '@' + Integer.toHexString(hashCode())
	
	// �������ϸ� => �������� ����� ���ڿ� ��ȯ
	@Override
	public String toString() {
		return memberId + ", " + memberPw + ", " + name + ", " + mobile + ", " + email + ", " + entryDate + ", "
				+ grade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		return result;
//		return 1004;
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
	
}

