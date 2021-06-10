package com.work.view;

public class ArrayTest1 {	//배열

	//Q. args가 뭔지?
	public static void main(String[] args) {
		System.out.println("args.length = "+args.length);
		System.out.println();
		
		//main1();
		//main2();
		main3();
		
	}
	public static void main1() {
		//5명의 학생의 성적관리하는 프로그램 개발
		//배열의 자료 저장 구조 사용
		// 출력형식 요구 사항 : 1번 : 92 \n 2번 : 95, \n
		// 총점과 평균(소수이하 버림)도 출력
		
		
		int[] scores;				//1. 배열 선언
		/*
		 * Q. 'public' int[] scores;가 안되는 이유는?	
		 */
		scores = new int[5];		//2. 배열 생성
			//현재 배열 요소에 저장된 값은? 0 0 0 0 0 

		//3. 배열 요소 사용
		// 배열 요소에 학생의 성적을 순서대로 할당.

		//scores[] = {92,85,77,98,65}; 왜 안되지?
		scores[0] = 92;
		scores[1] = 85;
		scores[2] = 77;
		scores[3] = 98;
		scores[4] = 65;
		
		
		// 배열 요소에 담긴 값을 전체 출력	: 배열의 크기(배열명.length)만큼 반복
		int total=0;
		int avg = 0;
		
		for(int index = 0; index<scores.length; index++) {
			System.out.println((index + 1) +"번 : "+ scores[index]);
			total += scores[index];
		}
		
		avg = (total/scores.length);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		//int 나누기 int는 결과값 int로 나옴
		
	}
	
	//1차원 배열 : 선언+생성 -> 초기화(할당)
	public static void main2() {
		//5명의 학생의 이름을 관리하는 프로그램 개발 
		String[] names = {"홍길동","강감찬","이순신","김유신","유관순"};
		System.out.println(names.length);
		//[modifiers] 타입[] 배열명 = (초기값1, 초기값2,..., 초기값x)
		for (int index=0; index< 
				names.length;index++) {
			System.out.println(names[index]);
		}
	}
	
	public static void main3() { //번호 : 이름 + 성적 모두 나오게 
		String[] names = {"홍길동","강감찬","이순신","김유신","유관순"};	//이름
		int[] scores = {92, 85, 77, 98, 65};
		
		int total=0; int avg = 0;
		for(int index = 0; index < names.length; index++){
			System.out.println((index+1)+"번"
					+ " "+ names[index] + " "+ scores[index]);
			total+=scores[index];
		}
		System.out.println();
		
		avg = total/names.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		//System.out.println("평균 : " + total/5.0);	
		//(int)/(double)일 경우 더 큰 범위인 double의 값으로 나옴.		
	}
}
