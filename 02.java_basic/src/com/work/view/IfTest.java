package com.work.view;

public class IfTest {
	// �ǽ� : if~~else if ~~ else ����
	public static void main1(String[] args) {
		//������ ������ ����
		int score = 65;
		
		// ������ 70�� �̻��̸� �հ� ���, 70�� �̸��̸� ���հ� ���
		if (score>=70) {	//�̻��̹Ƿ� >=
			System.out.println("������ "+score+"�� �հ��Դϴ�");
		}else {
			System.out.println("������ "+score+"�� ���հ��Դϴ�.");
		}
		
	}
	
	public static void main2(String[] args) {
		/*	������ �ּ�
		 * ������ ���� ����� ����ϴ� ���α׷� �ϼ�
		 * ������ 0 ~ 100���̳� 90~100 :A, 80~90 :B,....,60�̸� : F
		 * ������� => ���� : 00, ��� : n
		 */
		int score = 65;
		if(score >= 0 & score<=100) {	//invalid�� �ͱ��� üũ�ؾ� ��
			if(score>=90) {
				//System.out.println(score+"�� A���");	// %d�� %f��� 
				System.out.printf("%d�� %c���", score, 'A');
			}else if (score>=80) {
				System.out.println(score+"�� B���");
			}else if (score>=70) {
				System.out.println(score+"�� C���");
			}else if (score>=60) {
				System.out.println(score+"�� D���");
			}else {
				System.out.println(score+"�� F���");
			}
			
		}else {
			System.out.println("[����] ������ 0 ~ 100�� �̳� �Դϴ�. : "+ score);
		}
	}
	
	public static void main3(String[] args) { //���� �� ������ ���� �ڵ�.
		int score = 22;
		String grade = null;
		if(score >= 0 & score<=100) {	//invalid�� �ͱ��� üũ�ؾ� ��
			if(score>=90) {
				grade = "A";
			}else if (score>=80) {
				grade = "B";
			}else if (score>=70) {
				grade = "C";
			}else if (score>=60) {
				grade = "D";
			}else {
				grade = "F";
			}
		}else {
			System.out.println("[����] ������ 0 ~ 100�� �̳� �Դϴ�. : "+ score);
		}
		System.out.println(score+"��, "+grade+"��� �Դϴ�." );
	}
	
	//switch�� �ǽ� :  if~~else if ~~ else ������ ����
	public static void main(String[] args) {
		
		int score = 75;
		char grade;
		
		//int sscore = (score/10); //���� ���⼭ �� ���� �����ʿ� x
		if (score>=0 & score<=100) {
			switch(score/10) {
			case 10:
			case 9 :
				grade='A'; break;	//break�� �����ϰ� ���� 'or'ó�� �� �� �ִ�.
			case 8 :
				grade='B'; break;	
			case 7 :
				grade='C'; break;	
			case 6 :
				grade='D'; break;	
			default:
				grade ='F';
			}
		System.out.println(score+"��\t"+grade+"���" );
		System.out.println();
		}
		
		//���� ���� �������?
		int rd= (int)(Math.random()*100+1);

		System.out.println("�������� :"+rd);
		if (rd>=0 & rd<=100) {
			switch(rd/10) {
			case 10 :
				grade='A'; break;
			case 9 :
				grade='A'; break;
			case 8 :
				grade='B'; break;	
			case 7 :
				grade='C'; break;	
			case 6 :
				grade='D'; break;	
			default:
				grade ='F';
			}
		System.out.println(rd+"��, "+grade+"��� �Դϴ�." );
		}
	}


}