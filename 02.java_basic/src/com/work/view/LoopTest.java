package com.work.view;

public class LoopTest {
/*
	public static void main1(String[] args) {
		//for ������ �̿��ؼ� 1~10���� ����ϸ鼭 ������ ����� ����غ�����
		int sum=0;

		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {	//¦�� ���� : 2�� �������� �� ������ �� �̿�
			sum+=i;
			System.out.println(i);
			}
		}
		System.out.printf("���� ��� : %d\n", sum);
	}
	*/
	
	
	/* �ǽ� : ���� �빮�ڿ� ���� 'ascii code'�� ����ϴ� ���α׷� �ۼ�
	 *  hint : ���ĺ��� �� 26��, type casting�̿�
	 *  <�������>
	 *  A : 65
	 *  B: 66
	 *  ...
	 *  Z : nn
	 */
	
	public static void main3(String[] args) {
		char alp='Z';
		for(int i = (int)'A'; i <= (int)alp; i++) { //������ ����ȯ
			System.out.println((char)i+" : "+(int)i);
			//System.out.printf("%c : %d\n", i, (int)i);
		}
		
		System.out.println();
		
		for( char i ='A'; i<='Z';i++) { //���� ��Ȯ�� �� (1)char ����.
			System.out.println(i+" : "+(int)i);
		}
		
		System.out.println();
		
		for( int i ='A'; i<='Z';i++) { //���� ��Ȯ�� �� (2)int ���� //�ڵ� ����ȯ
			System.out.println((char)i+" : "+i);
		}
		
		//�� ��� j�� �� int�� ��?
		for (int i=1, j='A';i<=26; i++,j++) {
			System.out.println(j+" : "+ j);
		}
		
		int i,j;
		i = 0;
		j=0;
		System.out.println(i+","+j);
	}

	public static void main(String[] args) {
		/*�ǽ� : 1���� 5���� ������ ��� ���*/
		int sum = 0; 
		int i = 0;
		
		System.out.println("1. for���� ");
		for(i = 1; i<=5;i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("���� ��� : " + sum);
		
		System.out.println("2. while����");
		i = 1; sum = 0;
		while(i<=5) {
			System.out.println(i);
			sum+=i;
			i++;
		}
		System.out.println("���� ��� : " + sum);
		
		System.out.println("3. do~while����");
		i = 1; sum = 0;
		do {
			System.out.println(i);
			sum+=i;
			i++;
		}while(i<=5);
		System.out.println("���� ��� : " + sum);
	}
	
}