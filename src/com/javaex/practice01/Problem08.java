package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		boolean run = true;
		while (run) {
			System.out.println("");
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int bank = sc.nextInt();
			switch (bank) {
			case 1:
				System.out.println("예금액>");
				int deposit = sc.nextInt();
				total = total + deposit;
				break;
			case 2:
				System.out.println("출금액>");
				int withdraw = sc.nextInt();
				total = total - withdraw;
				break;
			case 3:
				System.out.println("잔고액>" + total);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;

			}
		}
		sc.close();

	}

}
