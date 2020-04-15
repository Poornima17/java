package org.string;
import java.util.Scanner;
public class sam {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the email id :");
	String s1=s.next();
	System.out.println(s1);
	boolean c=s1.contains("@");
	System.out.println(c);
	
	System.out.println("Enter the address :");
	String s2=s.nextLine();
	//System.out.println(s2);
	boolean c1=s2.contains("pincode");
	System.out.println("Address "+s2+" contains pincode :"+c1);
	


	
}
}
