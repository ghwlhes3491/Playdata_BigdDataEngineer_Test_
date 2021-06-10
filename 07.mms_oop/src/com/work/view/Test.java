package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class Test {
	//instanceof, typecasting, virtual method invocation �׽�Ʈ
	public static void main(String[] args) {
		//ȸ�� �ʱ�ȭ������ �����ؼ� ȸ�� 5�� ��ü ����
		// �������� Ÿ���� �θ�Ÿ�� : ���� ������ 
		Member dto1 = new GeneralMember("user01","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
		System.out.println(dto1.toString());//�ڽ��� �������س��� �ڽ��� toString()ȣ�� ���� >>>,5000����<<<<
		dto1.getMemberId();
		//dto1.getMileage();// ���� �ȵǾ�� �ϴµ� �� ��?
		//error : �θ�Ÿ���� ���������� �ڽ��� ��� ���� �Ұ�
		
		//���� �޸ӷο� ������ �ڽİ�üŸ������ ����ȯ => ���� �ڽİ�ü�� ��� ���� ����
		
		GeneralMember g1 = (GeneralMember)dto1;
		System.out.println(g1.toString());//�ڽ��� �������س��� �ڽ��� toString()ȣ�� ����
		//virtual method invocation
		// �������� �޼���� �θ�Ÿ���� ������������ ���� �������� �ڽ��� ������ �ż��带 ȣ�� ����
		// �ڽ��� �������� �޼���� (�θ�Ϳ� �־) ������ �ڽİ��� �����Ѵ�.
		g1.getMileage();
		
		// ����ȯ�ϱ� ���� �ش� Ŭ������ ��ü(instance)���� üũ
		if(dto1 instanceof AdminMember) {
		// ������ ok: ���� üũ 
			AdminMember a1 = (AdminMember)dto1;
			// ���� error - java.lang.ClassCastException: 
			// com.work.model.dto.GeneralMember cannot be cast to com.work.model.dto.AdminMember
			// at com.work.view.Test.main(Test.java:29)
			a1.getPosition();
		}else {
			System.out.println("[����] �ش� Ŭ������ �ν��Ͻ��� �ƴմϴ�");
		}
		Member dto2 = new GeneralMember("user02","password01","������","01012342000","user02@work.com","2021-01-05","G",950000);
		
		Member dto3 = new SpecialMember("user03","password01","�̼���","01012343000","user03@work.com","2020-11-15","S","������");
		Member dto4 = new SpecialMember("user04","password01","������","01012344000","user04@work.com","2021-01-05","S","���ϸ�");
	
		Member dto5 = new AdminMember("administrator","admin1004","������","01012345000","administrator@work.com","2021-04-01","A","����");

		
	}
	//������ �׽�Ʈ
	public static void main2(String[] args) {
		Member dto1 = new Member("user01","password01","ȫ�浿","01011111111","�̸���1");
		System.out.println(dto1);	//�Ŭ������ toString() ��� ��������?�θ� : �θ� ������
		//toString()���������� �ʴ� ��� : com.work.model.dto.Member@15db9742
		
		//�Ϲ�ȸ����ü ����
		Member dto2 = new GeneralMember("user02","password02","ȫ�浿2","01022222222","�̸���2");
		System.out.println(dto2); //�Ŭ������ toString() ��� ��������?�Ϲ��ڽ�(general) : �ڽ� ������
		
		//Member dto3 = new SpecialMember("user02","password02","ȫ�浿2","01022222222","�̸���2","a");
	}
	//�θ�Ÿ���� ������ : ��� �ڽİ�ü�� ����(����)����
	public static void main1(String[] args) {
		
	
	//ok :����Ÿ�� �ڵ��Ҵ�	: ������ ����Ÿ��
	Member dto1 = new Member();
	//ok : �θ�Ÿ��(���) : ūŸ��
	Member dto2 = new GeneralMember();
	//ok : �θ�Ÿ��(���) : ūŸ��
	Member dto3 = new SpecialMember();
	//error : �ٸ�Ÿ��, ����(�ڽ�)Ÿ��. ��, �θ�ü�� �ڽİ�ü�� ����(����) �Ұ�.
	//GeneralMember dto4 = new Member();

	//error : �ٸ�Ÿ��, ��ӱ���X
	//GeneralMember dto5 = new AdminMember();
	}
}
