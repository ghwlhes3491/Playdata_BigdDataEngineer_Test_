package com.work.view;

import com.work.model.dto.GeneralMember;

public class Test {
	/* in �׽�Ʈ */
	public static void main(String[] args) {
		// �Ϲ�ȸ�� �ڽİ�ü ���� ���� : �θ� �޸��Ҵ� => �ڽ� �޸��Ҵ�
		GeneralMember g1 = new GeneralMember("user01","password01","ȫ�浿","01012341234","user01@work.com");
		
		System.out.println(g1.getMemberId()); //Member �θ�κ��� ��ӹ��� �޼���
		System.out.println(g1.getName());
	}
}
