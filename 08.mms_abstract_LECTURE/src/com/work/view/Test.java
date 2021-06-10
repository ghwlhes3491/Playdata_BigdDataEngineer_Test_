package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;
import com.work.model.service.MemberService;

public class Test {
	
	public static void main(String[] args) {
		Member dto1 = new GeneralMember("user01", "password01", "ȫ�浿", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user02", "password02", "������", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "�̼���", "01012343000", "user03@work.com", "2020-11-15", "S", "������");
		Member dto4 = new SpecialMember("user04", "password04", "������", "01012344000", "user04@work.com", "2021-01-05", "S", "���ϸ�");
		Member dto5 = new AdminMember("administrator", "admin1004", "������", "01012345000", "administrator@work.com", "2020-04-01", "A", "����");
	
		// MemberServiceAbstract service = new MemberServiceAbstract();
		// error : Cannot instantiate the type MemberServiceAbstract
		// ���� : �߻�Ŭ������ ���� ��ü�����Ұ� 
		
		// ȸ������ ���񽺸� �̿��ϱ����� ������ü ����
		//System.out.println("\n### ȸ������ ���� �̿����� ��ü����");
		print("ȸ������ ���� �̿����� ��ü ����");
		MemberService service = new MemberService();

		print("ȸ�����");
		service.addMember(dto1);
		service.addMember(dto2);
		service.addMember(dto3);
		service.addMember(dto4);
		service.addMember(dto5);
		
		service.addMember(dto2); // ����?? => �ذ� => ��ϵ�������
		service.addMember(dto2); // ����?? => �ذ� => ��ϵ�������
		
		print("����ο��� : " + service.getCount());
		
		print("user01 ����ȸ");
		Member dto = service.getMember("user01");
		if (dto != null) {
			System.out.println(dto); // virtual method invocation : ���� �ڽİ�ü�� �������� toString() ������ ���
		}
		
		print("user02 ����ȸ");
		dto = service.getMember("user02");
		if (dto != null) {
			System.out.println(dto); // virtual method invocation : ���� �ڽİ�ü�� �������� toString() ������ ���
		}
		
		print("��ü��ȸ");//�迭 ��� �������?
		Member dto[] = service.getMember();
		for(int index = 0 ; index < service.getCount(); index++) {
			dto[index] = service.getMember();
			System.out.println(dto[index]);
		}
		
		print("ȸ������ ��ü����");

		print("��ȣ����");
		

		print("ȸ��Ż��");
		
		print("ȸ����üŻ��(�迭��� �ʱ�ȭ)");
		
		print("ȸ�� �ʱ�ȭ ���");
		
	}
	
	/** �׽�Ʈ�ÿ� ������� �޼��� */
	public static void print(String message) {
		System.out.println("\n### " + message);
	}
	
}
