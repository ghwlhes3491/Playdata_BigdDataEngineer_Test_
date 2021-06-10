package com.work.abstract_test;

public class AbstractTest {
	public static void main(String[] args) {
		//Pet pet = new Pet();	//Error : �߻�Ŭ������ ���� ��ü���� �Ұ� 
		Pet[] pets = new Pet[5];	// �θ�Ÿ���� ������ �ݿ��� ���� ��� ����
		pets[0] = new Dog();
		pets[1] = new Cat();
		pets[2] = new Dog();
		pets[3] = new Cat();
		pets[4] = new Dog();

		
		for (Pet p : pets) {
			p.eat();
		}
		
		pets[0].name = "����";
		for (Pet p : pets) {
			System.out.println(p.name);
		}
		
	}
}
/** �θ� �߻� Ŭ����*/
abstract class Pet{	//�ϳ��� Ŭ�������Ͽ� ������ Ŭ���� ����� public Ŭ������ 1���� ����
	public String name = "������";
	
	public void eat() {
		System.out.println("������ ������ �Դ´�.");
	}
	public abstract void speak();
	public abstract void song();
}
/** �ڽ�Ŭ���� Dog */
class Dog extends Pet{//speak()�߻� �޼��� ���� �ʼ�

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
	
	
}
/** �ڽ�Ŭ���� Cat */
class Cat extends Pet{

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
	
	
}