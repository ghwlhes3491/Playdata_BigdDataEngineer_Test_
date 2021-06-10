package com.work.model.service;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

/**
 * ȸ���� �����ϱ� ���� ���� Ŭ���� (�߻�Ŭ���� ���� ����)
 * - �߻�Ŭ���� ������� 
 * 	>> Ŭ���� ������� + [�߻�޼���]
 * 
 * -- ȸ������ �����ϱ� ���� �ڷ� ���屸�� : �迭, ������ �ݿ�(�θ�Ÿ������)
 * -- �޼����� argument ������ �ݿ�(�θ�Ÿ��), ��ȯŸ��??
 * -- �޼����(�Ű�����) : ��ȯŸ��
 * 
 * -- C (���)
 * -- R (��ȸ)
 * 		==> ������ȸ(����ȸ) => ID
 * 		==> ������ȸ(��ü��ȸ, �׷���ȸ) => ��ü��ȸ(), ��޺�ȸ����ü��ȸ(���)
 * -- U	(����)
 * 		==> ��ü����() 
 * 		==> �κк���(��й�ȣ����)
 * -- D	(����)
 * 		==> ��ü����
 * 		==> Ư������ : ���̵�(�ش�ȸ��������)
 * @author ������
 *
 */
public abstract class MemberServiceAbstract {
	
	 
	/**
	 * ȸ�����
	 * -- �޼����
	 * -- �Ű�����	 : ????? �������ݿ� ���ȸ���� ����ϱ� ���� �޼���
	 * -- ��ȯŸ��
	 */
	 
	 //public void addMember(); // This method requires a body instead of a semicolon
	 public abstract void addMember(Member dto);
	 
	 /**
	  * CRUD �޼��忡�� ����ϱ� ���� ȸ�� �������� �� ������ġ ��ȸ �޼���
	  * @param memberId ���̵�
	  * @return ����ÿ� ������ġ ��ȣ, ������� -1
	  */
	 public abstract int exist(String memberId);

	 /**
	  * ����ȸ
	  * -- �޼���� : getMember()
	  * -- �Ű����� : memberId
	  * -- ��ȯŸ�� : Member (��ȯŸ�Դ����� : �θ�Ÿ��)
	  */
	 
		/**
		 * ��ü��ȸ
		 * -- �޼���� : getMember()
		 * -- �Ű�����	 : no argument
		 * -- ��ȯŸ�� : ���� ��ϵ� ��� ȸ������ �������� ������ �迭, ������ Member[]
		 */
	 
		/**
		 * ȸ������ ��ü����
		 * -- �޼���� : setMember()
		 * -- �Ű�����	 : member
		 * -- ��ȯŸ�� : void / ���� �߻� �� �޼��� ó��
		 */
	 
		/**
		 * ȸ�� ��й�ȣ ����
		 * -- �޼���� : setMemberPw()
		 * -- �Ű�����	 : ���̵�, ��й�ȣ, �����й�ȣ
		 * -- ��ȯŸ�� : boolean -��ȣ���� �����ϸ�  true, ���н� false
		 */
	 
		/**
		 * ȸ�� Ż��	(ȸ�� ��й�ȣ ���� �ڵ�� ���� ��ġ��)
		 * -- �޼���� : removeMember()
		 * -- �Ű�����	 : ���̵�, ��й�ȣ
		 * -- ��ȯŸ�� :  void
		 */
	 
		/**
		 * ȸ�� ��ü Ż��
		 * -- �޼���� : removeMember()
		 * -- �Ű�����	 : no argument
		 * -- ��ȯŸ�� : void
		 */
	public abstract Member getMember(String memberId);
	private MemberServiceAbstract[] members;
	
	public MemberServiceAbstract() {};
	
	public MemberServiceAbstract(String memberId, String memberPw, String name, String mobile, String email) { 
		
	}
	public MemberServiceAbstract(int length) {
		members = new MemberServiceAbstract[length];
	}
	

	
	
	/**
	 * �ʱ�ȸ����� �޼���
	 */
	public void initMember() {
		Member dto1 = new GeneralMember("user01","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
		Member dto2 = new GeneralMember("user02","password01","������","01012342000","user02@work.com","2021-01-05","G",950000);
		
		Member dto3 = new SpecialMember("user03","password01","�̼���","01012343000","user03@work.com","2020-11-15","S","������");
		Member dto4 = new SpecialMember("user04","password01","������","01012344000","user04@work.com","2021-01-05","S","���ϸ�");
	
		Member dto5 = new AdminMember("administrator","admin1004","������","01012345000","administrator@work.com","2021-04-01","A","����");

	}
}
