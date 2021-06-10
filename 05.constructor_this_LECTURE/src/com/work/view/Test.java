package com.work.view;

import com.work.model.dto.StudentScore;
import com.work.model.service.StudentScoreService;

/**
 * <pre>
 * �л� ���� ���� ���α׷� ���� Ŭ����
 * </pre>
 * 
 * @author �Ӱ���
 * @version ver.1.0
 * @since jdk.1.8
 * @see com.work.model.dto.StudentScore
 * @see com.work.model.service.StudentScoreService
 */
public class Test {
	
	/* this() �׽�Ʈ */
	public static void main3(String[] args) {
		StudentScore dto3 = new StudentScore("3��", "�̼���", 88);
		dto3.printInfo();
	}
	
	/* ������ �׽�Ʈ */
	public static void main2(String[] args) {
		// �⺻������ �̿��� ��ü ����
		StudentScore dto1 = new StudentScore();
		dto1.studentNo = "1��";
		dto1.setName("ȫ�浿");
		dto1.setScore(92);
		
		// �ʼ��ʱ�ȭ������ �̿��� ��ü ����
		StudentScore dto2 = new StudentScore("2��", "������");
		dto2.setScore(92);
		
		// ��ü�ʱ�ȭ������ �̿��� ��ü ����
		StudentScore dto3 = new StudentScore("3��", "�̼���", 88);
		
		dto1.printInfo();
		dto2.printInfo();
		dto3.printInfo();
	}

	/**
	 * {92, 85, 77, 98, 65};
	 * �л� ���� ���� ���α׷� ���� �޼���
	 * @param args ���۽� ���޹��� ���ڿ�Ÿ�� �迭����
	 */
	public static void main(String[] args) {
		StudentScoreService service = new StudentScoreService(100); // ȸ�������ڷ����屸�� �迭��ü 100�� ����
		
		// ȸ�������ڷ����屸�� �迭�� �����ؼ� ���� ����
		//service.students = null; 
		
		System.out.println("\n### ���");
		service.addStudentScore("1��", "ȫ�浿", 92);		// null => �迭��ü ���� �Ұ� => NullPointerException ���ܹ߻� ��������
		service.addStudentScore("2��", "������", 85);
		service.addStudentScore("3��", "�̼���", 77);
		service.addStudentScore("4��", "������", 98); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		service.addStudentScore("5��", "������", 65);
		
//		service.students = null;	
		// ���� �л����� ���������� ����� �迭��ü�� �޸𸮿��� ����� => �л����Ǽ������� ����(��û������)
		// public => private ���ٱ��� �������� ���ؼ� �ܺο��� �Ժη� ����Ұ� (���ȹ��� �ذ�)
		
		//System.out.println("\n### ���� ��� �л��� : " + service.count);
		System.out.println("\n### ���� ��� �л��� : " + service.getCount());
		
		//service.count = 500; // => �л���� ���� �� ������ ����� �迭��� �ε�����ȣ ����
		service.addStudentScore("1��", "ȫ�浿", 92);  // java.lang.ArrayIndexOutOfBoundsException: 500 ����� ���ܹ߻�
		
		System.out.println("\n### ��ü �л� ���� ��ȸ");
		service.printStudentScore(); // null => �迭��ü ���� �Ұ� => NullPointerException ���ܹ߻� ��������
	}

}
