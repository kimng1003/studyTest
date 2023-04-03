package com.greedy.section02.variable;

public class Application02 {
	public static void main(String[] args) {
		
		/* 변수를 사용하기 위한 방법
		 * 1. 변수를 준비한다 (선언)  / 자료형 변수명; (> int sum;)
		 * 2. 변수에 값을 대입한다 (값 대입 및 초기화) (> sum = 10;)
		 * 3. 변수를 사용한다. (> system.out.println(sum);)
		 * */
	
		
		/*자료형이란?
		 * 다양한 값의 형태별(literal-숫자,문자,논리)로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드
		 *  (허용한 범위를 넘어하는 값을 작성하면 컴파일에러 발생함)
		 * 이러한 자료형은 지본자료형(Primary type,8가지-외워야함★)과
		 * 참조자료형(Reference type,보통 클래스 형식으로 되어 있음, 주소값, 대표적으로 string, =사용자 정의 타입)으로 나누어진다.
		 * */
		
		/* 정수를 취급하는 자료형 - 4가지
		 * 밑으로 내려갈 수록 커짐
		 * */
		
		byte bnum;  // 1byte
		short snum; // 2byte
		int inum;   // 4byte (기본)
		long lnum;  // 8byte
		
		// 실수를 취급하는 자료형 - 2가지
		
		float fnum; // 4byte
		double dnum; // 8byte (기본)
		
		//int와 float는 같은 4byte이지만 float 범위가 더 넓음 (실수)
		
		// 문자를 취급하는 자료형 - 1가지
		
		char ch; // 2byte
		char ch2;
		
		// 논리값을 취급하는 자료형 - 1가지
		boolean isTrue; // 1byte
		 // 변수명 선언 시 is로 시작하면 참/거짓 목적. boolean 자료형임
		
		String str; // 4byte (주소에 대한 부분이 4byte 정수형)

		
		// 대문자로 시작 > 클래스
		
		// 변수에 값을 대입(값 대입 및 초기화)
		 /* 변수 선언 > 메모리에 값을 저장하기 위해 공간만 생성해 둔 상태
		  * 그 공간에 대입연산자를 이용하여 자료형에 저장하기로 한 형태의 값을 저장
		  * 만약, 약속과 다른 형태의 값을 대입하려고 하면 Compiler는 에러를 발생
		  * 
		  * 대입연산자의 실행 방향은 오른쪽 -> 왼쪽
		  * 즉, 오른쪽 값을 왼쪽 공간에 대입. 
		  * 변수를 대입연산자 왼쪽에 사용하면 공간, 오른쪽에 사용하면 변수가 가진 값 
		  * */
		
		 // 특별한 선언이 없는 한 기본값인 int
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8; // 아무 문제 없는 것 처럼 보임 i보다 l이 커서, 사실 뒤에 대문자 L을 붙여야 함
		lnum = 8L; // 소문자 l로 써도 되지만, 숫자 1과 비슷해서 대문자로 권장
		
		fnum = 4.0f;  //실수의 기본값은 double. f붙여야 함. 대문자도 가능하지만, 소문자 사용이 일반적
		
		ch = 'a'; //문자 형태의 값을 저장
		ch2 = 97; // 'a'와 동일
		
		//논리 - 둘 중 하나만 가능
		isTrue = true;
		isTrue = false;
		
		str = "안녕하세요"; // literal
		
		int point = 100;
		int bouns = 10;
		
		// 선언과 값을 동시에 진행 => 변수 선언 및 초기화
		
		System.out.println("포인트와 보너스의 합은? " + (point + bouns));
		
	
		
		
		
		 
		
		
		
		
		
		
		
		
		
	}
	
	
}