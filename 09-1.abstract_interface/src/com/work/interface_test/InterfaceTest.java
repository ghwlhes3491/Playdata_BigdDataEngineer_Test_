package com.work.interface_test;

public class InterfaceTest {
	public static void main(String[] args) {
		//Pet pet = new Pet();	//Error : 인터페이스는 직접 객체생성 불가 
		Pet[] pets = new Pet[5];	// 부모타입의 다형성 반영한 변수 사용 가능
		pets[0] = new Dog();
		pets[1] = new Cat();
		pets[2] = new Dog();
		pets[3] = new Cat();
		pets[4] = new Dog();

		
		for (Pet p : pets) {
			p.eat();
		}
		
		//pets[0].name = "코코";//Interface의 멤버변수는 자동으로 상수(final)처리되므로 '변경불가'
		System.out.println("name : " + Pet.name);
		for (Pet p : pets) {
			System.out.println(p.name);
		}
		
	}
}
/** 인터페이스의 부모 */
interface Animal{
	public void sleep();
	
}
/** 부모 인터페이스 : 부모인터페이스 자식인터페이스 관계 - 인터페이스끼리는 상속관계 */
interface Pet extends Animal{	//하나의 클래스파일에 여러개 클래스 만들면 public 클래스는 1개만 가능
	public String name = "씩씩이";
	
	public void eat();
	//추상메서드에는 body가 와서는 안된다.{} 부분 필요 없음
	/*{	
		System.out.println("동물은 음식을 먹는다.");
	}*/
	public abstract void speak();
	public abstract void song();
}
/** 자식클래스 Dog */
class Dog implements Pet{//speak()추상 메서드 구현 필수

	@Override
	public void eat() {
		System.out.println("사료먹음");
	}

	@Override
	public void speak() {
		System.out.println("멍멍");
	}

	@Override
	public void song() {
		//구현
	}	
	@Override
	public void sleep() {
		//구현
	}
}

/** 자식클래스 Cat */
class Cat implements Pet{

	@Override
	public void eat() {
		System.out.println("저염식 먹음");
	}

	@Override
	public void speak() {
		System.out.println("냐옹");
		
	}

	@Override
	public void song() {
		//구현
	}

	@Override
	public void sleep() {
		
	}
}