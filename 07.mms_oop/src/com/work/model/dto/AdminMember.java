/**
 * 
 */
package com.work.model.dto;

/**
 * @author ������
 *
 */
public class AdminMember extends Member {
   /** ������ ��å */
   private String position;
   
   
   /** �⺻������ */
   public AdminMember() {
   
   }

   /**
    * ȸ�� �Է� �ʼ������� �ʱ�ȭ ������
    * @param memberId ���̵�
    * @param memberPw ��й�ȣ
    * @param name �̸�
    * @param mobile �޴���
    * @param email �̸���
    */
public AdminMember(String memberId, String memberPw, String name, String mobile, String email) {
   
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
   
   setGrade("G");
   setEntryDate("2021-05-25");
   
}

    /**
    * ������ ��絥���� �ʱ�ȭ ������
    * @param memberId ���̵�
    * @param memberPw ��й�ȣ
    * @param name �̸�
    * @param mobile �޴���
    * @param email �̸���
    * @param entryDate ������ 
    * @param grade ���
    * @param position ��å
    */
   public AdminMember(String memberId, String memberPw, String name, String mobile, String email,
         String entryDate, String grade, String position) {
      super(memberId, memberPw, name, mobile, email, entryDate, grade);
      this.position = position;
   }

   /**
    * @return the manager
    */
   public String getPosition() {
      return position;
   }

   /**
    * @param manager the manager to set
    */
   public void setPosition(String position) {
      this.position = position;
   }
   
	@Override
	public String toString() {
		return super.toString() + "," + position;
		 
	}
   
   
}