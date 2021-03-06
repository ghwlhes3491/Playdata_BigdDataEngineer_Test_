package com.work.view;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

public class Test {
	//instanceof, typecasting, virtual method invocation 테스트
	public static void main(String[] args) {
		//회원 초기화데이터 참고해서 회원 5명 객체 생성
		// 참조변수 타입은 부모타입 : 변수 다형성 
		Member dto1 = new GeneralMember("user01","password01","홍길동","01012341000","user01@work.com","2020-12-15","G",50000);
		System.out.println(dto1.toString());//자식이 재정의해놓은 자식의 toString()호출 수행 >>>,5000나옴<<<<
		dto1.getMemberId();
		//dto1.getMileage();// ▶▶ 안되어야 하는데 왜 돼?
		//error : 부모타입의 참조변수는 자식의 멤버 접근 불가
		
		//실제 메머로에 생성된 자식객체타입으로 형변환 => 실제 자식객체의 멤버 접근 가능
		
		GeneralMember g1 = (GeneralMember)dto1;
		System.out.println(g1.toString());//자식이 재정의해놓은 자식의 toString()호출 수행
		//virtual method invocation
		// 재정의한 메서드는 부모타입의 참조변수여도 실제 재정의한 자식의 재정의 매서드를 호출 수행
		// 자식이 재정의한 메서드는 (부모것에 있어도) 무조건 자식것을 수행한다.
		g1.getMileage();
		
		// 형변환하기 전에 해당 클래스의 객체(instance)여부 체크
		if(dto1 instanceof AdminMember) {
		// 컴파일 ok: 문법 체크 
			AdminMember a1 = (AdminMember)dto1;
			// 실행 error - java.lang.ClassCastException: 
			// com.work.model.dto.GeneralMember cannot be cast to com.work.model.dto.AdminMember
			// at com.work.view.Test.main(Test.java:29)
			a1.getPosition();
		}else {
			System.out.println("[오류] 해당 클래스의 인스턴스가 아닙니다");
		}
		Member dto2 = new GeneralMember("user02","password01","강감찬","01012342000","user02@work.com","2021-01-05","G",950000);
		
		Member dto3 = new SpecialMember("user03","password01","이순신","01012343000","user03@work.com","2020-11-15","S","강동원");
		Member dto4 = new SpecialMember("user04","password01","김유신","01012344000","user04@work.com","2021-01-05","S","김하린");
	
		Member dto5 = new AdminMember("administrator","admin1004","유관순","01012345000","administrator@work.com","2021-04-01","A","선임");

		
	}
	//재정의 테스트
	public static void main2(String[] args) {
		Member dto1 = new Member("user01","password01","홍길동","01011111111","이메일1");
		System.out.println(dto1);	//어떤클래스의 toString() 결과 나오는지?부모 : 부모 재정의
		//toString()재정의하지 않는 경우 : com.work.model.dto.Member@15db9742
		
		//일반회원객체 생성
		Member dto2 = new GeneralMember("user02","password02","홍길동2","01022222222","이메일2");
		System.out.println(dto2); //어떤클래스의 toString() 결과 나오는지?일반자식(general) : 자식 재정의
		
		//Member dto3 = new SpecialMember("user02","password02","홍길동2","01022222222","이메일2","a");
	}
	//부모타입의 다형성 : 모든 자식객체를 참조(저장)가능
	public static void main1(String[] args) {
		
	
	//ok :같은타입 자동할당	: 다형성 변수타입
	Member dto1 = new Member();
	//ok : 부모타입(상속) : 큰타입
	Member dto2 = new GeneralMember();
	//ok : 부모타입(상속) : 큰타입
	Member dto3 = new SpecialMember();
	//error : 다른타입, 작은(자식)타입. 즉, 부모객체를 자식객체에 저장(참조) 불가.
	//GeneralMember dto4 = new Member();

	//error : 다른타입, 상속구조X
	//GeneralMember dto5 = new AdminMember();
	}
}
