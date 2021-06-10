package com.work.exception;

public class CommonException extends Exception {
	public CommonException() {	// 기본 생성자 단축키 : ctrl+space
		super("사용자 예외");
	}
	public CommonException(String message) {	
		super("[오류]  : " + message);
	}
}
