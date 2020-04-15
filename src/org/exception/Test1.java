package org.exception;

public class Test1 {
	private void m1() {
		m2();
		System.out.println("1");
	}

	private void m2() {
		m3();
		System.out.println("2");
	}

	private void m3() {
		System.out.println("3");
		try {
			int sum = 4 / 2;
			//System.out.printf("4");
			 System.out.println(sum);
		} catch (ArithmeticException e) {
			System.out.println("5");
		}

		System.out.println("7");
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.m1();
	}
}