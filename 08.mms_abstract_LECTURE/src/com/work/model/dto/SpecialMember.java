/**
 * 
 */
package com.work.model.dto;

/**
 * <pre>
 * ��� ȸ�� ������ Ŭ���� 
 * -- ȸ��(�θ�Ŭ����)�� �ڽ�(���)
 * 
 * # ���ȸ�� �Ӽ�
 * 1. ���̵�
 * 2. ��й�ȣ
 * 3. �̸�
 * 4. �޴���
 * 5. �̸���
 * 6. ������
 * 7. ���
 * 
 * 8. �����
 *  
 * </pre>
 * @author ������
 * @version ver.1.0
 * @since jdk1.8
 */
public class SpecialMember extends Member {
	/** ���ȸ�� ����� */
	private String manager;
	
	/** �⺻������ */
	public SpecialMember() {}

	/**
	 * ȸ�� �Է� �ʼ������� �ʱ�ȭ ������
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸� 
	 * @param mobile �޴���
	 * @param email �̸���
	 */
	public SpecialMember(String memberId, String memberPw, String name, String mobile, String email) {
		setMemberId(memberId);
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
		
		setGrade("S");
		setEntryDate("2021-05-26");
	}

	/**
	 * ���ȸ�� ��絥���� �ʱ�ȭ ������
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸� 
	 * @param mobile �޴���
	 * @param email �̸���
	 * @param entryDate ������
	 * @param grade ���
	 * @param manager �����
	 */
	public SpecialMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String manager) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.manager = manager;
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

	@Override
	public String toString() {
		return super.toString() + ", " + manager;
	}

	
}