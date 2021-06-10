/**
 * 
 */
package com.work.model.service;

import com.work.model.dto.Member;

/**
 * <pre>
 * MemberServiceAbstract 추상클래스를 구현한 서비스 클래스
 * </pre>
 * @author 김현진
 * @version ver1.0
 * @since jdk1.8
 */
public class MemberServiceArray {
	//그동안 MemberService로 불려온 것 배열과 list비교하기 위헤 이름 변경
	/**  
	 * <pre>
	 * 회원들을 관리하기 위한 자료저장구조 : 배열 다형성 반영(부모타입):
	 * 생성자 사용초기화, 확장, 고정 본인이 편한 로직으로 진행하세요.
	 */
	private Member[] members = new Member[10];
	
	/** 등록인원수 및 등록될 */
	private int count;
	
	
	/** 현재 등록 인원수 조회
	 * @return 현재 등록 인원수 
	 */
	public int getCount() {
		return count;
	}


	public void addMember(Member dto) {
		if (count == members.length) {
			extendMembers();
		}
		
		if (exist(dto.getMemberId()) == -1) {
			members[count++] = dto;  
		} else {

			System.out.println("[오류]" + dto.getMemberId() + "는 사용할 수 없습니다..");
		}
		
	}
	


	public int exist(String memberId) {
		for(int index = 0; index < count; index++) { // 1.
			if(members[index].getMemberId().equals(memberId)) { // 2.
				return index; // 3.
			}
		}	
		return -1; // 4.
	}
	

	/**
	 * <pre>
	 * �迭���� �߰� Ȯ���ؼ� ���� �������� �̵� ó�� �޼���
	 * 1.
	 * 2.
	 * 3. 
	 * </pre>
	 * @see java.lang.System#arraycopy(Object, int, Object, int, int)
	 */
	public void extendMembers() {
		Member[] membersTemp = new Member[members.length + members.length];
		System.arraycopy(members, 0, membersTemp, 0, members.length);
		members = membersTemp;
	}
	

	/**
	 * 
	 */

	public Member getMember(String memberId) {
		int idx = exist(memberId); 	// 1.
		if(idx >= 0) {				// 2.
			return members[idx];	// 3.
		}
		
		System.out.println("[����]" + memberId + "�� �������� �ʴ� ���̵��Դϴ�");
		return null; // 4
	}


	public Member getMember() {

		return null;
	}


	public void setMember() {

		
	}


	public boolean setMemberPw(String memberId, String memberPw, String modifyMemberPw) {

		return false;
	}


	public void removeMember(String memberId, String memberPw) {

		
	}


	public void removeMember() {

		
	}

	
}













