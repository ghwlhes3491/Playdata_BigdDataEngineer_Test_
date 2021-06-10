package com.work.list;

import java.util.ArrayList;
import java.util.Date;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class ListTest {

	public static void main(String[] args) {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
	
	//회원들을 저장하기 위한 자료저장 구조 - List(순서O, 중복X)
	ArrayList list = new ArrayList();
	System.out.println();
	//등록 : add(Object)	: boolean
	System.out.println(list.add("Hello")); //[0]
	System.out.println(list.add("Hello")); //[1]
	System.out.println(list.add("Hello")); //[2]
	System.out.println(list.add("Hello")); //[3]
	System.out.println(list.add("Hello")); //[4]
	System.out.println(list.add(1234)); //[5]
	System.out.println();
	System.out.println(list.add(new Integer(1004)));	 //[6]
	System.out.println(list.add(dto1)); //[7]
	System.out.println(list.add(dto2)); //[8]
	System.out.println(list.add(dto3)); //[9]
	System.out.println(list.add(dto4)); //[10]
	System.out.println(list.add(dto5)); //[11]

	System.out.println(list.add(new Date()));
	System.out.println();
	
	//저장 크기 : size() : int
	System.out.println("size: " +list.size());
	System.out.println();
	
	// 조회 : index값이 7인 요소 저장 객체
	Object obj = list.get(7);
	System.out.println("7번째 요소 삭제 > " + obj); //재정의로 맨 마지막에온...어쩌고,..? new GeneralMember
	System.out.println();
	
	//변경 : 첫번째요소 객체 : 임의의 정보로 변경
	obj = list.set(1, dto5);
	System.out.println("변경 전 1번째 요소 객체 :" + obj);
	System.out.println("변경 후 1번째 요소 객체 : " + list.get(1));
	System.out.println();
	
	//삭제
	list.remove(5);
	list.remove(6);
	list.remove(7);
	System.out.println();
	
	//전체조회
	System.out.println("size : "+ list.size());
	for(int index = 0 ; index < list.size() ; index++) {
		System.out.println("[" + index + "]" + list.get(index));
	}
	}

}
