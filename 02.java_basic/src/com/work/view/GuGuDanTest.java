package com.work.view;

public class GuGuDanTest {
	
	//1. for������ Ȱ���� ������
	public static void main1(String[] args) {
		System.out.println("\n1. for������ Ȱ���� ������\n");
		for(int i = 2; i <= 9 ; i++) {
			System.out.print(i+"��\t\t");
		}
		System.out.println();
			
		for(int i = 1; i <= 9 ; i++) {
			for(int j=2;j<=9 ; j++) {
				int result=j*i;
				System.out.print(j+" * "+i +" = "+result+"\t");
			}System.out.println();
		}
		
	}
	//2.while�� Ȱ���� ������
	public static void main2(String[] args) {
		int i = 2;
		//�� �κ�
		while(i <= 9) {
			System.out.print(i+"��\t\t");
			i++;
		}
		System.out.println();
		
		i = 1; int j = 2;
		while(i<=9) {
			j=2;
			while(j<=9) {
				int result=j*i;
				System.out.print(j+" * "+i +" = "+result+"\t");
				j++;
			}
			System.out.println();
			i++;
		}

	
	}
	
	//3. do_while�� �̿��� ������  �ڡڡ��� �ɷ���
	public static void main3(String[] args) {
		int i = 2;
		
		//�� �κ�
		do {
			System.out.print(i+"��\t\t");
			i++;
		}
		while(i <= 9) ;
		System.out.println();
		
		
		//���� �κ�
		i = 1; int j = 2;
		int result = j * i;
		do {
			j=2;
			do {  // j*i��
				
				System.out.print(j+" * "+i +" = "+result+"\t");
				j++;
			}
			while(j<=9);
			
		System.out.println();
		i++;
		}
		while(i<=9);

	}
	
	//4. -- 	4. �ݺ����� Ȱ���Ͽ� ¦�� �����ܸ� ���	
											//2��	4��	....	8��
	public static void main4(String[] args) {
		//�� �κ�
		for(int i = 2; i<=9 ; i++) {
			if(i%2==0) {
			System.out.print(i+"��\t\t");
			}
		}
		System.out.println();
		
		//���� �κ� // j*i��
		int i=0,j=0;
		
		
		for(i = 1;i<= 9 ; i++) {
				j=2;
				
				for(j = 2; j<= 9 ; j++) {
					
					if(j%2==0) {
						int result = j * i;
						System.out.print(j+" * "+i +" = "+result+"\t");
					}


				}
				System.out.println();
		
	}
}
	// 5. �ݺ����� Ȱ���Ͽ� Ȧ�� ������ �����ܸ� ����غ�����	
	public static void main(String[] args) {
		//�� �κ�
		for(int i = 2; i<=9 ; i++) {
			System.out.print(i+"��\t\t");
		}
		System.out.println();
	
		
		//���� �κ� // j*i�� // i �κ��� �ٲ�����.
		int i=0,j=2;
		for(i=1; i<=9; i++) {
			
			if(i%2 == 1) {
				for (j=2;j<=9;j++) {
					int result = j * i;
					System.out.print(j+" * "+i +" = "+result+"\t");
				}
				//System.out.println();
			}
			System.out.println();
		}

	}
	
	

}
