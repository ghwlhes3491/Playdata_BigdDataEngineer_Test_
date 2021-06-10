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
 * </pre>
 * @author ������
 * @version ver.1.0
 * @since jdk1.8
 */
   public class GeneralMember extends Member {
      /** �Ϲ�ȸ�� ���ϸ��� */
      private int mileage;
      
      
      /** �⺻������ */
      public GeneralMember() {
      
      }

      /**
       * ȸ�� �Է� �ʼ������� �ʱ�ȭ ������
       * @param memberId ���̵�
       * @param memberPw ��й�ȣ
       * @param name �̸�
       * @param mobile �޴���
       * @param email �̸���
       */
   public GeneralMember(String memberId, String memberPw, String name, String mobile, String email) {
      
      //�ڽİ�ü�� �����ڿ��� �θ�ü�� �����ڸ� ������ => javac �ڵ����� �θ��� �⺻������ super() �ڵ� ���� ȣ�����
      
      // �ڽİ�ü�� �����ڿ��� �θ�ü�� �����ڸ� ��������� ����
//      super(memberId, memberPw, name, mobile, email);
      
      // �θ��� private ����� ���ٱ������� ���ؼ� �ڽ�Ŭ���������� ���� �Ұ�
//      super.memberId = memberId;
      
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
      public GeneralMember(String memberId, String memberPw, String name, String mobile, String email,
            String entryDate, String grade, int mileage) {
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

   @Override
   public String toString() {	//���ڿ� ��ȯ�ϵ��� �Ѱ�
	   //�θ�κ����� �������� ����� private�̸� ���� �״�� ������ �� ����
      return "[�Ϲ��ڽ�] "+ getMemberId() + ", " + getMemberPw() + ", " + getName() + ", " + getMobile() 
      			+ ", " + getEmail() + ", " + getEntryDate() + ", " + getGrade()
				+ ", " +  getManager()  + ", " + mileage;

	//�̰� ���� �ǹ�? �ڿ� ���� ������ �ϴ� �ǰ�?
   }
   

}