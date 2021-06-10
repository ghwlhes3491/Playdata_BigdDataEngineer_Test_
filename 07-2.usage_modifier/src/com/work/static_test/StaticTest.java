package com.work.static_test;

public class StaticTest {
	//class 멤버변수(static)
	public static String classTitle = "빅데이터과정";
	
	//instance 멤버변수
	public String instanceTitle = "자바프로그래밍";
	
	public static void main(String[] args) {
		System.out.println(classTitle);
		// static 멤버는 그냥 사용 가능
		
		//System.out.println(instanceTitle); 
		//error : Cannot make a static reference to the non-static field instanceTitle
		StaticTest test = new StaticTest();
		System.out.println(test.instanceTitle);
		// 같은 클래스에 있는 instance 멤버는 static 메서드에서는 반드시 명시적으로 생성 후 참조변수를 통해서 사용
		System.out.println((int)(Math.random()*10));
		System.out.println(Math.PI);
	}
	
	public void instanceMethod() {
		System.out.println(instanceTitle);
		//ok : 같은 클래스에 있는 instance 멤버끼리는 그냥 호출 사용 가능
		//		(메모리 로딩시점이 동일하게 함께 이루어짐)
	}
			
	//static 멤버변수, instanceof멤버변수 테스트
	public static void main1(String[] args) {
		System.out.println();
		
		SimpleMember.classcount = 10;
		System.out.println(SimpleMember.classcount);
		SimpleMember dto1 = new SimpleMember();
		System.out.println();
		
		SimpleMember dto2 = new SimpleMember();
		
		dto1.classcount = 1000;
		dto1.instancecount = 100;
		
		dto2.classcount = 2000;
		dto2.instancecount = 200;
		
		SimpleMember.classcount = 5000;
		
		System.out.println(dto1.classcount);
		System.out.println(dto1.instancecount);
		System.out.println();
		
		System.out.println(dto2.classcount);
		System.out.println(dto2.instancecount);
		System.out.println();
		
		System.out.println(SimpleMember.classcount);
		
	}

}
