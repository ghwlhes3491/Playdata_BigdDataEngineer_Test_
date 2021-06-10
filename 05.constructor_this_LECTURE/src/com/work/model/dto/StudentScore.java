package com.work.model.dto;

/**
 * <pre>
 * �л��� �������� ������ Ŭ���� 
 * </pre>
 * @author �Ӱ���
 * @version ver.1.0
 * @since jdk1.8
 */
public class StudentScore {
	/** �й� : �ĺ�Ű */
	public String studentNo = "210517";
	
	/** �̸� : �ʼ� */
	public String name;
	
	/** ���� : ���� */
	public int score;
	
	
	/** �⺻ ������ */
	public StudentScore() {
		System.out.println("�⺻������ ���� : ��ü������ ������� : �ٶ����");
	}
	
	/**
	 * �ʼ� ������ �ʱ�ȭ ������
	 * @param studentNo �й�
	 * @param name �̸�
	 */
	public StudentScore(String studentNo, String name) {	
		this();
		this.studentNo = studentNo;
		this.name = name;
		//System.out.println("�ʼ��ʱ�ȭ������ ���� : �����");
	}
	
	/**
	 * ��ü������ �ʱ�ȭ������
	 * 
	 * @param studentNo �й�
	 * @param name �̸� 
	 * @param score ����
	 */
	public StudentScore(String studentNo, String name, int score) {
		this(studentNo, name);
//		this.studentNo = studentNo;
//		this.name = name;
		this.score = score;
		//System.out.println("��ü�ʱ�ȭ������ ���� : �����");
	}
	
	
	/**
	 * �л��� ���� ���� ��� �޼��� 
	 */
	public void printInfo() {
		System.out.println(studentNo + ",\t" + name + ",\t" + score);
	}
	
	/**
	 * ���� ���� �޼���
	 * @param modifyScore ���� ����
	 */
	public void setScore(int modifyScore) {
		score = modifyScore;
	}

	/**
	 * �л� ���� ��ȸ �޼���
	 * @return �л� ����
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * �л� �̸� ���� �޼���
	 * @param modifyName ���� �̸�
	 */
	public void setName(String modifyName) {
		name = modifyName;
	}
	
	/**
	 * �л� �̸� ��ȸ �޼���
	 * @return �л� �̸�
	 */
	public String getName() {
		return name;
	}
}







