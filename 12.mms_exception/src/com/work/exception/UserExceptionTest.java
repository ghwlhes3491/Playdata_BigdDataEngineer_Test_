package com.work.exception;


public class UserExceptionTest {
	public static void main(String[] args) {
		//doA("G"); // static 메서드인 main()메서드는 같은 클래스에 있는 인스턴스 메서드 객체 생성후 사용 가능.
		UserExceptionTest a = new UserExceptionTest();
		try {
			a.doA("x");
		} catch (UserException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상종료");
	}
	/**
	 * -- grade "G","S","A"가 아니면 사용자예외(UserException) 발생
	 * -- throw new 사용자예외클래스명()
	 * @param grade
	 * @throws UserException 
	 */
	public void doA(String grade) throws UserException { // grade예외상황 체크 메서드

		switch(grade) {
		case "G":
		case "S":
		case "A":
			break;
		default:
			//System.out.println("[오류] 등급은 G, S, A만 가능합니다.");
			//throw new UserException();
			throw new UserException("등급은 G, S, A만 가능합니다");
		}
	}
}










//if(grade.equals("G")||grade.equal's("S")||grade.equals("A")) { //!써야하나?
// ||는 단축 논리 연산자라서 S가 들어가더라도 "G"가 아님에 들어가므로 true(오류)가 나옴
////if (!(정상)) 처리했을 때 맞는지 확인 - 개선
//if(!(grade.equals("G")||grade.equals("S")||grade.equals("A"))) {
//	System.out.println("오류");
//}
////if &&를 쓰면?
//if(!(grade.equals("G") && grade.equals("S") && grade.equals("A"))) {
//	System.out.println("오류");
//}
