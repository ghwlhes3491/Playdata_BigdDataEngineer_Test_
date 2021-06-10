package com.work.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest {
	public static void main(String[] args) {
		System.out.println("키보드에서 영문자 / 한글 한글자를 입력하세요. [종료 Ctrl+Z]");
		
		
		try {
			//byte 단위 읽기
			//int input = System.in.read();	//system.in은 byte단위
			
			//char 단위 읽기
			//InputStreamReader in = new InputStreamReader(System.in);
			//int input = in.read();
			
			//라인(String) 단위 읽기
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
			String input = in.readLine();
			
			System.out.println("입력데이터 : " + input);	// 한 글자는 byte단위로 읽어오면 글자가 깨짐.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
