package com.work.final_test;

class FinalTest {

}

//class A extends String { //The type A cannot subclass the final class String
	//String클래스는 final 이기 때문에 A가 상속할 수 X
//}
class B {
	public void doA() {
		System.out.println("A");
	}
	public final void doB() {	//재정의 불가 메서드
		System.out.println("B");
	}
}

class C extends B{
	public int count = 100;
	
	//상수 선언 방법
	public static final int MAX_COUNT= 30;	
	
	@Override
	public void doA() {
		count = 200;
		//MAX_COUNT = 500;	
		//Error : The final field C.MAX_COUNT cannot be assigned
		// final 이므로 변경할 수 없음
		System.out.println("자식에서 재정의 변경");
	}
	//public void doA() {	//Duplicate method doA() in type C
	public void doA(int no1, final int no2) {	//중복정의(오버로딩0	)
		no1 = 200;
		// no2 = 100;
		// The final local variable no2 cannot be assigned.
		// 전달받은 매개변수를 그대로 사용해야지 변경할 수 없음.
		
	}
	
//	//Error : - Cannot override the final method 
//	//final메서드 이므로 override불가 
//	@Override	
//	public void doB() {
//		System.out.println("자식에서 재정의 변경");
//	}
//	
}