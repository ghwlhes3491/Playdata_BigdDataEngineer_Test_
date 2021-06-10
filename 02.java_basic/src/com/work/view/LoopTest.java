package com.work.view;

public class LoopTest {
/*
	public static void main1(String[] args) {
		//for 구문을 이용해서 1~10까지 출력하면서 누적된 결과를 출력해보세요
		int sum=0;

		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {	//짝수 누적 : 2로 나누었을 때 나머지 값 이용
			sum+=i;
			System.out.println(i);
			}
		}
		System.out.printf("누적 결과 : %d\n", sum);
	}
	*/
	
	
	/* 실습 : 영문 대문자에 대한 'ascii code'를 출력하는 프로그램 작성
	 *  hint : 알파벳은 총 26자, type casting이용
	 *  <출력형식>
	 *  A : 65
	 *  B: 66
	 *  ...
	 *  Z : nn
	 */
	
	public static void main3(String[] args) {
		char alp='Z';
		for(int i = (int)'A'; i <= (int)alp; i++) { //명시적 형변환
			System.out.println((char)i+" : "+(int)i);
			//System.out.printf("%c : %d\n", i, (int)i);
		}
		
		System.out.println();
		
		for( char i ='A'; i<='Z';i++) { //가장 명확한 듯 (1)char 기준.
			System.out.println(i+" : "+(int)i);
		}
		
		System.out.println();
		
		for( int i ='A'; i<='Z';i++) { //가장 명확한 듯 (2)int 기준 //자동 형변환
			System.out.println((char)i+" : "+i);
		}
		
		//이 경우 j는 왜 int로 들어가?
		for (int i=1, j='A';i<=26; i++,j++) {
			System.out.println(j+" : "+ j);
		}
		
		int i,j;
		i = 0;
		j=0;
		System.out.println(i+","+j);
	}

	public static void main(String[] args) {
		/*실습 : 1부터 5까지 누적된 결과 출력*/
		int sum = 0; 
		int i = 0;
		
		System.out.println("1. for구문 ");
		for(i = 1; i<=5;i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("누적 결과 : " + sum);
		
		System.out.println("2. while구문");
		i = 1; sum = 0;
		while(i<=5) {
			System.out.println(i);
			sum+=i;
			i++;
		}
		System.out.println("누적 결과 : " + sum);
		
		System.out.println("3. do~while구문");
		i = 1; sum = 0;
		do {
			System.out.println(i);
			sum+=i;
			i++;
		}while(i<=5);
		System.out.println("누적 결과 : " + sum);
	}
	
}
