package com.work.view;

import java.util.Random;

//아규먼트 - 매개변수
public class RandomTeamTest {

	/* 실습
	 * 한 반의 30명 학생들을 대상으로 랜덤하게 팀을 구성하는 프로그램을 구현하시오
	 * 1. 팀 당 인원수 : 고정적? 가변적? 
	 * >>가변적 : 사용자로부터 입력 받기(IO, main(String[] args)의 arguments전달 받기)
	 * 사용자 입력 1) IO (java.io api 활용)
	 * 			2) main(String[] args) arguments : 숫자를 입력해도 String됨
	 * 				- String 숫ㅈ자 문자열을 숫자타입(int)변환 기술 사용
	 * 				- main()메소드에 아규먼트 전달해서 실행하는 방법?
	 * 
	 * -> 배열이름[i].length
	 * 
	 * 2. 랜덤하게 배열요소를 접근하기 위한 방법?
	 * >> 30명
	 * >> 30개 String[]배열 생성하여 학생들의 이름 저장
	 * >> 배열요소 인덱스 번호 : 0 ~ '배열크기-1'
	 * >> java.util.Random API 활용하여 임의의 숫자를 추출하는 유틸리티 클래스 제공.
	 * 
	 * 3. 남는 인원은 어떤 팀에 배정 할 것인지?
	 * >> 남는 인원을 첫번째 팀부터 순서대로 1명씩 일괄 배정 할 것인지?
	 * >> 배정하는 팀도 랜덤하게 처리하여 배정 할 것인지?
	 * 
	 */
	public static void main(String[] args) {
		if (args.length != 1) {	//올바르지 않으면 프로그램 종료
			System.out.println("Usage : java RandomTeamTest 팀원숫자");
			System.exit(0);
		}
		int teamLength = Integer.parseInt(args[0]);		// String 문자열 타입의 숫자 데이터를 int 타입으로 변환
		//학생의 이름 정보는 배열요소 30명 저장
		//2차원 배열 행크기, 열크기 분석하여 선언 및 생성하는 Logic
		
		
		System.out.println(args.length);
		for(int index = 0 ; index <args.length; index++ ) {
			System.out.println(args[index]);
		}
		int random = getRandomNo();	//랜덤하게 추출된 숫자를 random변수에 넣음.
		System.out.println(random);
		
	}
	
	public static int getRandomNo() {
		/* 임의의 정수형 숫자를 추출하기 위한 제공 코드입니다. */
		Random extractNo = new Random((long)(Math.random() * System.nanoTime()));
		/* 0 ~ 29 사이의 임의의 숫자 추출 */
		int no = extractNo.nextInt(30); 
		return no;
		
		//random()은 0.0~1.0에서의 double값 반환함.
	}

}
