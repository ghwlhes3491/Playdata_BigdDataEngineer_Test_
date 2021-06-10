package com.work.api.string;

import java.util.StringTokenizer;
//★★★★★★★★★★★ 05/31 이 부분 잘 모르겠음★★★★★★★★★★★★★★
public class StringTest {
	//Wrapper API
	public static void main(String[] args) {
		// ★★★ 실습 : 토큰링을 이용해서 숫자데이터만 추출해서 덧셈 결과를 출력 ★★★
		// 1. 토큰링 분리 작업 : 객체.split
		String data = "100 + 200 * 3";	
		StringTokenizer tokenizer = new StringTokenizer(data, "+* ");
		int sum = 0;
		while (tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
//방법1		sum += Integer.parseInt(token);
//방법2		Integer integer = new Integer (token);
//			sum += integer.intValue();
//방법3	
			sum += new Integer(token).intValue();
			
		}
		System.out.println();
		System.out.println("sum : " + sum);

	}
	//문자열 토큰 테스트
	public static void main3(String[] args) {
		String data1 = "user01,password01,홍길동,01012341000,hong@work.com";
		String data2 = "100 + 200 * 3";
		
		//String#split()
		String [] tokens = data1.split(",");
		for (String token : tokens) {
			System.out.println(token);
		}
		System.out.println();
		//StringTokenizer	
		StringTokenizer tokenizer = new StringTokenizer(data1, ",");	//기본구분자 \t,\n,\r,\f
		System.out.println(tokenizer.countTokens());
		while(tokenizer.hasMoreElements()) {
			String data = tokenizer.nextToken();
			System.out.println(data);
		}
	}
	public static void main2(String[] args) {
		// StringBuffer, StringBuiler : 가변문자열
		// 반드시 new STringBuffer(), new StringBuilder() : new 키워드 이용해서 객체생성 
		// StringBuffer : jdk1.0 version
		// StringBuilder : jdk1.5 version
		StringBuffer buffer = new StringBuffer("여러분, ");
		buffer.append("안녕하세요. ").append("만나서 ").append("반갑습니다.");
		System.out.println(buffer);
	}
	public static void main1(String[] args) {
		//String : 불변 문자열
		String msg1 = "Hello";		//heap area내에 literal pool
		String msg2 = "Hello";		//heap area내에 literal pool
		String msg3 = new String("Hello");	//heap area			//new쓰면 무조건 heap에 올라감
		String msg4 = new String("Hello");	//heap area
		
		print("==연산자 문자열 비교 : 같은 문자열인데도 fasle가 나오는 문제 발생");
		System.out.println(msg1==msg2);	//true
		System.out.println(msg1==msg3);	//false
		System.out.println(msg1==msg4);	//false
		
		print("equals() 문자열비교"); //참조값아닌, 담긴 문자열내용이 같으면 같은걸로
		System.out.println(msg1.equals(msg2));	//true	
		System.out.println(msg1.equals(msg3));	//true
		System.out.println(msg1.equals(msg4));	//true
		
		print("문제점??");	// 어떤 문제점인지 잘 모르겠음.
		for(int index = 0; index < 100; index++) {
			msg1 += index;
		}

	}
	
	public static void print(String msg) {
		System.out.println("\n### "+ msg);
	}
}
