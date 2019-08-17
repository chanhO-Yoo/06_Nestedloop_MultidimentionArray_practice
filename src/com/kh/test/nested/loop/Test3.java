package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();

	}
		
	/*
	 * 정수하나 입력받아, 그 수가 양수일때만 
	 * 입력된 수를 줄 수로 적용하여
	 * 다음과 같이 출력되게 하는 
	 * 프로그램을 만들어보자.
	 * 
	 *   *
         **
         ***
         ****
         *****
          ****
           ***
            **
             *
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		String result = "";
//		String asterisk1 = "";
//		String asterisk2 = "";
		
		if(input <=0) {
			result = "양수가 아닙니다.";
		}
		else {
			for(int i=0;i<input*2-1;i++) {
				if(i<input) {
					for(int j=0;j<=i;j++) {
						result += "*";
						
					}
					result += "\n";
					
				}
				else {
					String space = "";
					for(int k=0;k<=i-input;k++) {
						space += " ";
					}
					
					result += space;

					
					for(int j=0;j<input*2-(i+1);j++) {
						result += "*";
					}
					result += "\n";
				}
			}
		}
		System.out.println(result);
		System.out.println("===================");
	}
}
