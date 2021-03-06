package com.work.view;

public class ExceptionNotTest {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		// 이름 : 홍길동, 강감찬, 이순신  - 배열에 저장, 선언+생성+초기화 동시 수행
		
		String[] names = {"홍길동","강감찬","이순신"}; //[0][1][2]
				
		//for 구문 이용해서 5번 반복하면서 배열 저장된 이름 정보를 출력
		for(int index = 0 ; index < 5 ; index++) {
			System.out.println(names[index]);	//예외 발생 가능 코
		}
		System.out.println("프로그램 정상 종료");
//<예상 실행 결과>
//		프로그램 시작
//		홍길동
//		강감찬
//		이순신
//		(빨강)exception발생	=> 실제 ArrayIndexOutOfBoundsException
//		
//		=> 해당 예외처리 여부 체킹
//		=> 예외처리가 되어있지 않으면 콘솔창에 예외발생 트래킹 정보와 예외메세지 출력
//		=> 프로그램 강제 종료 ("프로그램 정상종료") 문구 나오지 않음.
//
	}

}
