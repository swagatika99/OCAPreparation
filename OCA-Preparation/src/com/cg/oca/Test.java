package com.cg.oca;

public class Test {
public static void main(String [] args) {
/*
 * What should be written in line no 8 to compile it and provide the output one
 */
	//byte x=1;
//	long x=1;//can't swtch to value long
//	double x=1;
	Integer x=new Integer("1");
	//String x="1";//cannoy convert from int to string
	//short x=1;
	switch(x) {
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	}
}
}

///byte short and integer type can be assigned to x.