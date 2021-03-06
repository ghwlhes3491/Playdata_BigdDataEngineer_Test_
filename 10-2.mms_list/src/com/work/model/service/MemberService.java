package com.work.model.service;

import java.util.ArrayList;

import com.work.model.dto.AdminMember;
import com.work.model.dto.GeneralMember;
import com.work.model.dto.Member;
import com.work.model.dto.SpecialMember;
import com.work.util.Utility;

/**
 * <pre>
 * collection API활용 변경
 * -- ArrayList
 * </pre>
 * @author 김현진
 * @version ver1.0
 * @since jdk1.8
 */
public class MemberService {
	/** 회원들을 저장,관리하기위한 자료 저장 구조*/
	private ArrayList list = new ArrayList();
	
	/** 기본생성자 : 초기화 회원 등록*/
	public MemberService() {	//생성자는 값 돌려주지 않음.
//	 int count = initMember();
	 System.out.println("초기화 회원 등록작업이 완료되었습니다. : "+ initMember());
	}
	
	
	/** 회원 탈퇴
	 * @param memberId	아이디
	 * @param memberPw 비밀번호
	 * @return	성공 시 탈퇴회원 기존 정보, 실패시 null
	 */
	//아까 비밀번호 변경 로직과 같음
	public Member removeMember(String memberId, String memberPw) {
		int index = exist(memberId);
		if(index >= 0) {
			Object obj = list.get(index);
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberPw().equals(memberPw)) {
					dto.setMemberPw(memberPw);
					return (Member)list.remove(index);
				}
			}
		}
		return null;
	}
	
	/** 회원 탈퇴2 (아이디만)
	 * @param memberId	아이디
	 * @return	성공 시 탈퇴회원 기존 정보, 실패시 null
	 */
	//아까 비밀번호 변경 로직과 같음
	public Member removeMember(String memberId) {
		int index = exist(memberId);
		if(index >= 0) {
			return (Member)list.remove(index);
		}
		return null;
	}
	
	
	
	/**회원정보 전체 변경
	 * @param dto 변경회원 객체
	 * @return 성공 시 true, 실패 시 false 반환(아이디가 존재하지 않을 때)
	 */
	public boolean setMember(Member dto) {
		int index = exist(dto.getMemberId());
		if(index >= 0 ) {
			list.set(index, dto);
		//if(dto.getMemberId().equals(memberId)) {	//equals안에 어떤걸 받아야하지?
		//getMemberId의 return값은 
			return true;
		}
		
		return false;
	}
	/** 비밀번호 변경
	 * 비밀번호 변경
	 * -- 아규먼트 : 아이디, 비밀번호, 변경비밀번호
	 * -- 도메인 데이터 각각 : 아이디, 비밀번호, 변경비밀번호
	 * -- 도메인 객체?? : Member?? x (안됨) . 도메인 속성에 변경 비밀번호 없음
	 * -- Map : (key, value) 형식
	 * @return
	 */
	public boolean setMemberPw(String memberId, String memberPw, String modifyMemberPw) {
		int index = exist(memberId);
		if(index >= 0) {
			Object obj = list.get(index);
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberPw().equals(memberPw)) {
					dto.setMemberPw(modifyMemberPw);
					return true;
				}
			}
		}
		return false;// false인 경우 : 아이디 일치X 경우, 기존 비밀번호 틀린경우.
	}
	
	/** 현재 등록한 전체 회원 조회*/
	public ArrayList getMember() {
		return list;
	}
	
	/** 현재 등록 인원수 조회
	 * @return 현재 등록 인원수 
	 */
	public int getCount() {
		return list.size();
	}
	/**회원 등록
	 * -- 사용자 입력 데이터 : 아이디, 비밀번호, 이름, 휴대폰, 이메일
	 * -- 시스템 최초 가입 시 일반 회원으로 가입처리 : 가입일, 등급[, 마일리지]
	 * @param dto 등록 회원
	 */
	public void addMember(Member dto) {
		if(exist(dto.getMemberId()) == -1) { // 중복 아이디 존재하지 않을 때
			list.add(dto); 	// list순서존재, 중복허용
		}else {
			System.out.println("[오류] 동일한 아이디가 존재합니다 : " + dto.getMemberId());
		}
		// list 순서존재, 중복허용구조 => 개발자가 등록전에 중복여부 검증 처리 ?
		// 순서 인덱스는 사용하고 중복되지 않고 처리 가능한가? exist()
	}
	
	public void addMember(String memberId, String memberPw, String name, String mobile, String email) {
		// 부모타입의 변수의 다형성 적용 : 자식객체들 참조(reference)는 가능하지만 타입이 부모타입이기 때문에 부모타입으로 자식의 멤버 접근 불가
		// Member dto = new GeneralMember(memberId, memberPw, name,mobile, email);
		Member dto = new Member(memberId, memberPw, name,mobile, email);
		dto.setGrade("G");
		dto.setEntryDate(Utility.getCurrentDate());
		dto.setMileage(1000);
		
		addMember(dto);
	}
	
	/**
	 * 회원존재 유무 조회 : 저장된 회원의 크기만큼 반복, 저장객체 조회(Object), instanceof, type casting, equals()
	 * @param memberId 아이디
	 * @return 존재 시 저장위치 인덱스 번호, 미존재시 -1
	 */
	// 1. 저장된 회원의 크기만큼 반복
	// 2. memberId로 입력된 객체가 있는지 index순서대로(?) 찾음.

	public int exist(String memberId) {
//jdk1.4 version		
//1. 강사님 코드		
		for(int index = 0; index < list.size(); index++) {
			Object obj = list.get(index);
			if (obj instanceof Member) {
				Member dto = (Member)obj;
				if(dto.getMemberId().equals(memberId)) {
					return index;
				}
			}
		}
//2. 내 코드 : 중복체크 결과가 올바르지 않게 나옴
//		for(int index = 0; index < list.size(); index++) {
//			if(list.get(index).equals(memberId)) {
		//list.get(index) => Object => Member#equals(Member) : Member아이디 같은지 비교
//				return index;
//			}
//		}
		return -1;
	}
	/**
	 * 테스트를 위한 회원 초기화 등록 메서드
	 * @return 초기화 회원 등록 인원수 - 5명 
	 */
	public int initMember() {
		Member dto1 = new GeneralMember("user01", "password01", "홍길동", "01012341000", "user01@work.com", "2020-12-15", "G",0);
		Member dto2 = new GeneralMember("user02", "password02", "강감찬", "01012342000", "user02@work.com", "2021-01-05", "G",0);
		Member dto3 = new SpecialMember("user03", "password03", "이순신", "01012343000", "user03@work.com", "2020-11-15", "S", "강동원");
		Member dto4 = new SpecialMember("user04", "password04", "김유신", "01012344000", "user04@work.com", "2021-01-05", "S", "김하린");
		Member dto5 = new AdminMember("administrator", "admin1004", "유관순", "01012345000", "administrator@work.com", "2020-04-01", "A", "선임");
		
		addMember(dto1);
		addMember(dto2);
		addMember(dto3);
		addMember(dto4);
		addMember(dto5);
		
		return list.size();
	}
	/**
	 * 회원상세 조회 
	 * @param memberId 회원아이디
	 * @return 존재하면 회원 객체, 미 존재하면 null
	 * @see exist(String)
	 */
	public Member getMember(String memberId) {
		int index = exist(memberId);
		if(index >= 0 ) {
			return (Member)list.get(index);
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
