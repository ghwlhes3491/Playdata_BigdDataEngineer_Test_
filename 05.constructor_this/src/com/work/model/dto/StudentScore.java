package com.work.model.dto;

/**
 * <pre>
 * 학생의 성적 정보 도메인 클래스
 * </pre>
 * @author 김현진
 * @version 1.0
 * @since jdk1.8
 */

public class StudentScore {
	/** 학번 : 식별키*/
	public String studentNo = "210517";
	
	/** 이름 : 필수*/
	public String name;
	
	/** 성적 : 선택*/
	public int score;
	
	/**기본생성자*/
	public StudentScore() {
		System.out.println("기본생성자 수행 : 객체 생성시 공통로직 : ★");	
		//유지보수 편리성
	}
	/**
	 * 필수데이터 초기화 생성자 
	 * @param studentNo 학번
	 * @param name 이름
	 */
	public StudentScore(String studentNo, String name) {
		this();
		this.studentNo = studentNo;
		this.name = name;
		//System.out.println("필수생성자 수행 ");
	}

	/**실습
	 * 전체데이터 초기화 생성자(학번, 이름, 성적)
	 * @param studentNo	학번
	 * @param name 이름
	 * @param score 성적
	 */
	public StudentScore(String studentNo, String name, int score) {
		this(studentNo,name);
		//this.studentNo = studentNo;
		//this.name = name;
		this.score = score;
		//System.out.println("전체생성자 수행 ");
		
	}
	/**
	 * 학생의 성적 정보 출력 메서드 
	 */
	public void printInfo() {
		System.out.println(studentNo+"\t"+name+"\t"+score);
	}
	
	/**
	 * 성적 변경 메서드
	 * @param modifyScore 변경 성적
	 */
	public void setScore(int modifyScore){
	score = modifyScore;
	}	
	
	/**
	 * 학생 성적 조회 메서드
	 * @return 학생 성적
	 */
	public int getScore(){
	return score;
	}
	
	/**
	 * 
	 * @param modifyName 변경 이름
	 */
	public void setName(String modifyName) {
		name = modifyName;
	}
	
	/**
	 * 학생 이름 조회 메서드 
	 * @return 학생 이름
	 */
	public String getName() {
		return name;
	}
	/**
	 * 학생 리스트 옮기는 메서드 
	 */
	//public
	
}
