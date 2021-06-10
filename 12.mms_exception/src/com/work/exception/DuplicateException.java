package com.work.exception;

public class DuplicateException extends Exception {
	public DuplicateException() {	// 기본 생성자 단축키 : ctrl+space
		super("중복 예외");
	}
	public DuplicateException(String message) {	
		super("중복 예외 : " + message);
	}
}
