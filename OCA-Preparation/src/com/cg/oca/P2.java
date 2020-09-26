package com.cg.oca;

public class P2 extends problem1 {
public void eat()
{
	
}
	public static void main(String[] args) {
		problem1 p1=new P2();
		P2 p2=new P2();
		//p1.eat();
		/*
		 * it will show compilelation error to add throws method
		 * explaination-If a method is overridden but you use a polymorphic (supertype) reference to refer to the
subtype object with the overriding method, the compiler assumes you’re calling the supertype
version of the method. If the supertype version declares a checked exception, but the overriding
subtype method does not, the compiler still thinks you are calling a method that declares an
exception
		 */
		p2.eat();
	}

}
