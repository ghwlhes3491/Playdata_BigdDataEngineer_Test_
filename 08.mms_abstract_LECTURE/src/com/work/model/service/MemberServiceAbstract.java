package com.work.model.service;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

/**
 * ȸ���� �����ϱ� ���� ���� Ŭ���� (�߻�Ŭ���� ���� ����)
 * -- �߻�Ŭ���� �������
 * 	>> Ŭ���� ������� + [�߻�޼���]
 * 
 * -- ȸ������ �����ϱ� ���� �ڷ����屸�� : �迭 ������ �ݿ�(�θ�Ÿ��)
 * -- �޼��� �ƱԸ�Ʈ ������(�θ�Ÿ��), ��ȯŸ��??
 * 
 * -- �޼����(�Ű�����): ��ȯŸ��
 * 
 * -- C(���) 
 * 
 * -- R(��ȸ)
 * 	=> ������ȸ(����ȸ) => ���̵�
 * 	=> ������ȸ(��ü��ȸ, �׷���ȸ) => ��ü��ȸ(), ��޺�ȸ����ü��ȸ(���)
 * -- U(����)
 * 	=> ��ü����()
 * 	=> �κк���(��й�ȣ����)
 * -- D(����)
 * 	=> ��ü����
 * 	=> Ư������ : ���̵�
 */
public abstract class MemberServiceAbstract {
	
	/** 
	 * ȸ����� 
	 * -- �޼���� addMember()
	 * -- �Ű����� : ????? �������ݿ� ���ȸ���� ����ϱ����� �޼���
	 * -- ��ȯŸ�� : void
	 */
	public abstract void addMember(Member dto); // This method requires a body instead of a semicolon
	
	/**
	 * CRUD �޼��忡�� ����ϱ� ���� ȸ�� �������� �� ���� ��ġ ��ȸ �޼���
	 * @param memberId ���̵�
	 * @return ����ÿ� ������ġ��ȣ, ������� -1
	 */
	public abstract int exist(String memberId);
	
	/** 
	 * ����ȸ 
	 * -- �޼���� : getMember()
	 * -- �Ű����� : memberId
	 * -- ��ȯŸ�� : Member (��ȯŸ�Դ����� : �θ�Ÿ��)
	 */
	public abstract Member getMember(String memberId);

	/** 
	 * ��ü��ȸ 
	 * -- �޼���� : getMember()
	 * -- �Ű����� : no argument
	 * -- ��ȯŸ�� : ���� ��ϵ� ��� ȸ������ �������� ������ �迭, ������ Member[]
	 */
	public abstract Member getMember();
	
	
	/** 
	 * ȸ������ ��ü���� 
	 * -- �޼���� : setMember()
	 * -- �Ű����� : Member
	 * -- ��ȯŸ�� : void / �����߻��� �޼��� ó�� 
	 */
	public abstract void setMember();
	
	/** 
	 * ȸ�� ��й�ȣ ���� 
	 * -- �޼���� : setMemberPw()
	 * -- �Ű����� : ���̵�, ��й�ȣ, �����й�ȣ
	 * -- ��ȯŸ�� : boolean ��ȣ���漺�� true, �����ϸ� false
	 */
	public abstract void setMemberPw(String memberId, String memberPw);
	
	/** 
	 * ȸ��Ż�� 
	 * -- �޼���� : removeMember()
	 * -- �Ű����� : ���̵�, ��й�ȣ
	 * -- ��ȯŸ�� : void
	 */
	public abstract void removeMember(String memberId, String memberPw);
	
	/** 
	 * ȸ����üŻ�� 
	 * -- �޼���� : removeMember()
	 * -- �Ű����� : no argument
	 * -- ��ȯŸ�� : void
	 */
	public abstract void removeMember();
	
	/**
	 * �ʱ�ȸ�� ��� �޼���
	 */
	public void initMember() {
		Member dto1 = new GeneralMember("user01", "password01", "ȫ�浿", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user02", "password02", "������", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "�̼���", "01012343000", "user03@work.com", "2020-11-15", "S", "������");
		Member dto4 = new SpecialMember("user04", "password04", "������", "01012344000", "user04@work.com", "2021-01-05", "S", "���ϸ�");
		Member dto5 = new AdminMember("administrator", "admin1004", "������", "01012345000", "administrator@work.com", "2020-04-01", "A", "����");
	}

}


