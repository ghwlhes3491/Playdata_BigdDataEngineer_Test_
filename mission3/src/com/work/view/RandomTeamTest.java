package com.work.view;

import java.util.Random;
/* ���� ���� operator
 * ���� ���� {@link String#compareTo(string)}
 * ������ ���� �� ��������
 * 1. �Ϻ� �������� �ߺ� ������
 * 2. ���� �̸� ����
 * �������� 
 */
public class RandomTeamTest {

	public static void main(String[] args) {
		int teamMemberLengthCols = 4;
		if (args.length == 1) {
			teamMemberLengthCols = Integer.parseInt(args[0]);
		} else {
			System.out.println("[�����  java RandomTeamTest ���� �ο� ����]");
			System.out.println("[���� �ο����� �Է����� �ʾ� ���� �ο����� �⺻ 4������ �����մϴ�.]");
		}
		
		String[] names = {
			"��⿵", "�質��", "�����", "�����", "������", "������", "����ȯ", "���ָ�", "���ֿ�", "������", 
			"������", "������", "������", "���ѳ�", "������", "�ڹ���", "�ڿ���", "������", "������", "����", 
			"���ؼ�", "���±�", "���ñ�", "�����", "������", "������", "�ֳ���", "�Ѵٿ�", "Ȳ����", "������"
		};
		
		String[][] teamMembers = null;
		int teamLengthRows = names.length / teamMemberLengthCols;;
		int remainderLength = names.length % teamMemberLengthCols;
		
		if (remainderLength == 0) { 
			teamMembers = new String[teamLengthRows][teamMemberLengthCols];
			System.out.println(teamLengthRows + "���� ���� " + teamMemberLengthCols + "���� ������ �յ��ϰ� �����մϴ�.");
		} else {
			teamMembers = new String[teamLengthRows][];
			for (int index = 0; index < remainderLength; index++) {
				teamMembers[index] = new String[teamMemberLengthCols + 1];
			}
			
			for (int index = remainderLength; index < teamLengthRows; index++) {
				teamMembers[index] = new String[teamMemberLengthCols];
			}
			
//			for (int teamRows = 0; teamRows < teamMembers.length; teamRows++) {
//				System.out.println((teamRows + 1) + "���� ������ " + teamMembers[teamRows].length + "���� �����մϴ�.");
//			}
			
			System.out.println(teamLengthRows + "���� ���� " + teamMemberLengthCols + "���� �����մϴ�.");
			System.out.println("���� �ο��� " + remainderLength + "���� ���� 1�� �߰��� �յ� �����մϴ�.");
		}
		
		int[] uniqueNamesIndex = new int[names.length];
		int uniqueLength = 0;
		
		int randomNo;
		for (int teamRows = 0; teamRows < teamMembers.length; teamRows++) {
			for (int teamCols = 0; teamCols < teamMembers[teamRows].length; teamCols++) {
				
				randomLoop:
				while(true) {
					randomNo = getRandomNo();
					for (int index = 0; index < uniqueLength; index++) {
						if (uniqueNamesIndex[index] == randomNo) {
							continue randomLoop;
						}
					}
					
					uniqueNamesIndex[uniqueLength] = randomNo;
					teamMembers[teamRows][teamCols] = names[randomNo];
					break randomLoop;
				} 
				
			}
		}
		
		System.out.println();
		System.out.println("[���� ���� ���� ����]");
		
		for (int teamRows = 0; teamRows < teamMembers.length; teamRows++) {
			System.out.print((teamRows + 1) + "�� ���� : ");
			for (int teamCols = 0; teamCols < teamMembers[teamRows].length; teamCols++) {
				System.out.print(teamMembers[teamRows][teamCols] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean isUniqueNo(int randomNo) {
		return false;
	}

	public static int getRandomNo() {
		Random random = new Random((long)(Math.random() * System.nanoTime()));
		return random.nextInt(30);
	}
}

/*
## ������
	
1. ���� : java RandomTeamTest 10
3���� ���� 10���� ������ �յ��ϰ� �����մϴ�.

[���� ���� ���� ����]
1�� ���� : ������	���ָ�	�ֳ���	�ڿ���	��⿵	���ؼ�	������	���ָ�	���ñ�	������	
2�� ���� : ������	������	Ȳ����	�����	���ؼ�	������	�����	���±�	������	�Ѵٿ�	
3�� ���� : �����	������	������	������	������	������	������	������	������	������	
	
2. ���� : java RandomTeamTest 
[���� �ο����� �Է����� �ʾ� ���� �ο����� �⺻ 4������ �����մϴ�.]

[���� ���� ���� ����]
1�� ���� : ������	������	�����	�ڹ���	������	
2�� ���� : ������	������	Ȳ����	��⿵	������	
3�� ���� : ������	�Ѵٿ�	���±�	�ڹ���	
4�� ���� : Ȳ����	���±�	���ָ�	������	
5�� ���� : ������	������	������	���ñ�	
6�� ���� : �����	������	���ñ�	������	
7�� ���� : ��⿵	�質��	������	�ֳ���		
	
3. ���� : java RandomTeamTest 7 
4���� ���� 7���� �����մϴ�.
���� �ο��� 2���� ���� 1�� �߰��� �յ� �����մϴ�.

[���� ���� ���� ����]
1�� ���� : ����	������	�����	��⿵	�質��	�ֳ���	���ñ�	���ѳ�	
2�� ���� : ������	�ڹ���	��⿵	�����	������	���ؼ�	�Ѵٿ�	������	
3�� ���� : ������	���ֿ�	�Ѵٿ�	�Ѵٿ�	�����	������	������	
4�� ���� : ������	������	���ñ�	���ñ�	������	�����	��⿵	

4. ���� : java RandomTeamTest 5
6���� ���� 5���� ������ �յ��ϰ� �����մϴ�.

[���� ���� ���� ����]
1�� ���� : ������	������	�質��	������	������	
2�� ���� : ������	�ڹ���	���±�	�Ѵٿ�	�����	
3�� ���� : ������	�ڹ���	������	�ֳ���	�Ѵٿ�	
4�� ���� : ������	������	�ڹ���	������	����	
5�� ���� : ������	������	�Ѵٿ�	��⿵	������	
6�� ���� : �ڹ���	�����	���ѳ�	���ֿ�	�ڿ���	

5. ���� : java RandomTeamTest 6
5���� ���� 6���� ������ �յ��ϰ� �����մϴ�.

[���� ���� ���� ����]
1�� ���� : �����	���ñ�	������	��⿵	������	���ָ�	
2�� ���� : ����	������	����	���ֿ�	�����	�����	
3�� ���� : ������	������	���ֿ�	���ָ�	�Ѵٿ�	�ֳ���	
4�� ���� : ���ñ�	������	��⿵	�����	���ָ�	�ڿ���	
5�� ���� : ������	������	������	�ֳ���	���ؼ�	������	

*/