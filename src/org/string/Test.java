package org.string;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
	System.out.println("Enter the ph num");
	String a=s.next();
	int b=a.length();
	System.out.println(b);
	if(a.length()>10) {
		System.out.println("inavalid ph num");
	
	}
	else {
		System.out.println("valid ph num");
	}
}
}
