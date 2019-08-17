package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
		}
	
	/*
	 * 정수 하나를 입력받아, 그 수가 양수일때만
	 * 입력된 수를 행 수로 적용하여 다음과 같이 출력하시오.
	 * 입력 : 5
	 * 1
	 * *2
	 * **3
	 * ***4
	 * ****5
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int input = sc.nextInt();
			String result = "";
			System.out.println("정수하나 입력 : "+input);
			//입력한 정수가 양수인지 음수인지 판별
			//음수일 경우
			if(input<=0) {
				System.out.println("양수가 아닙니다.");
			}
			//양수일 경우
			else {
				for(int i=0;i<input;i++) {
					for(int j=0;j<i;j++) {
						result += "*";
					}
					result += i+"\n";
				}
			}
			System.out.println(result);
			System.out.println("===================");
		}
		
	}
}
