package com.work.view;

public class Test {
	public static void main1(String[] args) {	//main1�޼ҵ� ����
		// �̸������� ���� �����ؼ� ����
		String name; // = "ȫ�浿";
		name = "������";
		//�������� ���� ������ ������ �����ؼ� ����
		int age = 26;
		
		// ���� ���� �ܼ�â�� ���
		System.out.println(name);
		System.out.println(age);
	}
	//= �Ҵ� ������ Ȱ��
	public static void main2(String[] args) {
		int no1 = 5;	// int = int ���� Ÿ�� �ڵ��Ҵ� 
		long no2 = 5; //long = int ū Ÿ�� �ڵ� �Ҵ�
		// int no3 = 5.2; // int = double, ū Ÿ�� �ƴ� �ٸ�Ÿ���� �����߻�.
		int no4 = (int)5.2;	//����� ����ȯ�� �Ͼ 
		//int = (int)double ����� ����ȯ �Ҵ� (�Ǽ��� ������ �� ��ȯ�Ͽ� �Ҽ����� ����ó����)
		
		System.out.println(no4);
	}
	
	//ascii code : a-65, a-97, 0-48
	public static void main3(String[] args) {
		char c1 = '0';	//char = char ���� Ÿ�� �Ҵ�
		int c2 = c1;	// int = char �ڵ�����ȯ(ūŸ��) �Ҵ�
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println((char)70);//���� 70�� �ش��ϴ� ���� �ƽ�Ű�ڵ尪
	}
	
	public static void main(String[] args) {
		byte a = 5; 	// ���� �� �ʱ�ȭ�� ��쿡�� byte =int, ������ �⺻�� int
		byte b = 10;	// byte, short��  int�� �Ҵ簡�� 
		//byte result = a + b; byte = int +int ������ ������ ���� �߻�. �ڵ� ����ȯ �Ұ� //���� �� �ʱ�ȭ�� �ƴϹǷ� X
		
		//byte result = (byte)a + b;// ������ �켱������ ���� byte = byte + int => byte = int ���� ���� �߻� 
		byte result = (byte)(a + b);// byte = int + int ������ ������ ���� �߻�, �ڵ� ����ȯ �߻����� ����
		
		
		System.out.println(result);
		
	}

}