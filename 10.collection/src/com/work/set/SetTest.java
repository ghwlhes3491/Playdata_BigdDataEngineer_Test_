package com.work.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class SetTest {
	public static void main(String[] args) {	//set으로하면 instanceof , typecasting 없어도 됨.
		//jdk1.4 version 
		//HashSet set = new HashSet();
		
		//jdk1.5 Generic : Member 저장되는 전용 Collection
		HashSet<Member> set = new HashSet<Member>();

		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user01", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
		

		//
		System.out.println(set.add("Hello")); //true
		System.out.println(set.add("Hello")); //false	
		System.out.println(set.add("Hello")); //false	
		System.out.println();
		
		System.out.println(set.add("Hello")); //false	
		System.out.println(set.add("Hello")); //false	
		System.out.println();
		
		System.out.println(set.add(1004)); 		//true	
		System.out.println(set.add(new Integer(1004)));	//false Integer는 int로 자동형변환
		System.out.println();
		
		System.out.println(set.add(dto1)); //true	
		System.out.println(set.add(dto2)); //false	//memberId같으면 같은걸로 설정	
		System.out.println(set.add(dto3)); //true	
		System.out.println(set.add(dto4)); //true	
		System.out.println(set.add(dto5)); //true	
		System.out.println(set.add(new Date())); //true	
		
		System.out.println("저장 갯수 : " + set.size());	//7개인데 Integer까지 true돼서 8나옴....	
		
		//조회 : 전체조회
		System.out.println("\n[전체 조회]");
		Iterator<Member> iterator = set.iterator();
	
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
		//전체 조회후 hasNext()가 이미 끝으로 갔기 때문에 맨 처음으로 되돌려주는 코드 필요
		iterator = set.iterator();	//iterator
		//조회 : 아이디가 "user01" 객체의 정보 조회 :instanceof(), typecasting [실습]
		System.out.println("\n[상세 조회]");
		while(iterator.hasNext()) {	//set에서 아이디 비교 어떻게 하지?
			Member dto = iterator.next();
			if(dto.getMemberId().equals("user01")) {
					System.out.println(dto);
					break; 		//반복문 빠져나오기 : list가 아니라 set이라 중복 없음
			}
		}
		
		
		//삭제 see -- boolean remove(Object o)
		System.out.println("\n[삭제] : user04");	 
		iterator = set.iterator();	//처음으로 
		while(iterator.hasNext()) {
			Object dto = iterator.next();
			if(dto.equals("user04")) {
				set.remove(dto);
					break;
				}
		}
	
			
		//조회 : 전체조회
		System.out.println("\n[전체 조회]");
		iterator = set.iterator();
	
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			Object obj = iterator.next();
			System.out.println(obj);
		}		
	}
	
	public static void main1(String[] args) {
		//jdk1.4 version 
		//Collection Set : 순서없음, 중복불가
		HashSet set = new HashSet();	//HashSet은 (interface아닌) class
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G", 50000);
		Member dto2 = new GeneralMember("user01", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G", 950000);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
		

		//
		System.out.println(set.add("Hello")); //true
		System.out.println(set.add("Hello")); //false	
		System.out.println(set.add("Hello")); //false	
		System.out.println();
		
		System.out.println(set.add("Hello")); //false	
		System.out.println(set.add("Hello")); //false	
		System.out.println();
		
		System.out.println(set.add(1004)); 		//true	
		System.out.println(set.add(new Integer(1004)));	//false Integer는 int로 자동형변환
		System.out.println();
		
		System.out.println(set.add(dto1)); //true	
		System.out.println(set.add(dto2)); //false	//memberId같으면 같은걸로 설정	
		System.out.println(set.add(dto3)); //true	
		System.out.println(set.add(dto4)); //true	
		System.out.println(set.add(dto5)); //true	
		System.out.println(set.add(new Date())); //true	
		
		System.out.println("저장 갯수 : " + set.size());	//7개인데 Integer까지 true돼서 8나옴....	
		
		//조회 : 전체조회
		System.out.println("\n[전체 조회]");
		Iterator iterator = set.iterator();
	
		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
		//전체 조회후 hasNext()가 이미 끝으로 갔기 때문에 맨 처음으로 되돌려주는 코드 필요
		iterator = set.iterator();	//iterator
		//조회 : 아이디가 "user01" 객체의 정보 조회 :instanceof(), typecasting [실습]
		System.out.println("\n[상세 조회]");
		while(iterator.hasNext()) {	//set에서 아이디 비교 어떻게 하지?
			Object obj = iterator.next();
			if(obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberId().equals("user01")) {
					System.out.println(dto);
					break; 		//반복문 빠져나오기 : list가 아니라 set이라 중복 없음
				}
			}

		}
		
		//삭제 see - 
		System.out.println("\n[삭제] : user04");	 
		iterator = set.iterator();	//처음으로 
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			if(obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberId().equals("user04")) {
					set.remove(dto);
					break;
				}
		}
	}
			
		//조회 : 전체조회
		System.out.println("\n[전체 조회]");
		iterator = set.iterator();
	
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
//			Object obj = iterator.next();
//			System.out.println(obj);
		}
	}
}
