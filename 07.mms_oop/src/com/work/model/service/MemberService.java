package com.work.model.service;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

/**
 * ȸ���� �����ϱ� ���� ���� Ŭ����
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
public class MemberService {
	/**
	 * ȸ������ �����ϱ����� �ڷ����� ���� : �迭, ������ �ݿ�(�θ�Ÿ������)
	 * ������ ����ʱ�ȭ, ȭ��, ���� ������ ���� �������� ����
	 * 
	 */
	
	/**
	 * ȸ�����
	 * -- �޼����
	 * -- �Ű�����
	 * -- ��ȯŸ��
	 */
	
	/**
	 * ��ü��ȸ
	 * -- �޼����
	 * -- �Ű�����
	 * --- ��ȯŸ��
	 */
	private MemberService[] members;
	
	public MemberService() {};
	
	public MemberService(String memberId, String memberPw, String name, String mobile, String email) { 
		
	}
	public MemberService(int length) {
		members = new MemberService[length];
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
