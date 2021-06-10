package com.work.view;

public class Test {
	public static void main1(String[] args) {	//main1메소드 생성
		// 이름정보를 변수 설정해서 저장
		String name; // = "홍길동";
		name = "강감찬";
		//여러분의 나이 정보를 변수에 설정해서 저장
		int age = 26;
		
		// 나의 정보 콘솔창에 출력
		System.out.println(name);
		System.out.println(age);
	}
	//= 할당 연산자 활용
	public static void main2(String[] args) {
		int no1 = 5;	// int = int 같은 타입 자동할당 
		long no2 = 5; //long = int 큰 타입 자동 할당
		// int no3 = 5.2; // int = double, 큰 타입 아닌 다른타입은 오류발생.
		int no4 = (int)5.2;	//명시적 형변환이 일어남 
		//int = (int)double 명시적 형변환 할당 (실수를 정수로 형 변환하여 소수이하 버림처리됨)
		
		System.out.println(no4);
	}
	
	//ascii code : a-65, a-97, 0-48
	public static void main3(String[] args) {
		char c1 = '0';	//char = char 같은 타입 할당
		int c2 = c1;	// int = char 자동형변환(큰타입) 할당
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println((char)70);//숫자 70에 해당하는 문자 아스키코드값
	}
	
	public static void main(String[] args) {
		byte a = 5; 	// 선언 및 초기화인 경우에만 byte =int, 연산의 기본은 int
		byte b = 10;	// byte, short은  int로 할당가능 
		//byte result = a + b; byte = int +int 연산의 수행결과 오류 발생. 자동 형변환 불가 //선언 및 초기화가 아니므로 X
		
		//byte result = (byte)a + b;// 연산자 우선순위에 따라 byte = byte + int => byte = int 형의 오류 발생 
		byte result = (byte)(a + b);// byte = int + int 연산의 수행결과 오류 발생, 자동 형변환 발생하지 않음
		
		
		System.out.println(result);
		
	}

}