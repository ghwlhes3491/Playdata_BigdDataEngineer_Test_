package com.concert.view;

import com.concert.exception.DuplicateException;



public class CuiTest {
	/**
	 * 회원관리시스템 CUI 시작 메서드
	 * @param args
	 * @throws DuplicateException 
	 */
	public static void main(String[] args) throws DuplicateException{
		MemberMenu view = new MemberMenu();
		
		view.initMenu();
		
		while(true) {
			view.mainMenu();
		}
		
	}
}