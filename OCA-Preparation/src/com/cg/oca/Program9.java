package com.cg.oca;

public class Program9 {
	/*
	 * what is the output?
	 */
int a1;
public static void doProduct(int a)
{
	a=a*a;
}
public static void doString(String a)
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Program9 item=new Program9();
item.a1=11;
String sv="hello";
Integer i=10;
//int i=10;
doProduct(i);
doString(sv);
System.out.println(i+""+sv+"");
	}

}
//op=10hello
