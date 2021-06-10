package com.work.final_test;

class FinalTest {

}

//class A extends String { //The type A cannot subclass the final class String
	//StringŬ������ final �̱� ������ A�� ����� �� X
//}
class B {
	public void doA() {
		System.out.println("A");
	}
	public final void doB() {	//������ �Ұ� �޼���
		System.out.println("B");
	}
}

class C extends B{
	public int count = 100;
	
	//��� ���� ���
	public static final int MAX_COUNT= 30;	
	
	@Override
	public void doA() {
		count = 200;
		//MAX_COUNT = 500;	
		//Error : The final field C.MAX_COUNT cannot be assigned
		// final �̹Ƿ� ������ �� ����
		System.out.println("�ڽĿ��� ������ ����");
	}
	//public void doA() {	//Duplicate method doA() in type C
	public void doA(int no1, final int no2) {	//�ߺ�����(�����ε�0	)
		no1 = 200;
		// no2 = 100;
		// The final local variable no2 cannot be assigned.
		// ���޹��� �Ű������� �״�� ����ؾ��� ������ �� ����.
		
	}
	
//	//Error : - Cannot override the final method 
//	//final�޼��� �̹Ƿ� override�Ұ� 
//	@Override	
//	public void doB() {
//		System.out.println("�ڽĿ��� ������ ����");
//	}
//	
}