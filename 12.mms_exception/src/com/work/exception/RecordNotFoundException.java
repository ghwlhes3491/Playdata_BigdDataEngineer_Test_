package com.work.exception;

public class RecordNotFoundException extends Exception{	// ## 데이터 미존재 
	public RecordNotFoundException() {	// 기본 생성자 단축키 : ctrl+space
		super("데이터 검색 예외");
	}
	public RecordNotFoundException(String message) {	
		super("데이터 검색 예외 : " + message);
	}
}
