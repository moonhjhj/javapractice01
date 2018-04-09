package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startNum;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			startNum = 2;
		}else {
			startNum = 1;
		}
		
		for(int i = startNum; i<=num; i = i+2){
			sum = sum + i;
		}
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = sc.nextInt();
		int sum = 0;
		int i = 1;
		int j = 0;

		while(i <= input && j <= input) {
			if(input % 2 == 1) {
				sum += i;
				i += 2;
			}else {
				sum += j;
				j += 2;
			}
		}
		*/
		
		/*for (i = 1; i <= input; i += 2) {
			if (input % 2 == 1) {
				sum += i;

			}else {
				
			}

		}*/
		System.out.println(sum);
		sc.close();


	}

}
