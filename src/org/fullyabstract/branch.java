package org.fullyabstract;
public class branch implements bank{
	public void id() {
		System.out.println("id is 222");
	}
	public void deposit() {
		System.out.println("deposit value is 2%");
	}
	public void branchdetails() {
		System.out.println("branch is in navalur");
	}
	public static void main(String[] args) {
		branch b=new branch();
		b.branchdetails();
		b.deposit();
		b.id();
		
	}
	

}
