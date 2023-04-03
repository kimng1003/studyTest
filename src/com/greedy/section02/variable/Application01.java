package com.greedy.section02.variable;

public class Application01 {
	public static void main(String[] args) {
		
		/* 변수의 사용 목적
		 *  1. 값(literal)에 의미를 부여하기 위해 (의미전달이 쉽게> 코드 읽기가 쉬워져서 협업 및 유지보수에 유리함)
		 *  2. 한 번 저장해둔 값을 재사용하기 위해 (변수를 아용하면 값을 변경할 때에도 간편함)
		 *  3. 시간에 따라 변하는 값을 저장 및 사용이 가능 (변하는 겂을 저장하기 위한 공간)
		 * */
		
		
		System.out.println("===== 값에 의미 부여 테스트 =====");
		System.out.println("보너스를 포함한 급여: " + (1000000 + 200000) + "원");
		
		// 변수 선언, 값 할당
		int salary = 1000000;
		int bonus = 200000; 
		
		System.out.println("보너스를 포함한 급여: " + (salary + bonus) + "원");
		
		System.out.println("===== 변수에 저장한 값 재사용 테스트 =====");
		
		//10명의 고객에게 100포인트 지급
		
		System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
		
		int point = 100;
		System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
		
		/* 시간에 따라 변경되는 값을 저장하고 사용
		 * 변수는 하나의 값을 저장하고 사용하기 위한 공간이기보다, 변하는 값을 저장하기 위한 공간이다.*/
		
		int sum = 0;
		
		System.out.println(sum);
		
		sum = sum + 10;
				
		System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
		System.out.println(sum);
		
		sum = sum + 10;
		System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
		System.out.println(sum);	
				
		
		
		
	}
	
	
}
