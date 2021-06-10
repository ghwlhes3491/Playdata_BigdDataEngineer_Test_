package com.work.view;

import java.util.Random;

//�ƱԸ�Ʈ - �Ű�����
public class RandomTeamTest {

	/* �ǽ�
	 * �� ���� 30�� �л����� ������� �����ϰ� ���� �����ϴ� ���α׷��� �����Ͻÿ�
	 * 1. �� �� �ο��� : ������? ������? 
	 * >>������ : ����ڷκ��� �Է� �ޱ�(IO, main(String[] args)�� arguments���� �ޱ�)
	 * ����� �Է� 1) IO (java.io api Ȱ��)
	 * 			2) main(String[] args) arguments : ���ڸ� �Է��ص� String��
	 * 				- String ������ ���ڿ��� ����Ÿ��(int)��ȯ ��� ���
	 * 				- main()�޼ҵ忡 �ƱԸ�Ʈ �����ؼ� �����ϴ� ���?
	 * 
	 * -> �迭�̸�[i].length
	 * 
	 * 2. �����ϰ� �迭��Ҹ� �����ϱ� ���� ���?
	 * >> 30��
	 * >> 30�� String[]�迭 �����Ͽ� �л����� �̸� ����
	 * >> �迭��� �ε��� ��ȣ : 0 ~ '�迭ũ��-1'
	 * >> java.util.Random API Ȱ���Ͽ� ������ ���ڸ� �����ϴ� ��ƿ��Ƽ Ŭ���� ����.
	 * 
	 * 3. ���� �ο��� � ���� ���� �� ������?
	 * >> ���� �ο��� ù��° ������ ������� 1���� �ϰ� ���� �� ������?
	 * >> �����ϴ� ���� �����ϰ� ó���Ͽ� ���� �� ������?
	 * 
	 */
	public static void main(String[] args) {
		if (args.length != 1) {	//�ùٸ��� ������ ���α׷� ����
			System.out.println("Usage : java RandomTeamTest ��������");
			System.exit(0);
		}
		int teamLength = Integer.parseInt(args[0]);		// String ���ڿ� Ÿ���� ���� �����͸� int Ÿ������ ��ȯ
		//�л��� �̸� ������ �迭��� 30�� ����
		//2���� �迭 ��ũ��, ��ũ�� �м��Ͽ� ���� �� �����ϴ� Logic
		
		
		System.out.println(args.length);
		for(int index = 0 ; index <args.length; index++ ) {
			System.out.println(args[index]);
		}
		int random = getRandomNo();	//�����ϰ� ����� ���ڸ� random������ ����.
		System.out.println(random);
		
	}
	
	public static int getRandomNo() {
		/* ������ ������ ���ڸ� �����ϱ� ���� ���� �ڵ��Դϴ�. */
		Random extractNo = new Random((long)(Math.random() * System.nanoTime()));
		/* 0 ~ 29 ������ ������ ���� ���� */
		int no = extractNo.nextInt(30); 
		return no;
		
		//random()�� 0.0~1.0������ double�� ��ȯ��.
	}

}