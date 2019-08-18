package com.kh.test.nested.loop;

import java.util.Arrays;

public class PrintAsterisk {
	public static void main(String[] args) {
		PrintAsterisk  p = new PrintAsterisk();
//		p.test1();
//		p.test2();
//		p.test3();
//		p.test4();
//		p.test5();
//		p.test6();
		p.test7();
	}
	
	/*
	 * 출력값 : 
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 * 
	 */
	public void test1() {
		String asterisk = "";
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				asterisk += "*";			
			}
			asterisk += "\n";
		}
		System.out.println(asterisk);
		System.out.println("================");
	}
	
	/*
	 * 출력값) 
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * 
	 */
	public void test2() {
		String asterisk = "";
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				asterisk += "*";							
			}
			asterisk += "\n";
		}
		System.out.println(asterisk);
		System.out.println("================");
	}
	
	/*
	 * 출력값)
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 * 
	 */
	public void test3() {
		String asterisk = "";
		String result="";
		String blank="";
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				blank+= " ";
			}
			
			asterisk += blank;
			blank="";
			
			for(int k=0;k<=i;k++) {
				asterisk += "*";
			}			
			asterisk += "\n";
		}
		System.out.println(asterisk);
		System.out.println("================");
		
	}
	
	/* 출력값)
	 *     *     
	 *    ***    
	 *   *****   
	 *  *******  
	 * ********* 
	 * 
	 */
	public void test4() {
		String asterisk = "";
		String blank="";
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				blank += " ";
			}
			
			asterisk += blank;
			
			for(int j=0;j<=2*i;j++) {
				asterisk += "*";
			}
			asterisk += "\n";
			blank="";
		}
		System.out.println(asterisk);			
		System.out.println("================");
	}
	
	/* 출력값)
	 * *****
	 *   ***
	 *     *
	 */
	public void test5() {
		String asterisk = "";
		String blank="";
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2*i;j++) {
				blank +=" ";
			}
			
			asterisk += blank;
			blank = "";
			
			for(int j=5;j>2*i;j--) {
				asterisk += "*";
			}
			asterisk += "\n";
		}
		
		System.out.println(asterisk);			
		System.out.println("================");
	}
	
	/*
	 * 
	 		 *
	 	   ***
	 	 *****
	 	   ***        
	 	   	 *   
    
	 		 *
	 		**
	 	   ***
	 	  ****
	 	 *****
	 	  ****
	 	   ***
	 		**
	 		 *  
	 */
	public void test6() {
		String asterisk = "";
		String blank="";
		
		//첫번째 asterisk 출력
		for(int i=0;i<5;i++) {
			if(i<=5/2) {
				for(int j=0;j<-2*(i+1)+6;j++) {
					blank += " ";
				}
				
				asterisk += blank;
				
				for(int j=0;j<=2*i;j++) {
					asterisk += "*";					
				}
				asterisk += "\n";
				blank = "";
			}
			else {
				for(int j=0;j<2*i-4;j++) {
					blank += " ";
				}
				
				asterisk += blank;
				
				for(int j=0;j<-2*i+9;j++) {
					asterisk += "*";					
				}
				asterisk += "\n";
				blank = "";
			}
		}
		
		//줄바꿈
		asterisk += "\n";	
			
		//두번째 asterisk 출력
		for(int i=0;i<9;i++) {
			if(i<=9/2) {
				for(int j=0;j<-i+4;j++) {
					blank += " ";
				}
				
				asterisk += blank;
				
				for(int j=0;j<=i;j++) {
					asterisk += "*";
				}
				asterisk += "\n";
				blank = "";
			}
			else {
				for(int j=0;j<i-4;j++) {
					blank += " ";
				}
				
				asterisk += blank;
				
				for(int j=0;j<-i+9;j++) {
					asterisk += "*";
				}
				asterisk += "\n";	
				blank = "";
				
			}
		}
		
		System.out.println(asterisk);			
		System.out.println("================");
	}

	/*
	 *결과값)
	 * 	  *  
   	 *	 *** 
   	 *	*****
   	 *	 *** 
   	 *	  * 
	 */
	public void test7() {
		String asterisk = "";
		String blank="";
		
		for(int i=0;i<5;i++) {
			if(i<=5/2) {
				for(int j=0;j<-i+2;j++) {
					blank += " ";
				}
				
				asterisk += blank;
				
				for(int j=0;j<2*i+1;j++) {
					asterisk += "*";
				}
				asterisk += "\n";	
				blank = "";
			}
			else {
				for(int j=0;j<i-2;j++) {
					blank += " ";
				}
				
				asterisk += blank;
				
				for(int j=0;j<-2*i+9;j++) {
					asterisk += "*";
				}
				asterisk += "\n";
				blank = "";
			}
		}
		
		System.out.println(asterisk);			
		System.out.println("================");
	}
}
