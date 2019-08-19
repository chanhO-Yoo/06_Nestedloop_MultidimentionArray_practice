package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	/*
	 * 정수 하나를 입력받아, 그 수가 양수일때만
	 * 입력된 수를 행 수로 적용하여 다음과 같이 출력하시오.
	 * 입력 : 5
	 * 
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public void test() {
		Scanner sc = new Scanner(System.in);

		//무한 반복
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int input = sc.nextInt();
			String result = "";
			
			//양수인지 판별
			if(input<=0) {
				result ="출력기능이 없습니다.";
			}
			else {
				//입력 받은 숫자만큼 반복문 실행
				for(int i=0;i<input;i++) {
					//*을 해당 줄의 번호보다 1 많이 출력
					for(int j=0;j<=i;j++) {
						result += "*";				
					}
					result += "\n";
				}			
			}
			
			System.out.println(result);
			System.out.println("==============");
			
		}
	}

}
