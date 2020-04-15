package org.partialabstract;

public class hdfc extends Bank {
	public void id() {
		System.out.println("hdfc id id 111");
	}
	public void deposit() {
		System.out.println("deposit amount is 3000");
	}
public static void main(String[] args) {
	hdfc e=new hdfc();
	e.deposit();
	e.id();
	e.branchDetails();
}
}
