package com.cg.oca;

public class Program8 {
	/*
	 * what is the output of the code?
	 */
public static void main(String [] args)
{
	Short s1=200;
	Integer s2=400;
	//String s3=(String)(s1+s2);//line1
	Long s4=(long)s1+s2;//line2
	System.out.println("s4 is="+s4);
}
}
//error in line 1 classcast exception can't5 cast int to string.
