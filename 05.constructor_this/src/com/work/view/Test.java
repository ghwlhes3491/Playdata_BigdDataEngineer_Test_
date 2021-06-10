package com.work.view;

import com.work.model.dto.StudentScore;
import com.work.model.service.StudentScoreService;

/**
 * <pre> 
 * 학생 성적 관리 프로그램 시작 클래스 
 * 1. 등록 기능
 * 2. 조회 기능
 * 3. 총점 계산 기능
 * 4. 평균 계산 기능
 *</pre> 
 * @author 김현진
 * @version 1.0
 * @since jdk1.8
 * @see	com.work.model.dto.StudentScore
 * @see com.work.dtoStudentScore#printInfo()
 * @see com.work.model.service.StudentScoreService
 */
public class Test {

	/*this() 테스트*/
	public static void main3(String[] args) {
		StudentScore dto3 = new StudentScore("3번","이순신",88);
		dto3.printInfo();
	}
	
	public static void main2(String[] args) {//오후수업
		//기본생성자 이용하여 객체 생성 
		StudentScore dto1 = new StudentScore();
		dto1.studentNo = "1번";
		dto1.setName("홍길동");
		dto1.setScore(92);
		
		//필수초기화 생성자 이용해서 객체 생성 
		StudentScore dto2 = new StudentScore("2번","강감찬");
		dto2.setScore(92);
		
		// 전체 초기화 생성자 이용한 객체 생성
		StudentScore dto3 = new StudentScore("3번","이순신",88);
		
		dto1.printInfo();
		dto2.printInfo();
		dto3.printInfo();
	}
	/**
	 * 
	 * @param args학생 성적 관리 프로그램 시작 메서드 
	 * 
	 */
	public static void main(String[] args) {//오전수업
		StudentScoreService service = new StudentScoreService();
		
		//리스트의 크기를 검사할 수 있는 로직 필요
		
		System.out.println("\n ## 등록기능 ");
		service.addStudentScore("1번", "홍길동", 92);	//NULL =>배열객체 접근 불가 => 예외발생 강제종료
		service.addStudentScore("2번", "강감찬", 85);
		service.addStudentScore("3번", "이순신", 77);
		service.addStudentScore("4번", "김유신", 98);
		service.addStudentScore("5번", "유관순", 65);

		service.students = null; 
		// 기존학생들의 성적 정보가 저장된 배열객체가 메모리에서 사라짐=> 학생들의 성적정보 유실(!!엄청어큰일!)
		//	public =>private 접근권한 변경으로 인해서 외부에서 함부로 변경불가(보안묹문제해결)			
		
		System.out.println("\n ## 성적 등록된 학생수 : "+service.count);//
		System.out.println("\n ## 성적 등록된 학생수 : "+service.getCount());
		
		service.count = 500;	//=> 학생 등록 숫자 및 다음에 저장될 배열요소 인덱스 번호 문제 발생 
		service.addStudentScore("1번","홍길동",92);	//바꾸지는 못하게 하되(접근) , 조회는 가능하게 하려면? 
		
		System.out.println("\n ## 전체 학생 성적 조회  : ");
		service.printStudentScore();	//null =>배열객체 접근 불가 => 예외발생 강제종료
		service.students = null;
			
	}
}
