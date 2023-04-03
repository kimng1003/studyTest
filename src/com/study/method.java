package com.study;

public class method {

	public static void main(String[] args) {

		System.out.println("오픈");
		System.out.println("시작");

		method prac1 = new method();
		prac1.prac1();


		System.out.println("끝");

	}

	public void prac1() {

		System.out.println("가동중");
		prac2();

	}

	public void prac2() {

		System.out.println("가동중단");
		prac3();

	}

		public void prac3() {
		
		System.out.println("재가동");
	
	}

}
