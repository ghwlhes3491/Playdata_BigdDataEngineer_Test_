package com.concert.service;

import java.util.Scanner;

import com.concert.exception.DuplicateException;
import com.concert.model.Info;

public class ReservationService {
   
	
	Scanner scan = new Scanner(System.in);

	String[] VIP = new String[10];
	String[] S 	= new String[15];
	String[] R 	= new String[25];


	public ReservationService() {			// [1] [2]... 생성
	for (int index = 0; index < VIP.length; index++) {	
		VIP[index]="["+(index+1)+"]";
	}
	for (int index = 0; index < S.length; index++) {	
		S[index]="["+(index+1)+"]";
	}
	for (int index = 0; index < R.length; index++) {	
		R[index]="["+(index+1)+"]";
	}
  }
	//public ReservationService showReserve(ReservationService booking) {
	public void showReserve() {		// 좌석 보여주는 화면
      System.out.print("VIP>>\t\t\t\t");
      for(int index = 0; index < VIP.length; index++) {
         System.out.print(VIP[index]+ "");
      }
      System.out.println();
      
      System.out.print("S>>\t\t\t");
      for(int index = 0; index < S.length; index++) {
          System.out.print(S[index]+ "");
       }
      System.out.println();
      
      System.out.print("R>>\t");
      for(int index = 0; index < R.length; index++) {
          System.out.print(R[index]+ "");
       }
      
      System.out.println();
      reservation();
      //return booking;
   }

      
   public boolean showSeat(int inputRow) {
      switch(inputRow) {
      case 1:
         System.out.print("VIP>> ");
         for(int i = 0; i < VIP.length; i++) {
            System.out.print(VIP[i] + " ");
         }
         System.out.println();
         return true;
         
      case 2:
         System.out.print("S>> ");
         for(int i = 0; i<S.length; i++) {
            System.out.print(S[i] + " ");
         }         
         System.out.println();
         return true;
      
      case 3: 
         System.out.print("R>> ");
         for(int i = 0; i<R.length; i++) {
            System.out.print(R[i] + " ");
         }         
         System.out.println();
         return true;
         
      default :
         System.out.println("잘못 입력했습니다. 다시 입력해주세요");
            return false;
      }
   }
   
   public String reservation() {
      int inputseat = 0;
      String name = "";
      boolean right;
      
      
      while(true) {
    	 System.out.println(">> 예매를 진행합니다.");
         System.out.println(">> 원하는 열을 선택하세요");
         System.out.println(">> VIP : 1번, S : 2번, R: 3번 뒤로가기 : 0번");
         inputseat = scan.nextInt();
         
         right = showSeat(inputseat);
         
         if(right == false) continue;
         
         System.out.print("예약자이름 >> ");
            name = scan.next();
         System.out.print("번호 >> ");
         int seatnum = scan.nextInt();
         
         try {
            switch(inputseat) {
            case 1:
               VIP[seatnum-1] = "[X]";
               System.out.println("VIP [" + seatnum + "]번 좌석 예약이 완료되었습니다.");
               showSeat(inputseat);
               break;
            case 2:
                S[seatnum-1] = "[X]";
                System.out.println("S [" + seatnum + "]번 좌석 예약이 완료되었습니다.");
                showSeat(inputseat);
               break;
            case 3:
            	R[seatnum-1] = "[X]";
                System.out.println("R [" + seatnum + "]번 좌석 예약이 완료되었습니다.");
                showSeat(inputseat);
               break;


            }
            
         }
         
         catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("없는 좌석번호입니다. 다시 입력해주세요");
               continue;
         }
         System.out.println();
       
         return name;               
      }
      
   }
   
   public void deleteBook() {
      int delete = 0;
      boolean right;
      String delname = "";
      int count;
      
      while(true) {
         count = 0;
         System.out.print("좌석구분 VIP<1>, S<2>, R<3> >>");
         delete = scan.nextInt();
         
         right = showSeat(delete);
         
         if(right = false) continue;
         
         System.out.println("이름 >> ");
            delname = scan.next();
            
         switch(delete) {
         case 1:
            for(int i = 0; i < VIP.length; i++) {
               if(VIP[i].equals(delname)) {
                  VIP[i] = "---";                  
               }else count += 1;               
            }
            if(count == 10) {
               System.out.println("예약되지 않은 이름입니다. 다시 시도하세요.");
               continue;
            }
            break;
            
         case 2:
            for(int i = 0; i < S.length; i++) {
               if(S[i].equals(delname))
                  S[i] = "---";
               else count += 1;
            }
            if(count == 15) {
               System.out.println("예약되지 않은 이름입니다. 다시 시도하세요.");
               continue;
            }
            break;
            
         case 3:
            for(int i = 0; i < R.length; i++) {
               if(R[i].equals(delname))
                  R[i] = "---";
                  else count += 1;
            }
            if(count == 25) {
               System.out.println("예약되지 않은 이름입니다. 다시 시도하세요.");
               continue;
            }
            break;
         }
         
         System.out.println();
         return;            
      }
   }

   /*
  	ReservationService Book01 = new ReservationService();
  	ReservationService Book02 = new ReservationService();
  	ReservationService Book03 = new ReservationService();
  	ReservationService Book04 = new ReservationService();
  	ReservationService Book05 = new ReservationService();
  */
///** 공연 좌석표 생성 기본 메서드*/
	//public ReservationService(ReservationService booking) {	
// /** 공연 좌석 현황 초기화 메서드*/
//  	public ReservationService() {}
  //	
  //	
  //   /**@return the book01*/
//  	public ReservationService getBook01() {
//  		return Book01;
//  	}
  //	
//  	/**@param book01 the book01 to set */
//  	public void setBook01(ReservationService book01) {
//  		Book01 = book01;
//  	}
  //
//  	/**@return the book02*/
//  	public ReservationService getBook02() {
//  		return Book02;
//  	}
  //
//  	/**@param book02 the book02 to set*/
//  	public void setBook02(ReservationService book02) {
//  		Book02 = book02;
//  	}
  //
//  	/** @return the book03*/
//  	public ReservationService getBook03() {
//  		return Book03;
//  	}
  //
//  	/** @param book03 the book03 to set */
//  	public void setBook03(ReservationService book03) {
//  		Book03 = book03;
//  	}
  //
//  	/**@return the book04 */
//  	public ReservationService getBook04() {
//  		return Book04;
//  	}
  //
//  	/** @param book04 the book04 to set*/
//  	public void setBook04(ReservationService book04) {
//  		Book04 = book04;
//  	}
  //
//  	/** @return the book05*/
//  	public ReservationService getBook05() {
//  		return Book05;
//  	}
  //
//  	/** @param book05 the book05 to set*/
//  	public void setBook05(ReservationService book05) {
//  		Book05 = book05;
//  	}



   
   
   
   
   

}