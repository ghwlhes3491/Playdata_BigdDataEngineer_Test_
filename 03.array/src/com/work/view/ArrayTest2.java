package com.work.view;

public class ArrayTest2 {
	public static void main(String[] args) {
		//doA();
		doB();
	}
	/* 행과 열 크기가 동일한 2차원 배열 */
	public static void doA() {
		//1반 80,90,70, 80
		//2반 70,60,50, 88
		//3반 95,87,67, 92	//3행 4열 구조
		
		//1. 선언 + 생성
		int [][] scores = new int [3][4];
		//System.out.println(scores);
		
		//2. 2차원 배열 요소 값 할당
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
		
				
		
		//3. 2차원 배열요소 출력
		for(int i = 0; i<scores.length; i++) {	//행 크키 만큼
			int total = 0; int avg = 0;
			System.out.print((i+1)+"반 : ");
			for(int j = 0; j < scores[i].length; j++) {	// 각 행의 열 크기 만큼
				System.out.printf("%d ",scores[i][j]);
				
				total += scores[i][j];
				avg = total /scores[i].length;
			}	
			System.out.printf("[총점 : %d][평균 : %d]", total, avg);
			System.out.println();
		}
	}
	public static void doB() {
		//출력 양식 
		// n반 : nn nn nn
		//[총점 : 000, 평균 : 000]
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
		
		
		for(int i = 0; i<scores.length; i++) {	//행 크키 만큼
			int total = 0; int avg = 0;
			System.out.print((i+1)+"반 : ");
			for(int j = 0; j < scores[i].length; j++) {	// 각 행의 열 크기 만큼
				System.out.printf("%d ",scores[i][j]);
				
				total += scores[i][j];
				avg = total /scores[i].length;
			}	
			System.out.println();
			System.out.printf("[총점:%d][평균:%d]", total, avg);
			System.out.println();
		}


	}

}
