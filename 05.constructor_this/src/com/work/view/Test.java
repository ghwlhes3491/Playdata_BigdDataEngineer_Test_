package com.work.view;

import com.work.model.dto.StudentScore;
import com.work.model.service.StudentScoreService;

/**
 * <pre> 
 * �л� ���� ���� ���α׷� ���� Ŭ���� 
 * 1. ��� ���
 * 2. ��ȸ ���
 * 3. ���� ��� ���
 * 4. ��� ��� ���
 *</pre> 
 * @author ������
 * @version 1.0
 * @since jdk1.8
 * @see	com.work.model.dto.StudentScore
 * @see com.work.dtoStudentScore#printInfo()
 * @see com.work.model.service.StudentScoreService
 */
public class Test {

	/*this() �׽�Ʈ*/
	public static void main3(String[] args) {
		StudentScore dto3 = new StudentScore("3��","�̼���",88);
		dto3.printInfo();
	}
	
	public static void main2(String[] args) {//���ļ���
		//�⺻������ �̿��Ͽ� ��ü ���� 
		StudentScore dto1 = new StudentScore();
		dto1.studentNo = "1��";
		dto1.setName("ȫ�浿");
		dto1.setScore(92);
		
		//�ʼ��ʱ�ȭ ������ �̿��ؼ� ��ü ���� 
		StudentScore dto2 = new StudentScore("2��","������");
		dto2.setScore(92);
		
		// ��ü �ʱ�ȭ ������ �̿��� ��ü ����
		StudentScore dto3 = new StudentScore("3��","�̼���",88);
		
		dto1.printInfo();
		dto2.printInfo();
		dto3.printInfo();
	}
	/**
	 * 
	 * @param args�л� ���� ���� ���α׷� ���� �޼��� 
	 * 
	 */
	public static void main(String[] args) {//��������
		StudentScoreService service = new StudentScoreService();
		
		//����Ʈ�� ũ�⸦ �˻��� �� �ִ� ���� �ʿ�
		
		System.out.println("\n ## ��ϱ�� ");
		service.addStudentScore("1��", "ȫ�浿", 92);	//NULL =>�迭��ü ���� �Ұ� => ���ܹ߻� ��������
		service.addStudentScore("2��", "������", 85);
		service.addStudentScore("3��", "�̼���", 77);
		service.addStudentScore("4��", "������", 98);
		service.addStudentScore("5��", "������", 65);

		service.students = null; 
		// �����л����� ���� ������ ����� �迭��ü�� �޸𸮿��� �����=> �л����� �������� ����(!!��û��ū��!)
		//	public =>private ���ٱ��� �������� ���ؼ� �ܺο��� �Ժη� ����Ұ�(���ȒL�����ذ�)			
		
		System.out.println("\n ## ���� ��ϵ� �л��� : "+service.count);//
		System.out.println("\n ## ���� ��ϵ� �л��� : "+service.getCount());
		
		service.count = 500;	//=> �л� ��� ���� �� ������ ����� �迭��� �ε��� ��ȣ ���� �߻� 
		service.addStudentScore("1��","ȫ�浿",92);	//�ٲ����� ���ϰ� �ϵ�(����) , ��ȸ�� �����ϰ� �Ϸ���? 
		
		System.out.println("\n ## ��ü �л� ���� ��ȸ  : ");
		service.printStudentScore();	//null =>�迭��ü ���� �Ұ� => ���ܹ߻� ��������
		service.students = null;
			
	}
}
