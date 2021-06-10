/**
 * 
 */
package com.work.model.dto;

/**
 * <pre>
 * �Ϲ� ȸ�� ������ Ŭ���� 
 * -- ȸ��(�θ�Ŭ����)�� �ڽ�(���)
 * 
 * # �Ϲ�ȸ�� �Ӽ�
 * 1. ���̵�
 * 2. ��й�ȣ
 * 3. �̸�
 * 4. �޴���
 * 5. �̸���
 * 6. ������
 * 7. ���
 * 
 * 8. ���ϸ���
 *  
 * </pre>
 * @author ������
 * @version ver.1.0
 * @since jdk1.8
 */
public class GeneralMember extends Member {
	/** �Ϲ�ȸ�� ���ϸ��� */
	private int mileage;
	
	/** �⺻������ */
	public GeneralMember() {}

	/**
	 * ȸ�� �Է� �ʼ������� �ʱ�ȭ ������
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸� 
	 * @param mobile �޴���
	 * @param email �̸���
	 */
	public GeneralMember(String memberId, String memberPw, String name, String mobile, String email) {
		setMemberId(memberId);
		setMemberPw(memberPw);
		setName(name);
		setMobile(mobile);
		setEmail(email);
		
		setGrade("G");
		setEntryDate("2021-05-26");
	}

	/**
	 * �Ϲ�ȸ�� ��絥���� �ʱ�ȭ ������
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸� 
	 * @param mobile �޴���
	 * @param email �̸���
	 * @param entryDate ������
	 * @param grade ���
	 * @param mileage ���ϸ���
	 */
	public GeneralMember(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade, int mileage) {
		super(memberId, memberPw, name, mobile, email, entryDate, grade);
		this.mileage = mileage;
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
		this.mileage = mileage;
	}

	// java.lang.Object#toString():String
	@Override
	public String toString() {
		return getMemberId() + ", " + getMemberPw() + ", " + getName() + ", " + getMobile() + ", " + getEmail() + ", " + getEntryDate() + ", "
				+ getGrade() + ", " + mileage;
	}
	
}







