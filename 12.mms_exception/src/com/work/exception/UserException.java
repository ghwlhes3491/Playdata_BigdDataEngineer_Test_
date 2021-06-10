package com.work.exception;

public class UserException extends Exception {
	public UserException() {	// 기본 생성자 단축키 : ctrl+space
		super("사용자 예외");
	}
	public UserException(String message) {	
		super("사용자 예외 : " + message);
	}
}
