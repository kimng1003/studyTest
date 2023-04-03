package com.greedy.section01.literal;

public class Application01 {

	
	// 한 줄 주석
	/**/ //여러줄 주석 별 사이에 엔터
	// ctrl+/ > 주석 설정 해제
	// 여러줄 주석 묶기 ctrl+shiift+/ (해제는 \)
	
	
	/*
	 * 1. 숫자 형태의 값
	 * 	1-1. 정수 형태의 값
	 *	1-2. 실수 형태의 값
	 * 2. 문자 형태의 값
	 * 3. 문자열 형태의 값
	 * 4. 논리 형태의 값
	 **/
	
	public static void main(String[] args) {
		
		System.out.println(23); // 정수
		System.out.println(1.23); // 실수
		System.out.println('a'); // 문자 (홑따옴표 필수)
		//System.out.println('abb'); // 2개이상은 문자로 취급하지 않아서 에러 발생
		//System.out.println(''); // 빈문자는 에러
		System.out.println('1'); // 숫자가 아니라 문자로 인지함
		System.out.println("안녕하세요"); //문자 5개가 나열. 문자열 쌍따옴표
		System.out.println("123"); // 정수이지만 문자열로 인지함
		System.out.println(""); // 빈 문자열은 가능(문자열은 기본 자료형이 아니지만, 자료형처럼사용할 수 있음. 그래서 가능함)
		System.out.println("a"); // 문자 a와는 다름.
		
		System.out.println(true); // 참
		System.out.println(false); // 거짓
		
		
		
		
	}
	
}


