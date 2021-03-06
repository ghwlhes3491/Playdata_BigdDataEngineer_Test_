package com.work.view;

import com.work.model.dto.Member;

public class Test {
	/* encapsulation 테스트 */
	public static void main(String[] args) {
		Member dto = new Member("A210526","12345","김현진","01012341234","A210526@gmail.com");
		System.out.println("변경전 : " + dto);
		//아이디 변경 : 멤버변수 직접 접근 불가
		//dto.memberId = "aaa"; // 접근권한 private선언, 외부에서 직접 접근 불가
		
		// 아이디 변경 : setter()
		// 올바른 아이디 검증 규칙 준수
		dto.setMemberId("happayday2021");
		System.out.println("아이디 변경후 : " + dto);
		
		dto.setMemberId("test");
		System.out.println("아이디 변경후 : " + dto);
		
		dto.setMemberPw("21");
		System.out.println("비밀번호 변경후 : " + dto);
		
		dto.setMileage(21);
		System.out.println("마일리지 변경후 : " + dto);
		
		dto.setGrade("21");
		System.out.println("등급 변경후 : " + dto);
		
		
	}
	/* toString()메서드 재정의 및 사용 테스트 */
	public static void main1(String[] args) {
		// 회원의 가입시 입력데이터 초기화 생성자 이용해서 객체 생성
		// 가입 : 아이디, 비밀번호, 이름, 휴대폰, 이메일
		Member dto = new Member("A210526","12345","김현진","01012341234","A210526@gmail.com");
		
		// 생성한 회원객체의 정보를 출력
		// System.out.println(참조변수명); =>자동으로  참조변수명.toString() 수행 결과 문자열 콘솔창 출력
		// toString()메서드 생략가능
		//System.out.println(dto.toString());
		System.out.println(dto);
	}
}
