package org.string;
public class sample {
public static void main(String[] args) {
		
String s=" j a v a p r o g r a m ";
String d="SQL";

int l=s.length();
System.out.println("Length:"+l);

int x=s.indexOf('r');
System.out.println("index of :"+x);

char a=d.charAt(2);
System.out.println("Chacter :"+a);

boolean e=s.equals("sql");
System.out.println(e);

boolean q=d.equalsIgnoreCase("sQL");
System.out.println(q);



}
}

