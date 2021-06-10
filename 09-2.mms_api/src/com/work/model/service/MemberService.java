/**
 * 
 */
package com.work.model.service;

import com.work.model.dto.Member;

/**
 * <pre>
 * MemberServiceAbstract �߻�Ŭ������ ������ ���� Ŭ����
 * </pre>
 */
public class MemberService extends MemberServiceAbstract {
	/**  
	 * <pre>
	 * 일이삼사오육
	 * ȸ������ �����ϱ� ���� �ڷ����屸�� : �迭 ������ �ݿ�(�θ�Ÿ��) : 
	 * ������ ����ʱ�ȭ, Ȯ��, ���� ������ ���� �������� �����ϼ��� 
	 * </pre>
	 */
	private Member[] members = new Member[10];
	
	/** ����ο��� �� ��ϵ� �迭��� ��ġ���� */
	private int count;
	
	
	/**
	 * ���� ��� �ο��� ��ȸ
	 * @return ���� ��� �ο���
	 */
	public int getCount() {
		return count;
	}


	@Override
	public void addMember(Member dto) {
		if (count == members.length) {
			extendMembers();
		}
		
		if (exist(dto.getMemberId()) == -1) {
			members[count++] = dto;  
		} else {

			System.out.println("[����]" + dto.getMemberId() + "�� ����� �� �����ϴ�.");
		}
		
	}
	

	@Override
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
	@Override
	public Member getMember(String memberId) {
		int idx = exist(memberId); 	// 1.
		if(idx >= 0) {				// 2.
			return members[idx];	// 3.
		}
		
		System.out.println("[����]" + memberId + "�� �������� �ʴ� ���̵��Դϴ�");
		return null; // 4
	}

	@Override
	public Member getMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean setMemberPw(String memberId, String memberPw, String modifyMemberPw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeMember(String memberId, String memberPw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMember() {
		// TODO Auto-generated method stub
		
	}

	
}













