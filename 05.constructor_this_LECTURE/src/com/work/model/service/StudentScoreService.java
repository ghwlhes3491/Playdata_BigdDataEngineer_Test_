package com.work.model.service;

import com.work.model.dto.StudentScore;

/**
 * <pre>
 * �л� �������� ���� ���� Ŭ����
 * 1. ��� ��� : + addStudentScore(�й�, �̸�, ����) : void
 * 2. ��ȸ ���
 * 		>> ��ü�л�������ȸ ��� : + printStudentScore() : void
 * 		>> �й��� �ش��л� ����ȸ ���
 * 3. ���� ��� ���
 * 4. ��� ��� ���
 * </pre>
 * 
 * @author �Ӱ���
 * @version ver.1.0
 * @since jdk.1.8
 * @see com.work.model.dto.StudentScore
 * @see com.work.model.dtoStudentScore#printInfo()
 */
public class StudentScoreService {
	/** �л����� �������� ��ü�� �׷����� �����ϱ� ���� �ڷ� ���屸�� : �ʿ�ÿ� Ȯ���ϵ��� ó�� */
	//public StudentScore[] students = new StudentScore[3];
	
	/** 
	 * �л����� �������� ��ü�� �׷����� �����ϱ� ���� �ڷ� ���屸�� ������� ���� : �迭��ü ������ ������ ����ó�� 
	 * -- ���ٱ��� : public => private ���� (�ܺο��� �Ժη� �����Ҽ����� : ���ȵ�����)
	 * */
	private StudentScore[] students;
	
	/** ��ϵ� �л��� ���� ���� �� ����ؾ��ϴ� �迭����� �ε�����ȣ ���� 
	 * -- ���ٱ��� : public => private ���� (�ܺο��� �Ժη� �����Ҽ����� : ���ȵ�����)
	 * -- ���� �Ұ�
	 * -- ��� �л��� ��ȸ ���� : getter()
	 * */
	private int count;
	
	/** �⺻������ : �迭�� ũ�⸦ �⺻ 10�� �ʱ�ȭ */
	public StudentScoreService() {
		//students= new StudentScore[10];
		this(10);
	}
	
	/**
	 * �迭�� ũ�⸦ ���޹޾Ƽ� �迭���� �Ҵ� �ʱ�ȭ ������
	 * @param length
	 */
	public StudentScoreService(int length) {
		students = new StudentScore[length];
	}
	
	/** �ǽ� : ���� ����� �л������� ���� ��ȸ �޼��� */
	public int getCount() {
		return count;
	}
	
	/**
	 * <pre>
	 * �л����� ��� �޼���
	 * -- ��ϰ�� �޼��� ���
	 * -- ���� : ��� ���� 
	 * -- ���� : ��� ����
	 * 
	 * # ó�� ��������
	 * 1. StudentScore ��ü ����
	 * 2. �ƱԸ�Ʈ�� ���޹��� ������ ���� ��ü ���� ����
	 * 3. ������ ��ü�� �迭�� count �����ġ�� ���
	 * 4. count ����ο��� 1 ����
	 * 
	 * </pre>
	 * @param studentNo �й�
	 * @param name �̸�
	 * @param score ����
	 */
	public void addStudentScore(String studentNo, String name, int score) {
//		if (count == students.length) {
//			extendStudents(10);
//			System.out.println("�л����� �ڷ����屸���� �߰� Ȯ���Ͽ����ϴ�.");
//		} 
//		
//		StudentScore dto = new StudentScore();
//		dto.studentNo = studentNo;
//		dto.name = name;
//		dto.score = score;
//
//		students[count++] = dto;
		
		StudentScore dto = new StudentScore();
		dto.studentNo = studentNo;
		dto.name = name;
		dto.score = score;
		
		addStudentScore(dto);
	}
	
	/**
	 * ��ϸ޼��� �ߺ�����
	 * @param dto �л����� ��ü
	 */
	public void addStudentScore(StudentScore dto) {
		if (count == students.length) {
			extendStudents(10);
			System.out.println("�л����� �ڷ����屸���� �߰� Ȯ���Ͽ����ϴ�.");
		} 
		
		students[count++] = dto;
	}
	
	/**
	 * <pre>
	 * �л����� ���� �ڷ� ���屸���� ���޹��� ũ��� Ȯ���� �� 
	 * Ȯ���� ���ο� �迭 ��ҿ� ���� �л����� ���� ������ ��
	 * �л����� �迭��Ҹ� ������ Ȯ���� �迭��ü�� ���� ����
	 * </pre>
	 * @param length
	 */
	public void extendStudents(int length) {
		StudentScore[] studentsTemp = new StudentScore[students.length + length];
		
		for (int index = 0; index < students.length; index++) {
			studentsTemp[index] = students[index];
		}
		
		students = studentsTemp;
	}

	/**
	 * ��ü�л� ���� ��ȸ �޼���
	 */
	public void printStudentScore() {
		for (int index = 0; index < count; index++) {
			students[index].printInfo();
		}
	}
}


