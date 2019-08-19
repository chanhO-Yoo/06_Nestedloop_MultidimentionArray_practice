package com.kh.test.dimentilonal.array.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Sample p = new Sample();
//		p.exercise1();
		p.exercise1_1();
//		p.exercise2();
//		p.exercise3();
		
	}
	
	/*
	 *  1. 4행4열 2차원배열 선언 및 생성
	 *  2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
	 *  3. 아래의 내용처럼 처리함
	 *      0열       1열         2열        3열    
	 *  0행      값         값            값         0행 값들의 합계
	 *  1행      값         값            값         1행 값들의 합계
	 *  2행      값         값            값         2행 값들의 합계
	 *  3행  0열합계  1열합계  2열합계   가로+세로합계
	 * 
	 */
	public void exercise1() {
		int[][] intArr = new int[4][4];
		
		//0행0열부터 2행2열까지 1~100사이 난수 정의
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				Random rndNum = new Random();
				intArr[i][j] = rndNum.nextInt(100);				
			}
		}
		
		//각 행 3열에 각 행들 값의 합계 정의
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				intArr[i][3] += intArr[i][j];				
			}
		}

		//각 열 3행에 각 열들의 값의 합계 정의
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=2;j++) {
				intArr[3][i] += intArr[j][i];				
			}
		}
		
		//2차원배열 출력문
		for(int i=0;i<=3;i++) {
			System.out.println(Arrays.toString(intArr[i]));			
		}
	}
	
	//분할정복(Divide and Conquer)
	public void exercise1_1() {
		int[][] arr = new int[3][4];
		
		for(int i=0;i<arr.length;i++) {
			int rowSum = 0;
			for(int j=0;j<arr[i].length;j++) {
				if(j<arr[i].length-1) {
					arr[i][j]=new Random().nextInt(100)+1;
					rowSum += arr[i][j];
				}
				else {
					arr[i][j] = rowSum;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));			
		}
		
	}
	
	/*
	 * 1. 3행짜리 2차원배열 선언 및 생성
	 * 2. 각 행별 열갯수는 키보드로 입력받아 생성함
	 * 3. 1~100사이의 임의의 정수를 모든 방에 기록함
	 * 4. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
	 */
	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		int[][] intArr = new int[3][];
		int[][] printArr = new int[3][];
		
		//각 행의 열의 갯수 입력받기
		for(int i=0;i<intArr.length;i++) {
			System.out.print(i+"행의 열 갯수를 입력하세요 : ");
			int row = sc.nextInt();
			
			//입력받은 열의 갯수만큼 배열로 만들기
			intArr[i] = new int[row];
			printArr[i] = new int[row];
		}
		
		
		//1~100까지 임의의 정수를 각 행렬에 기록
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				Random rndInt = new Random();
				intArr[i][j] = rndInt.nextInt(100);				
			}
		}
		
		//합계 초기화
		int sum = 0;

		//배열 출력하기
		for(int i=0;i<3;i++) {
			System.out.println(Arrays.toString(intArr[i]));
		}
		
		//출력문 구분
		System.out.println("====================");
		
//		//각 열의 합계가 5의 배수인 값 찾기
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<intArr.length;j++) {
//				sum += intArr[j][i];
//					}
//			if(sum%5==0) {
//				for(int j=0;j<intArr.length;j++) {
//					printArr[j][i]=intArr[j][i];
//					System.out.println(Arrays.toString(printArr[j]));			
//				}
//			}
//			sum=0;
//		}

		//출력문 구분
//		System.out.println("====================");
		
		//각 행의 합계가 5의 배수인 값 찾기
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				sum += intArr[i][j];
			}
			if(sum%5==0) {
				System.out.println(Arrays.toString(intArr[i]));					
			}
			sum=0;
		}

	}
	
public void exercise3() {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		
		int num = 0;
		int col_num = 0;
		
		// 유효성 검사 후 (0,0) 부터 (2,col_num)) 까지 입력받기 
		for(int row=0; row<3; row++) 
		{
			// 행의 열 갯수 입력받기
			System.out.println(row + "행의 의 열 갯수는? ");
			col_num = sc.nextInt();
			arr[row] = new int[col_num];
			
			// 열 갯수만큼 행에 숫자 입력받기
			for(int col=0; col<col_num; col++)
			{
				System.out.print("("+ row + ", " + col + ") 입력 : ");
				num = sc.nextInt();
				
				// 유효성 검사
				if(num>=1 && num<=100)
					arr[row][col] = num;
				
				else
				{
					System.out.println("1~100 사이의 값을 입력하지 않았습니다.");
					break;
				}
			}
		}
		
		// 각 행의 합을 저장할 정수형 sum 배열 선언 후 각 sum[0],sum[1],sum[2]에 합 저장
		int[] sum = new int[3];
		
		for(int row=0; row<3; row++) 
			for(int col=0; col<arr[row].length; col++)
				sum[row] += arr[row][col]; 
		
		
		// sum의 합이 5의 배수일때 각 열 출력
		for(int i=0; i<arr.length; i++) 
			
			if(sum[i]%5==0)
			{
				for(int j=0; j<arr[i].length; j++)
					System.out.print(arr[i][j] + "\t");
				
				System.out.print(" > 합계: " + sum[i]);
				System.out.println();
			}
	}
}
