package com.work.view;

import com.work.model.dto.Member;

public class Test {
	/* encapsulation �׽�Ʈ */
	public static void main(String[] args) {
		Member dto = new Member("A210526","12345","������","01012341234","A210526@gmail.com");
		System.out.println("������ : " + dto);
		//���̵� ���� : ������� ���� ���� �Ұ�
		//dto.memberId = "aaa"; // ���ٱ��� private����, �ܺο��� ���� ���� �Ұ�
		
		// ���̵� ���� : setter()
		// �ùٸ� ���̵� ���� ��Ģ �ؼ�
		dto.setMemberId("happayday2021");
		System.out.println("���̵� ������ : " + dto);
		
		dto.setMemberId("test");
		System.out.println("���̵� ������ : " + dto);
		
		dto.setMemberPw("21");
		System.out.println("��й�ȣ ������ : " + dto);
		
		dto.setMileage(21);
		System.out.println("���ϸ��� ������ : " + dto);
		
		dto.setGrade("21");
		System.out.println("��� ������ : " + dto);
		
		
	}
	/* toString()�޼��� ������ �� ��� �׽�Ʈ */
	public static void main1(String[] args) {
		// ȸ���� ���Խ� �Էµ����� �ʱ�ȭ ������ �̿��ؼ� ��ü ����
		// ���� : ���̵�, ��й�ȣ, �̸�, �޴���, �̸���
		Member dto = new Member("A210526","12345","������","01012341234","A210526@gmail.com");
		
		// ������ ȸ����ü�� ������ ���
		// System.out.println(����������); =>�ڵ�����  ����������.toString() ���� ��� ���ڿ� �ܼ�â ���
		// toString()�޼��� ��������
		//System.out.println(dto.toString());
		System.out.println(dto);
	}
}
