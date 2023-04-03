package com.greedy.section01.literal;


public class Application03 {

	
	public static void main(String[] args) {
		
		
		System.out.println("===== 두 개의 문자열 합치기 ======");	
		System.out.println(9 + 9); // 18
		System.out.println("9" + "9"); // "99"
		System.out.println(9 + "9"); // "99"
		
		System.out.println("===== 세 개의 문자열 합치기 ======");	
		// 왼쪽부터 계산 시작
				
		System.out.println(9 + 9 + "9"); // 18+"9" > "189"
		System.out.println("9" + "9" + 9); // "99"+9 > "999"
		System.out.println(9 + "9" + 9); // "99"+9 > "999"
		
		//918 만들기
		System.out.println("9" + (9 + 9)); // "9"+18> "918"
		
		
		System.out.println(":" + 10 + 20);		
		System.out.println(":" + (10 + 20));		
		
		
				
		
		
		
		
		
		
		
	}
	
	
	
	
}
