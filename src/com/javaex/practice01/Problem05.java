package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");

		a = sc.nextInt();
		System.out.print("숫자 : ");
		
		b = sc.nextInt();
		System.out.print("숫자 : ");
		 
		c = sc.nextInt();
		System.out.print("숫자 : ");
		
		d = sc.nextInt();
		System.out.print("숫자 : ");
		
		e = sc.nextInt();
		System.out.print("숫자 : ");
		
		if(a > b && a > c && a > d && a > e ) {
			System.out.println("최대값은 " + a + "입니다");
		}else if( b > c && b > d && b > e) {
			System.out.println("최대값은 " + b + "입니다");
			
		}else if(c > d && c > e) {
			System.out.println("최대값은 " + c + "입니다");
		}else if(d > e) {
			System.out.println("최대값은 " + d + "입니다");
		}else {
			System.out.println("최대값은 " + e + "입니다");
		}
		sc.close();

	}

}
