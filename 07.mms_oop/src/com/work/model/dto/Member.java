package com.work.model.dto;
/**
 * <pre>
 * ȸ�� ������ Ŭ����
 * -- encapsulation  
 *  #ȸ�� ���� ����
 *  1. id : 6�ڸ� �̻� ~ 30�ڸ� ����
 *  2. pw : 6�ڸ� �̻� ~ 20�ڸ� �̸�
 *  3. ���ϸ��� : 0~100000
 *  4. ��� : G, S, Access	
 * 		>> ���ڿ� �� �޼���		
 * 		>> String
 * 		>> equals(Object anObject) : boolean
 * </pre>
 * @author ������
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
	 * �⺻ ������
	 */
	public Member() {
	}

	/**
	 * ������Է� ������ �ʱ�ȭ ������
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸�
	 * @param mobile �޴���
	 * @param email �̸���
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email) {
		//this(); �ƹ��͵� ���ϴϱ� ���� ���ٿ� �ʿ� ����.
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	/**
	 * �ʼ� ������ �ʱ�ȭ ������ 
	 * @param memberId ���̵�
	 * @param memberPw ��й�ȣ
	 * @param name �̸�
	 * @param mobile �޴���
	 * @param email �̸���
	 * @param entryDate ������
	 * @param grade	���
	 */
	public Member(String memberId, String memberPw, String name, String mobile, String email, String entryDate,
			String grade) {
		this(memberId, memberPw, name,mobile, email);
		this.entryDate = entryDate;
		this.grade = grade;
	}

	/**
	 * ��ü������ �ʱ�ȭ ������
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
	 * ���̵� ������Ģ :
	 * -- �ּ� 6�ڸ�, �ִ� 30�ڸ�
	 * -- ���ڿ��� ���� �޼��� {@link String#length()}
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		//���� ���� �޼��� ȣ�⹮ 
		boolean result = isMemberId(memberId);
		if(result) {
			this.memberId = memberId;
		}else {
			System.out.println("[����]���̵�� 6~30�ڸ� �̳��� �Է��ϼ���.");
		}
		
	}
	//
	/**
	 * ���̵� ���� �޼��� ���� 
	 * @param memberId ���̵�
	 * @return ���̵� ���̰� 6~30 �ڸ� �̳��� true, �׷��� ������  false
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
			return;		//true�� ���⼭ �ٷ� �����
		}
			System.out.println("[����]��й�ȣ�� 6~30�ڸ� �̳��� �Է��ϼ���.");
	}
	
	/**
	 * ��й�ȣ ���� �޼���
	 * ������Ģ : ���� - 6�ڸ� ~ 20�ڸ�
	 * @param memberPW ���� ��й�ȣ
	 * @return ������Ģ �ùٸ��� true �ùٸ��������� false
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
			System.out.println("[����] ����� 'G','S','A'�� �Է°����մϴ�.");
		}
	}
	/**
	 * ��� ���� �޼���
	 * ������Ģ : G, S, A
	 * @param grade ���� ��� 
	 * @return
	 */
	private boolean isGrade(String grade) {
		 return grade.equals("G") || grade.equals("S") || grade.equals("A");
		 //return this.grade.equals("G") || this.grade.equals("S") || this.grade.equals("A") �ȵ�.
		
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
		System.out.println("[����] ���ϸ����� ���� 0~100000������ �� �Դϴ�.");
	
	}
	/**
	 * ���ϸ��� ���� �޼���
	 * @param mileage ���� ���ϸ���
	 * @return �ùٸ���  true, �ùٸ��� ������ false
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
	//���������� ������ java.lang.Object#toString()��� �޼��带 �״�� ���
	
	//������ �ϸ� => �������� ����� ���ڿ� ��ȯ
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
		if (this == obj) {		//obj�� �װ� �����ִ� ��(this?)�� ������?
			return true;	//���� ��ü�� ���� ���� ��ü�� ������ true ����
		}
		if (obj == null)		//(��ü Ÿ�Կ� null�� ���� �� �ִ�. )
			return false;		// null���� ������ false
		//null�̶� ��� ��ü�� �������� �ʴ� ����!!!
		
		if (getClass() != obj.getClass())	//getClass()�� ����? Ŭ�������� ����������
			return false;	
		
		Member other = (Member) obj;
		if (memberId == null) {		//memberId�� ���ڿ�
			if (other.memberId != null)	
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true; 		//memberId�� null�� �ƴϰ� ���� ��� true�̸� true�� ���
	}
	

	
	
	
	
	
	
	
	
	
		

}
