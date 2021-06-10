/**
 * 
 */
package com.work.model.service;

import com.work.model.dto.Member;

/**
 * MemberServiceAbstract �߻�Ŭ������ ������ ���� Ŭ����
 */
public class MemberService extends MemberServiceAbstract {
	/**  
	 * ȸ������ �����ϱ� ���� �ڷ����屸�� : �迭 ������ �ݿ�(�θ�Ÿ��) : 
	 * ������ ����ʱ�ȭ, Ȯ��, ���� ������ ���� �������� �����ϼ��� 
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

	/*
	 * ȸ����� ���� ���� :
	 * 1. ���� ��ϵ� ȸ������(count) ����迭�� ũ��� ������ ���ؼ�
	 * 
	 * => ������ �޼���� �и� ���� : ����Ŭ�������� �޼��� ����
	 * 2. ������ ������ Ȯ��迭(�����迭�� ũ�� +)�� �����ؼ�
	 * 3. ������ Ȯ���� �迭��ҿ� ������ �迭��ҿ� ����� ��ü���� �̵������Ų��
	 * 4. ������ �����ϰ� �ִ� �迭��ſ� ������ Ȯ���� �迭��� ���� ��������
	 * ...
	 * 
	 * 5. count�� �迭��ҿ� �ƱԸ�Ʈ�� ���޹��� ȸ����ü ����ϰ�
	 * 6. count�� 1���� ��Ŵ
	 */
	@Override
	public void addMember(Member dto) {
		if (count == members.length) {
			extendMembers();
		}
		
		if (exist(dto.getMemberId()) == -1) {
			members[count++] = dto; // ������ ��� ���� : �ߺ� => �ذ� : ����ϱ����� ��ϵ� ȸ���� ���̵� ������(������ü equals()) 
		} else {
			// ���Ͼ��̵� ���� ȸ����ü �����ϴ� ��쿡�� �����޼��� ���
			// �����޼��� : [����] 000 ���̵�� ����� �� �����ϴ�.
			System.out.println("[����]" + dto.getMemberId() + "�� ����� �� �����ϴ�.");
		}
		
	}
	
	/*
	 * CRUD �޼��忡�� ����ϱ� ���� ȸ�� �������� �� ���� ��ġ ��ȸ �޼���
	 * 1. ���� ��ϵ� ȸ������ŭ �ݺ��ϸ鼭
	 * 2. �迭�� ����� ������� ����� ��ü�� ���̵��(dto.getMemberId()) �ƱԸ�Ʈ�� ���޹��� ���̵� ������ ���ؼ� (String#equals(���ڿ�))
	 * 3. ���̵� ������ ���� ����� �迭����� �ε�����ȣ�� ��ȯ
	 * 4. �ݺ��� ���ߴµ��� return ���� �ʾҴٸ� ���̵������� ���� ȸ����ü�� �������������Ƿ� return -1
	 * @param memberId ���̵�
	 * @return ����ÿ� ������ġ��ȣ, ������� -1
	 */
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
	
	/*
	 * ȸ�� ����ȸ ���� ����
	 * 1. exist(String memberID) ������ : ������ġ ��ȯ
	 * 2. ������ġ 0���� ũ�ų� ������ ���ؼ�
	 * 3. 0���� ũ�ų� ������ �����ϴϱ� �ش� �迭����� ��ü�� return ��ȯ
	 * 4. 0���� ũ�ų� ����������(0����������) �������� ���� : �������� �����Ƿ� ��üŸ���� �⺻�� return null
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

	
}


/*
	public void addStudentScore(StudentScore dto) {
		if (count == students.length) {
			extendStudents(10);
			System.out.println("�л����� �ڷ����屸���� �߰� Ȯ���Ͽ����ϴ�.");
		} 
		
		students[count++] = dto;
	}
	
	public void extendStudents(int length) {
		StudentScore[] studentsTemp = new StudentScore[students.length + length];
		
		for (int index = 0; index < students.length; index++) {
			studentsTemp[index] = students[index];
		}
		
		students = studentsTemp;
	}
  
 
1. ��������� �ִ��� Ȯ���Ѵ�
2. dto ������ ���޹޴´�
3. �����Ѵ�
	
2. ����� �߰��Ǵ��� Ȯ��
3.�߰��� �ο��� �� �迭������ �ִ� ��Ȯ�� ������ ����ְ� ������ ������ �߰�
4.�Ϸ� �޽��� ���

  * 1. addMember�޼���� MemberŸ���� dto�� �޾ƿ´� 
  * 2. members[]�� ������ �� á���� �ƴ��� �˻��Ѵ�. 
  * 3. members[]�� ������ �� á�ٸ� Ȯ�� �� dto�� members�� �����Ѵ�.
  * 4. count�� 1 ������Ų��.
	 
	 * ȸ����� ���� ���� :
	 * 1. �����͸� ���޹���
	 * 2. �� ������ ���ǿ� �´��� ����
	 * 3. �迭�� �ڸ��� �ִٸ� ����
	 
 */











