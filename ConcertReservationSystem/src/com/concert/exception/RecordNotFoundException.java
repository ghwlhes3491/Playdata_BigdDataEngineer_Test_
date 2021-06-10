package com.concert.exception;

public class RecordNotFoundException extends Exception {
	public RecordNotFoundException() {
		super("데이터 없음 예외");
	}
	
	public RecordNotFoundException(String message) {
		super("데이터 없음 예외 : " + message);
	}	
}
