package com.work.view;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileInputOutputTest {

	public static void main(String[] args) {
		// 키보드로 입력 => 파일("test.text") 출력
		
		// 키보드 입력 스트림 : 라인 단위
		BufferedReader in = null;
		
		//라인단위 출력 > 파일 스트림
		PrintWriter out = null;
		
		System.out.println("멋진 자기소개를 부탁합니다.[종료 ctrl+Z"
				+ "]");
		// 파일("test.text") 출력 : 라인 단위
		try {
			in = new BufferedReader(new InputStreamReader(System.in));	//입력
			out = new PrintWriter(new FileWriter("test.txt", true));//출력	// append : false가 default
			String data = null;
			while((data = in.readLine()) != null){	//???????????????
				out.println(data); 	//라인단위로 출력
				}
			
			System.out.println("파일이 정상 저장되었습니다.");
		}
			catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				
			}
			
			
			out.close();
		}
		

	}

}
