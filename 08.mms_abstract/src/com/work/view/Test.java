package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;
import com.work.model.service.MemberService;

public class Test {
	public static void main(String[] args) {

		Member dto1 = new GeneralMember("user01","password01","홍길동","01012341000","user01@work.com","2020-12-15","G",50000);
		Member dto2 = new GeneralMember("user02","password01","강감찬","01012342000","user02@work.com","2021-01-05","G",950000);
		Member dto3 = new SpecialMember("user03","password01","이순신","01012343000","user03@work.com","2020-11-15","S","강동원");
		Member dto4 = new SpecialMember("user04","password01","김유신","01012344000","user04@work.com","2021-01-05","S","김하린");
		Member dto5 = new AdminMember("administrator","admin1004","유관순","01012345000","administrator@work.com","2021-04-01","A","선임");
		
		//MemberServiceAbstract service = new MemberServiceAbstract();
		// error : ?
		//이유 :  추상클래스는 직접 객체 생성 불가 
		
		//회원관리 서비스를 이용하기 위한 구현 객체 생성
		print("회원관리 서비스 이용을 위한 객체 생성");
		MemberService service = new MemberService();
		print("회원등록");
		
		service.addMember(dto1);
		service.addMember(dto2);
		service.addMember(dto3);	// 중복문제 어떻게 해결?
		service.addMember(dto4);
		service.addMember(dto5);
		
		service.addMember(dto1);
		service.addMember(dto2);
		service.addMember(dto3);
		
		print("등록 인원수 :" + service.getCount());
		
		
		print("user01 상세조회");
		Member dto = service.getMember("user01");
		if(dto != null) {
			System.out.println(dto);//  virtual method invocation : 실제 자식객체 재정의한 toString()수행결과 출력
		}
		
		print("user99 상세조회");
		dto = service.getMember("user99");
		if(dto != null) {
			System.out.println(dto);//  virtual method invocation : 실제 자식객체 재정의한 toString()수행결과 출력
		}
ㅂ
	}
		
		/**테스트시에 출력을 위한 메서드*/
		public static void print(String message) {
			System.out.println("\n### "+message);
		}
}
