package com.work.model.dto;

/**
 * @author ������
 *
 */
public class SpecialMember extends Member {
   /** ���ȸ�� ����� */
   private String manager;
   
   
   /** �⺻������ */
   public SpecialMember() {
      System.out.println("�Ϲ� �ڽ� �⺻������");
   }

   /**
    * ȸ�� �Է� �ʼ������� �ʱ�ȭ ������
    * @param memberId ���̵�
    * @param memberPw ��й�ȣ
    * @param name �̸�
    * @param mobile �޴���
    * @param email �̸���
    */
public SpecialMember(String memberId, String memberPw, String name, String mobile, String email) {
   
   //�ڽİ�ü�� �����ڿ��� �θ�ü�� �����ڸ� ������ => javac �ڵ����� �θ��� �⺻������ super() �ڵ� ���� ȣ�����
   
   // �ڽİ�ü�� �����ڿ��� �θ�ü�� �����ڸ� ��������� ����
//   super(memberId, memberPw, name, mobile, email);
   
   // �θ��� private ����� ���ٱ������� ���ؼ� �ڽ�Ŭ���������� ���� �Ұ�
//   super.memberId = memberId;
   
   // �θ�κ��� ��ӹ��� setter() �޼��带 �̿��ؼ� ������ �ʱ�ȭ ���� ����
   setMemberId(memberId);
   setMemberPw(memberPw);
   setName(name);
   setMobile(mobile);
   setEmail(email);
   
   setGrade("S");
   setEntryDate("2021-05-25");
   
   System.out.println("�ڽ� �Ϲ� �Է��ʼ������� �ʱ�ȭ������");

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
   public SpecialMember(String memberId, String memberPw, String name, String mobile, String email,
         String entryDate, String grade, String manager) {
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
		return super.toString() + "," + manager;
		 
	}
   	
   
}