package com.work.view;

public class ArrayTest2 {
	public static void main(String[] args) {
		//doA();
		doB();
	}
	/* ��� �� ũ�Ⱑ ������ 2���� �迭 */
	public static void doA() {
		//1�� 80,90,70, 80
		//2�� 70,60,50, 88
		//3�� 95,87,67, 92	//3�� 4�� ����
		
		//1. ���� + ����
		int [][] scores = new int [3][4];
		//System.out.println(scores);
		
		//2. 2���� �迭 ��� �� �Ҵ�
		scores[0][0] = 80;
		scores[0][1] = 90;
		scores[0][2] = 70;
		scores[0][3] = 80;
		
		scores[1][0] = 70;
		scores[1][1] = 60;
		scores[1][2] = 50;
		scores[1][3] = 88;
		
		scores[2][0] = 95;
		scores[2][1] = 87;
		scores[2][2] = 67;
		scores[2][3] = 92;
		
				
		
		//3. 2���� �迭��� ���
		for(int i = 0; i<scores.length; i++) {	//�� ũŰ ��ŭ
			int total = 0; int avg = 0;
			System.out.print((i+1)+"�� : ");
			for(int j = 0; j < scores[i].length; j++) {	// �� ���� �� ũ�� ��ŭ
				System.out.printf("%d ",scores[i][j]);
				
				total += scores[i][j];
				avg = total /scores[i].length;
			}	
			System.out.printf("[���� : %d][��� : %d]", total, avg);
			System.out.println();
		}
	}
	public static void doB() {
		//��� ��� 
		// n�� : nn nn nn
		//[���� : 000, ��� : 000]
		//
		int[][] scores = new int[3][];
		scores[0] = new int[2];
		scores[1] = new int[4];
		scores[2] = new int[3];
		
		scores[0][0] = 80;
		scores[0][1] = 90;

		scores[1][0] = 70;
		scores[1][1] = 60;
		scores[1][2] = 50;
		scores[1][3] = 88;
		
		scores[2][0] = 95;
		scores[2][1] = 87;
		scores[2][2] = 67;
		
		
		for(int i = 0; i<scores.length; i++) {	//�� ũŰ ��ŭ
			int total = 0; int avg = 0;
			System.out.print((i+1)+"�� : ");
			for(int j = 0; j < scores[i].length; j++) {	// �� ���� �� ũ�� ��ŭ
				System.out.printf("%d ",scores[i][j]);
				
				total += scores[i][j];
				avg = total /scores[i].length;
			}	
			System.out.println();
			System.out.printf("[����:%d][���:%d]", total, avg);
			System.out.println();
		}


	}

}
