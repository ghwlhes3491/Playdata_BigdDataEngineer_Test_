package com.work.view;

public class ArrayTest1 {	//�迭

	//Q. args�� ����?
	public static void main(String[] args) {
		System.out.println("args.length = "+args.length);
		System.out.println();
		
		//main1();
		//main2();
		main3();
		
	}
	public static void main1() {
		//5���� �л��� ���������ϴ� ���α׷� ����
		//�迭�� �ڷ� ���� ���� ���
		// ������� �䱸 ���� : 1�� : 92 \n 2�� : 95, \n
		// ������ ���(�Ҽ����� ����)�� ���
		
		
		int[] scores;				//1. �迭 ����
		/*
		 * Q. 'public' int[] scores;�� �ȵǴ� ������?	
		 */
		scores = new int[5];		//2. �迭 ����
			//���� �迭 ��ҿ� ����� ����? 0 0 0 0 0 

		//3. �迭 ��� ���
		// �迭 ��ҿ� �л��� ������ ������� �Ҵ�.

		//scores[] = {92,85,77,98,65}; �� �ȵ���?
		scores[0] = 92;
		scores[1] = 85;
		scores[2] = 77;
		scores[3] = 98;
		scores[4] = 65;
		
		
		// �迭 ��ҿ� ��� ���� ��ü ���	: �迭�� ũ��(�迭��.length)��ŭ �ݺ�
		int total=0;
		int avg = 0;
		
		for(int index = 0; index<scores.length; index++) {
			System.out.println((index + 1) +"�� : "+ scores[index]);
			total += scores[index];
		}
		
		avg = (total/scores.length);
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		//int ������ int�� ����� int�� ����
		
	}
	
	//1���� �迭 : ����+���� -> �ʱ�ȭ(�Ҵ�)
	public static void main2() {
		//5���� �л��� �̸��� �����ϴ� ���α׷� ���� 
		String[] names = {"ȫ�浿","������","�̼���","������","������"};
		System.out.println(names.length);
		//[modifiers] Ÿ��[] �迭�� = (�ʱⰪ1, �ʱⰪ2,..., �ʱⰪx)
		for (int index=0; index< 
				names.length;index++) {
			System.out.println(names[index]);
		}
	}
	
	public static void main3() { //��ȣ : �̸� + ���� ��� ������ 
		String[] names = {"ȫ�浿","������","�̼���","������","������"};	//�̸�
		int[] scores = {92, 85, 77, 98, 65};
		
		int total=0; int avg = 0;
		for(int index = 0; index < names.length; index++){
			System.out.println((index+1)+"��"
					+ " "+ names[index] + " "+ scores[index]);
			total+=scores[index];
		}
		System.out.println();
		
		avg = total/names.length;
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		//System.out.println("��� : " + total/5.0);	
		//(int)/(double)�� ��� �� ū ������ double�� ������ ����.		
	}
}
