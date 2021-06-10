package com.work.static_test;

/**
 * ȸ�������� Ŭ����
 * 1. ȸ�����̵� memberId
 * 2. ȸ���̸� name
 * 3. ȸ���޴��� mobile
 * 
 * # �����Ģ
 * 1. encapsulation
 * 2. ������ �ߺ� ���� : �⺻ ��ü
 * 3. toString(), equals(), hashCod() ������ : ���̵� ������ ���� ��ü 
 * @author ������
 *
 */
public class SimpleMember {
	
	//Static�� ������? Class ���� - ��ü ���� ���� ��밡��, ��� ��ü�� �����ϴ� ����
	public static int classcount;	
	
	// instance ���� : ��ü�� ���� �� ������������ ���ؼ� �ش� ��ü�� ����ϴ� ����
	public int instancecount;
	
	//static block �ʱ�ȭ **��Ȯ�� �����ʿ�***
	static {
		classcount = 1234567;
		System.out.println(classcount + "Ŭ������ �ε�� ��(���α׷�����) �� �ѹ��� ����");
	}
	
	//instance block �ʱ�ȭ(-> �ǹ����� �� ���� X)=> ������ �ߺ� ���� ���
	{
		System.out.println("��ü ������ ������ ����");
	}
	
	
	/** ȸ�����̵� memberId */
	private String memberId;
	/**ȸ���̸� name*/
	private String name;
	/**ȸ�� �޴��� mobile*/
	private String mobile;
	
	public SimpleMember() {
		System.out.println("������ : ��ü ������ ����");
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
