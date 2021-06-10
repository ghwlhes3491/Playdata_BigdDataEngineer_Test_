package com.work.interface_test;

public class InterfaceTest {
	public static void main(String[] args) {
		//Pet pet = new Pet();	//Error : �������̽��� ���� ��ü���� �Ұ� 
		Pet[] pets = new Pet[5];	// �θ�Ÿ���� ������ �ݿ��� ���� ��� ����
		pets[0] = new Dog();
		pets[1] = new Cat();
		pets[2] = new Dog();
		pets[3] = new Cat();
		pets[4] = new Dog();

		
		for (Pet p : pets) {
			p.eat();
		}
		
		//pets[0].name = "����";//Interface�� ��������� �ڵ����� ���(final)ó���ǹǷ� '����Ұ�'
		System.out.println("name : " + Pet.name);
		for (Pet p : pets) {
			System.out.println(p.name);
		}
		
	}
}
/** �������̽��� �θ� */
interface Animal{
	public void sleep();
	
}
/** �θ� �������̽� : �θ��������̽� �ڽ��������̽� ���� - �������̽������� ��Ӱ��� */
interface Pet extends Animal{	//�ϳ��� Ŭ�������Ͽ� ������ Ŭ���� ����� public Ŭ������ 1���� ����
	public String name = "������";
	
	public void eat();
	//�߻�޼��忡�� body�� �ͼ��� �ȵȴ�.{} �κ� �ʿ� ����
	/*{	
		System.out.println("������ ������ �Դ´�.");
	}*/
	public abstract void speak();
	public abstract void song();
}
/** �ڽ�Ŭ���� Dog */
class Dog implements Pet{//speak()�߻� �޼��� ���� �ʼ�

	@Override
	public void eat() {
		System.out.println("������");
	}

	@Override
	public void speak() {
		System.out.println("�۸�");
	}

	@Override
	public void song() {
		//����
	}	
	@Override
	public void sleep() {
		//����
	}
}

/** �ڽ�Ŭ���� Cat */
class Cat implements Pet{

	@Override
	public void eat() {
		System.out.println("������ ����");
	}

	@Override
	public void speak() {
		System.out.println("�Ŀ�");
		
	}

	@Override
	public void song() {
		//����
	}

	@Override
	public void sleep() {
		
	}
}