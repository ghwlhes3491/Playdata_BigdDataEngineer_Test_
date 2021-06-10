/**
 * 
 */
package com.work.model.dto;

/**
 * <pre>
 * ������ ȸ�� ������ Ŭ���� 
 * -- ȸ��(�θ�Ŭ����)�� �ڽ�(���)
 * 
 * # ������ȸ�� �Ӽ�
 * 1. ���̵�
 * 2. ��й�ȣ
 * 3. �̸�
 * 4. �޴���
 * 5. �̸���
 * 6. ������
 * 7. ���
 * 
 * 8. ��å
 *  
 * </pre>
 * @author ������
 * @version ver.1.0
 * @since jdk1.8
 */
public class AdminMember extends Member {
	/** ������ȸ�� ��å */
	private String position;
	
	/** �⺻������ */
	public AdminMember() {}

	/**
	 * ȸ�� �Է� �ʼ������� �ʱ�ȭ ������
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸� 
	 * @param mobile �޴���
	 * @param email �̸���
	 */
	public AdminMember(String memberId, String memberPw, String name, String mobile, String email) {
		setMemberId(memberId);
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
		
		setGrade("S");
		setEntryDate("2021-05-26");
	}

	/**
	 * ������ȸ�� ��絥���� �ʱ�ȭ ������
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸� 
	 * @param mobile �޴���
	 * @param email �̸���
	 * @param entryDate ������
	 * @param grade ���
	 * @param position ��å
	 */
	public AdminMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, String position) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.position = position;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + position;
	}

}
