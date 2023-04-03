package com.greedy.section01.literal;

public class Application02 {

	/* public static viod main(String[] args) {
	 * 각 클래스마다 하나씩 존재. 실행할 때 맨 처음 실행되는 메소드(기능)
	 */

	public static void main(String[] args) {
		/*값을 직접 연산해서 출력
		 * 값의 형태에 따라 사용할 수 있는 연산자의 종류(+,-,*,/,%)와 결과가 달라짐 (더하기, 빼기, 곱하기, 나누기 몫, 나누기 나머지)
		 * 나누기 나머지는 홀짝할 때 주로 사용
		 * */
		
		System.out.println("===== 정수와 정수의 연산 ======");
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);
		
		System.out.println("===== 실수와 실수의 연산 ======");		
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 + 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0); 

		System.out.println("===== 정수와 실수의 연산 ======");			
		
		/* 정수와 실수의 연산도
		 * 수학에서 사용하는 사칙연산에 나머지를 구하는 연산을 사용할 수 있음
		 * 정수와 실수의 연산 결과는 언제나 실수
		 * */
		System.out.println(123 + 0.5);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);		
		
		
		System.out.println("===== 문자와 문자의 연산 ======");			
		
		/* 문자와 문자의 연산도 사칙연산에 mod연산(%)까지 가능함
		 * */		
		System.out.println('a' + 'b'); 
		System.out.println('a' - 'b'); 
		System.out.println('a' * 'b'); 
		System.out.println('a' / 'b'); 
		System.out.println('a' % 'b'); 
		
		System.out.println("===== 문자와 정수의 연산 ======");	
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 1);
		System.out.println('a' / 1);
		System.out.println('a' % 2);
		
		// 'a' = 97 '아스키코드' 유니코드: 문자에 번호 부여 
		// 각각의 문자에는 범위가 있음
		// ex. 값을 매칭해서 65(A) ~90(Z) 해당하면 대문자 알파벳이 있음으로 확인 가능
		
		
		System.out.println('a' * 1);
		System.out.println('b' * 1);
		System.out.println('!' * 1);
	
		System.out.println('ㄱ' * 1);		
		System.out.println('김' * 1);		
		
		System.out.println('!' * 1.0);	
		
		/*문자는 내부적으로 숫자 취급
		 *그래서 지금까지 연사는 숫자끼리의 연산
		 *숫자(정수 혹은 실수)형태의 값은 사칙연산과 mod연산이 가능함*/
		
		/* 문자열과 다른 형태의 값 연산
		 * >> 문자열과의 연산은 '+'연산만 가능
		 * >> 문자열과 문자열의 연산도 '+'연산만 가능
		 * */
		
		
		System.out.println("===== 문자열과 문자열의 연산 ======");	
		System.out.println("hello" + "world");
//		System.out.println("hello" - "world"); 에러 발생
		
		
		System.out.println("===== 문자열과 다른 형태의 연산 ======");	
		System.out.println("helloworld" + 123);
		System.out.println("helloworld" + 123.456);
//		System.out.println("helloworld" * 123); 에러 발생

		System.out.println("helloworld" + 'a'); // 97 더하는 게 아니라 문자가 더해짐
		System.out.println("helloworld" + true); // 논리를 더해도 문자로 더해짐
		
		System.out.println("123" + "456");
		System.out.println('1');
		System.out.println('4');	
		System.out.println('1' + '4'); //문자열 연산할 때는 정수로 인식됨. 아스키코드 연산으로 진행
		System.out.println(49 + 52);
		
		/*논리값 연산
		 * 논리값과 다른 자료형의 연산은 정수,실수,문자 모두 불가
		 * 단, 논리값과 문자열의 '+'연산만 가능 (문자열 합치기)
		 * */
		
//		System.out.println(true + false); 에러
//		System.out.println(true + 'a'); //문자는 내부적으로 숫자 취급, 논리값고 숫자의 연산과 동일한 의미
		
		System.out.println(true + "a");
		
	}
}
