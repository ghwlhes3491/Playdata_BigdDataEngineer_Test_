package com.work.static_test;

public class StaticTest {
	//class �������(static)
	public static String classTitle = "�����Ͱ���";
	
	//instance �������
	public String instanceTitle = "�ڹ����α׷���";
	
	public static void main(String[] args) {
		System.out.println(classTitle);
		// static ����� �׳� ��� ����
		
		//System.out.println(instanceTitle); 
		//error : Cannot make a static reference to the non-static field instanceTitle
		StaticTest test = new StaticTest();
		System.out.println(test.instanceTitle);
		// ���� Ŭ������ �ִ� instance ����� static �޼��忡���� �ݵ�� ��������� ���� �� ���������� ���ؼ� ���
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.PI);
	}
	
	public void instanceMethod() {
		System.out.println(instanceTitle);
		//ok : ���� Ŭ������ �ִ� instance ��������� �׳� ȣ�� ��� ����
		//		(�޸� �ε������� �����ϰ� �Բ� �̷����)
	}
			
	//static �������, instanceof������� �׽�Ʈ
	public static void main1(String[] args) {
		System.out.println();
		
		SimpleMember.classcount = 10;
		System.out.println(SimpleMember.classcount);
		SimpleMember dto1 = new SimpleMember();
		System.out.println();
		
		SimpleMember dto2 = new SimpleMember();
		
		dto1.classcount = 1000;
		dto1.instancecount = 100;
		
		dto2.classcount = 2000;
		dto2.instancecount = 200;
		
		SimpleMember.classcount = 5000;
		
		System.out.println(dto1.classcount);
		System.out.println(dto1.instancecount);
		System.out.println();
		
		System.out.println(dto2.classcount);
		System.out.println(dto2.instancecount);
		System.out.println();
		
		System.out.println(SimpleMember.classcount);
		
	}

}
