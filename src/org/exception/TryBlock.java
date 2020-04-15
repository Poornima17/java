package org.exception;

import java.util.Scanner;

public class TryBlock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Entr N:");
			int n = s.nextInt();
			System.out.println(n);
			
			try {
				String s1 = "java";
				System.out.println(s1.charAt(2));
				
			} catch (Exception e) {
				System.out.println("inner catch");
				System.out.println(e);
			}
			s.close();
			}
		catch (Exception e) {
			System.out.println("outer catch");
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
