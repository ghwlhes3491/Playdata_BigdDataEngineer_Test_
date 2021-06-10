package com.work.test;

import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;

public class ObjectClassTest {
	// Member Ŭ���� : equals() ������ �׽�Ʈ
	// ȸ���� ���̵� ������ ���� ��ü 
	
	// �� ���� ��ü���θ� ���� ���� �ݵ�� equals() �޼���� ���ؾ���!!!!!!!!�ڡڡڡڡڡڡ�
	public static void main(String[] args) {
		Member dto1 = new GeneralMember("user01","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
		Member dto2 = new GeneralMember("user01","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
		Member dto3 = new GeneralMember("user02","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
		
		// ������ ��ü�� hashCode()���
		System.out.println("dto1: " + dto1.hashCode());	// ������ : a
		System.out.println("dto2: " + dto2.hashCode());	// ������ : a
		System.out.println("dto3: " + dto3.hashCode());	// ������ : b
		
		System.out.println(dto1 == dto2); // false	//�� false��?
		System.out.println(dto1 == dto3); // false
		
		System.out.println(dto1.equals(dto2));	// true
		System.out.println(dto1.equals(dto3));	// false
	
		
	}
	//Member Ŭ���� : equals() ������ ���� �ʰ� �׽�Ʈ
	//Object �� : ���� ��ü�� ���� ������ ���� ==, equals() ������ ���
	public static void main2(String[] args) {
		Member dto1 = new GeneralMember("user01","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
		Member dto2 = new GeneralMember("user01","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
		Member dto3 = new GeneralMember("user02","password01","ȫ�浿","01012341000","user01@work.com","2020-12-15","G",50000);
	// ������ ��ü�� hashCode()���
		System.out.println("dto1: " + dto1.hashCode());
		System.out.println("dto2: " + dto2.hashCode());
		System.out.println("dto3: " + dto3.hashCode());
		
		System.out.println(dto1 == dto2); // false
		System.out.println(dto1 == dto3); // false
		
		System.out.println(dto1.equals(dto2));	//false
		System.out.println(dto1.equals(dto3));	//false
	
	}
	//Object �� : ���� ��ü�� ���� ������ ���� ==, equals() ������ ���
	public static void main1(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		System.out.println(obj1.hashCode());	// hashCode() : ������ �����ִ� �޼���
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println();
		System.out.println(obj1 == obj2); // fasle
		System.out.println(obj1 == obj3); // true
		
		System.out.println(obj1.equals(obj2));	//fasle
		System.out.println(obj1.equals(obj3));	//true
	}
}
