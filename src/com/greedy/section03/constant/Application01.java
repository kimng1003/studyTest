package com.greedy.section03.constant;

public class Application01 {
	
	public static void main(String[] args) {
		
		/* 상수 선언
		 * 자료형 앞에 final 키워드 추가*/
		
		final int AGE;
		
		AGE = 20;  // AGE 초기화 함
		
		System.out.println("AGE의 값: " + AGE);
		
//		AGE = 30; > 상수 할당(assignment)되어 있어서 컴파일 오류
		
		System.out.println("AGE의 2배: " + (AGE * 2));

		int sum = AGE; 
//		AGE = AGE + 10 > 오류. AGE공간에 새로운 값을 변경이 안 됨
		
		/*상수의 명명 규칙
		 * 명명 규칙과 컴파일 에러를 발생시키는 규칙은 변수의 것과 동일
		 * 단, 개발자들끼리 암묵적인 규칙이 차이가 있음
		 * 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용
		 * 2. 단어와 단어 사이는 언더스코어(_)를 사용
		 * */
		
		final int AGE1 = 20;
		final int AGE2 = 30;
		final int age3 = 20;
		
		final int MAX_AGE = 60;
		final int MIN_AGE = 10;
		
		
		
		
		
		
		
	}
	
}
