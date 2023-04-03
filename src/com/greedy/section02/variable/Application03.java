package com.greedy.section02.variable;

public class Application03 {

	public static void main(String[] args) {
		
		// 동일한 범위 내에서 동일 변수 안 됨
		// 동일 범위??
		//{}가 하나의 범위
				
		int age = 20;
//		int age = 20; > 범위 내에 동일한 변수. 에러 발생함
		
//		int true = 1; > 예약어 사용 불가능
		
		int Age = 20;
		int True = 10; // 예약어 true와 다름
		
//		int 1age = 20; > 숫자로 시작하여 섞어서 가능함
		int age1 = 20; 
		
//		int sh@rp = 20;
		int _age = 20;
		int _Age = 20;
		int $harp = 20;
		
		/*암묵적 규칙*/
		int ldlkfjehnsidjkfweufihdfkjdsnldkfjeiflsdfhfndmsfnfsdkfhoefdmnf;
		
		// 변수명이 합성어 > 첫단어는 소문자, 두번째 단어는 대문자로 시작
		// 자바에서는 클래스명만 유일하게 대문자로 시작
		
		int maxAge = 20;
		int minAge = 10;
		
		String user_name; // 가능하나, 이렇게 하지 않음
		String userName;
		
		int sum = 0;
		int max = 10;
		int min = 0;
		int count = 1;
		
		String goHome;
		String home;// 위 동사 보다는 명사로 하자
		
		boolean isAlive = true;
		boolean isDead = false;
		
		
		
		
	}
	
	
}
