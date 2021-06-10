package com.work.view;

import java.util.Random;

public class Lotto645 {
/*
 * #���� ���� : ���� �ʿ� (�ǹ� : �������� ���׷��̵�) 
 * 1. ���� �˰��� ������ �� 
 * 2. �ܰ��� ��� => ���� ���� �˰��� 1�� : �� 5����
 * => 1�����迭 => 2���� �迭�� ���� or 1���� �޼��带 ���߰��Ӹ�ŭ �ݺ� ȣ�� ����
 * 
 * #���
 * -- �ݺ��� break;coutinue;���� �ٽ� ã�ƺ��� 
 * -- ��ø�ݺ���
 * 	=> �ݺ����� ���̺� �������
 * 	=> break ���̺��; 
 *  => continue ���̺��;
 */
	public static void main(String[] args) {
		int[] lottos = new int[6];
		int uniqueLength = 0;
		
		int randomNo;
		outerLoop:
		while(uniqueLength < 6) {
			randomNo = getLottoNo();
			
			for (int index = 0; index < uniqueLength; index++) {
				if (lottos[index] == randomNo) {
					continue outerLoop;
				}
			}
			
			lottos[uniqueLength++] = randomNo;
		}
		
		System.out.print("[1�� ��÷���� ��ȣ] ");
		for (int index = 0; index < lottos.length; index++) {
			System.out.print(lottos[index] + "\t");
		}
		System.out.println();
		
	}

	public static int getLottoNo() {
		Random random = new Random((long)(Math.random() * System.nanoTime()));
		return random.nextInt(45) + 1;
	}
	
}
