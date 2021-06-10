package com.work.model.service;

import com.work.model.dto.StudentScore;

/**
 * <pre> 
 * 학생 성적 관련 서비스 제공 클래스
 * 1. 등록 기능	: + addStudentScore(학번, 이름, 성적정보) : void
 * 2. 조회 기능	
 * 			>> 전체 학생 성적조회 기능: +printStudentScore() : void		//배열의크기만큼? no, 인원수만큼 출력해야함
 * 			>> 학번의 해당학생 상세조회 기능
 * 3. 총점 계산 기능
 * 4. 평균 계산 기능
 *</pre> 
 * @author 김현진
 * @version 1.0
 * @since jdk1.8
 * @see	com.work.model.dto.StudentScore
 * @see com.work.dtoStudentScore#printInfo()
 */
public class StudentScoreService {
	/** 학생들의 성적정보 객체를 그룹으로 관리하기위한 자료 저장구조 : 필요시에 확장하도록 처리 */
	//public StudentScore[] students = new StudentScore[3];
	
	/** 학생들의 성적정보 객체를 그룹으로 관리하기 위한 자료 저장구조 멤버변수 선언 : 배열 객체 생성은 생성자 위임처리
	 * -- 접근권한 : public => private  변경( 외부에서 함부로 변경할 수 없음: 보안데이터)
	 * */
	
	private StudentScore[] students; //public StudentScore[] students;
	/** 등록된 학생의 숫자 정보 및 등록해야하는 배열 요소의 인덱스번호 정보 
	 *  -- 접근권한 : public => private  변경( 외부에서 함부로 변경할 수 없음: 보안데이터)
	 *  -- 변경불가
	 *  -- 등록 학생수 조회 제공 :getter();
	 * */
	public int count ;
	
	/**기본 생성자 : 배열의 크기를 기본 10개 초기화*/
	public StudentScoreService() {
		//students = new StudentScore[10];
		this(10);	//this는 맨 앞줄에 위치해야함

		
	}
	
	/**배열의 크기를 전달받아서 배열생성 할당 초기화 생성자
	 * @param length
	 */
	public StudentScoreService(int length) {
		students = new StudentScore[length];
	}
	/** 실습 : 현재 등록된 학생성적의 숫자 조회 메서드**/
	public int getCount() {	//변경은 못하지만 조회는 가능하게 해줌
		return count;
	}
	

	/**
	 * <pre>
	 * 학생 성적 등록 메서드 
	 * -- 등록결과 메시지 출력
	 * -- 성공 : "등록 성공"
	 * -- 실패 : "등록 실패"
	 * 
	 * #처리절차 
	 * 1. StudentScore 객체 생성
	 * 2. argument로 전달받은 정보로 생성 객체 정보 설정
	 * 3. 생성된 객체를 배열 count 요소위치에 등록
	 * 4. count 등록인원을 +1
	 * </pre>
	 * 등록 기능 : + addStudentScore(학번, 이름, 성적정보) : void
	 * @param studentNo 학번
	 * @param name 이름
	 * @param score 성적
	 */
	
	//기존의 크기보다 더 큰 배열 객체를 생성해서
	// 기존 배열에 저장된 객체를 더 큰 배열로 순서대로 이동시키고
	//새로운 객체를 추가된 배열요소에 등록
	
	//멤버 변수 배열 객체를 기존 배열 요소 객체 대신에 새로이 생성한 배열 객체요소를 참조 할당
	public void addStudentScore(String studentNo, String name, int score) {
				
		if (students.length == count) {
			extendStudents(10);
			System.out.println("1학생들의 자료저장구조를 확장하였습니다.");
		}
		StudentScore dto = new StudentScore();
		dto.studentNo = studentNo;
		dto.name = name;
		dto.score = score;
		
		addStudentScore(dto);
	}
	
	/**
	 * 등록 메서드 중복 정의 
	 * @param dto 학생 성적 객체 
	 */
	public void addStudentScore(StudentScore dto) {
		
		if (students.length == count) {
			extendStudents(10);
			System.out.println("2학생들의 자료저장구조를 확장하였습니다.");
		}

		students[count++]=dto;
	}

		/*
			// 포화상태인 배열을 다른 이름으로 바꾸고 새 배열을 기존의 이름으로 동일하게.
			// X ->포화상태인 배열은 그대로 두고, 임시temp 배열에 포화배열 넣음. 
			// 그리고 리턴시킬때 임시temp배열 이름 바꿔서 리턴

		 */		
		

		/**
		 * 전체 학생 성적 조회 메서드 
		 * @param length 입력된 인원수 길이 
		 */
		public void extendStudents(int length) {
			StudentScore[] studentsTemp = new StudentScore[students.length+length];
			for(int index = 0; index<students.length;index++) {
				studentsTemp[index] = students[index];	
			}
			students = studentsTemp;
	}
	/**
	 * 전체학생 성적 조회 메서드 
	 */
	public void printStudentScore() {
		for(int index = 0; index < count; index++) {	//향상된 for문 X, why? 배열의 크기만큼 돌기때문.
			students[index].printInfo();
		}
	}
}
