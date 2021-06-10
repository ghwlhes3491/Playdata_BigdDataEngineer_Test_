package com.work.model.service;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;

/**
 * 회원을 관리하기 위한 서비스 클래스
 * -- 회원들을 관리하기 위한 자료 저장구조 : 배열, 다형성 반영(부모타입으로)
 * -- 메서드의 argument 다형성 반영(부모타입), 반환타입??
 * -- 메서드명(매개변수) : 반환타입
 * 
 * -- C (등록)
 * -- R (조회)
 * 		==> 단일조회(상세조회) => ID
 * 		==> 다중조회(전체조회, 그룹조회) => 전체조회(), 등급별회원전체조회(등급)
 * -- U	(변경)
 * 		==> 전체변경() 
 * 		==> 부분변경(비밀번호변경)
 * -- D	(삭제)
 * 		==> 전체삭제
 * 		==> 특정삭제 : 아이디(해당회원만삭제)
 * @author 김현진
 *
 */
public class MemberService {
	/**
	 * 회원들을 관리하기위한 자료저장 구조 : 배열, 다형성 반영(부모타입으로)
	 * 생성자 사용초기화, 화장, 고정 본인이 편한 로직으로 진행
	 * 
	 */
	
	/**
	 * 회원등록
	 * -- 메서드명
	 * -- 매개변수
	 * -- 반환타입
	 */
	
	/**
	 * 전체조회
	 * -- 메서드명
	 * -- 매개변수
	 * --- 반환타입
	 */
	private MemberService[] members;
	
	public MemberService() {};
	
	public MemberService(String memberId, String memberPw, String name, String mobile, String email) { 
		
	}
	public MemberService(int length) {
		members = new MemberService[length];
	}
	

	
	
	/**
	 * 초기회원등록 메서드
	 */
	public void initMember() {
		Member dto1 = new GeneralMember("user01","password01","홍길동","01012341000","user01@work.com","2020-12-15","G",50000);
		Member dto2 = new GeneralMember("user02","password01","강감찬","01012342000","user02@work.com","2021-01-05","G",950000);
		
		Member dto3 = new SpecialMember("user03","password01","이순신","01012343000","user03@work.com","2020-11-15","S","강동원");
		Member dto4 = new SpecialMember("user04","password01","김유신","01012344000","user04@work.com","2021-01-05","S","김하린");
	
		Member dto5 = new AdminMember("administrator","admin1004","유관순","01012345000","administrator@work.com","2021-04-01","A","선임");

	}
}
