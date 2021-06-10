package com.work.model.service;

import com.work.model.dto.StudentScore;

/**
 * <pre> 
 * �л� ���� ���� ���� ���� Ŭ����
 * 1. ��� ���	: + addStudentScore(�й�, �̸�, ��������) : void
 * 2. ��ȸ ���	
 * 			>> ��ü �л� ������ȸ ���: +printStudentScore() : void		//�迭��ũ�⸸ŭ? no, �ο�����ŭ ����ؾ���
 * 			>> �й��� �ش��л� ����ȸ ���
 * 3. ���� ��� ���
 * 4. ��� ��� ���
 *</pre> 
 * @author ������
 * @version 1.0
 * @since jdk1.8
 * @see	com.work.model.dto.StudentScore
 * @see com.work.dtoStudentScore#printInfo()
 */
public class StudentScoreService {
	/** �л����� �������� ��ü�� �׷����� �����ϱ����� �ڷ� ���屸�� : �ʿ�ÿ� Ȯ���ϵ��� ó�� */
	//public StudentScore[] students = new StudentScore[3];
	
	/** �л����� �������� ��ü�� �׷����� �����ϱ� ���� �ڷ� ���屸�� ������� ���� : �迭 ��ü ������ ������ ����ó��
	 * -- ���ٱ��� : public => private  ����( �ܺο��� �Ժη� ������ �� ����: ���ȵ�����)
	 * */
	
	private StudentScore[] students; //public StudentScore[] students;
	/** ��ϵ� �л��� ���� ���� �� ����ؾ��ϴ� �迭 ����� �ε�����ȣ ���� 
	 *  -- ���ٱ��� : public => private  ����( �ܺο��� �Ժη� ������ �� ����: ���ȵ�����)
	 *  -- ����Ұ�
	 *  -- ��� �л��� ��ȸ ���� :getter();
	 * */
	public int count ;
	
	/**�⺻ ������ : �迭�� ũ�⸦ �⺻ 10�� �ʱ�ȭ*/
	public StudentScoreService() {
		//students = new StudentScore[10];
		this(10);	//this�� �� ���ٿ� ��ġ�ؾ���

		
	}
	
	/**�迭�� ũ�⸦ ���޹޾Ƽ� �迭���� �Ҵ� �ʱ�ȭ ������
	 * @param length
	 */
	public StudentScoreService(int length) {
		students = new StudentScore[length];
	}
	/** �ǽ� : ���� ��ϵ� �л������� ���� ��ȸ �޼���**/
	public int getCount() {	//������ �������� ��ȸ�� �����ϰ� ����
		return count;
	}
	

	/**
	 * <pre>
	 * �л� ���� ��� �޼��� 
	 * -- ��ϰ�� �޽��� ���
	 * -- ���� : "��� ����"
	 * -- ���� : "��� ����"
	 * 
	 * #ó������ 
	 * 1. StudentScore ��ü ����
	 * 2. argument�� ���޹��� ������ ���� ��ü ���� ����
	 * 3. ������ ��ü�� �迭 count �����ġ�� ���
	 * 4. count ����ο��� +1
	 * </pre>
	 * ��� ��� : + addStudentScore(�й�, �̸�, ��������) : void
	 * @param studentNo �й�
	 * @param name �̸�
	 * @param score ����
	 */
	
	//������ ũ�⺸�� �� ū �迭 ��ü�� �����ؼ�
	// ���� �迭�� ����� ��ü�� �� ū �迭�� ������� �̵���Ű��
	//���ο� ��ü�� �߰��� �迭��ҿ� ���
	
	//��� ���� �迭 ��ü�� ���� �迭 ��� ��ü ��ſ� ������ ������ �迭 ��ü��Ҹ� ���� �Ҵ�
	public void addStudentScore(String studentNo, String name, int score) {
				
		if (students.length == count) {
			extendStudents(10);
			System.out.println("1�л����� �ڷ����屸���� Ȯ���Ͽ����ϴ�.");
		}
		StudentScore dto = new StudentScore();
		dto.studentNo = studentNo;
		dto.name = name;
		dto.score = score;
		
		addStudentScore(dto);
	}
	
	/**
	 * ��� �޼��� �ߺ� ���� 
	 * @param dto �л� ���� ��ü 
	 */
	public void addStudentScore(StudentScore dto) {
		
		if (students.length == count) {
			extendStudents(10);
			System.out.println("2�л����� �ڷ����屸���� Ȯ���Ͽ����ϴ�.");
		}

		students[count++]=dto;
	}

		/*
			// ��ȭ������ �迭�� �ٸ� �̸����� �ٲٰ� �� �迭�� ������ �̸����� �����ϰ�.
			// X ->��ȭ������ �迭�� �״�� �ΰ�, �ӽ�temp �迭�� ��ȭ�迭 ����. 
			// �׸��� ���Ͻ�ų�� �ӽ�temp�迭 �̸� �ٲ㼭 ����

		 */		
		

		/**
		 * ��ü �л� ���� ��ȸ �޼��� 
		 * @param length �Էµ� �ο��� ���� 
		 */
		public void extendStudents(int length) {
			StudentScore[] studentsTemp = new StudentScore[students.length+length];
			for(int index = 0; index<students.length;index++) {
				studentsTemp[index] = students[index];	
			}
			students = studentsTemp;
	}
	/**
	 * ��ü�л� ���� ��ȸ �޼��� 
	 */
	public void printStudentScore() {
		for(int index = 0; index < count; index++) {	//���� for�� X, why? �迭�� ũ�⸸ŭ ���⶧��.
			students[index].printInfo();
		}
	}
}
