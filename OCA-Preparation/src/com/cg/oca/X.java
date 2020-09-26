package com.cg.oca;

import java.io.IOException;

/*
 * What modification should be made so that code will compile?
 */

 class Test1 {
public void printFileContent()throws IOException
{
	throw new IOException();
}}

public class X
{
	public static void main(String [] args) 
			throws IOException
	{
	Test1 obj = new Test1();
		obj.printFileContent();
	}
}


