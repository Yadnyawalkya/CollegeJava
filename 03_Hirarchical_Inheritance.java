/**
Title   : 03 - Hirachical Inheritance  
*/

import java.util.*;
import java.io.*;
class A 
{
	void ca() 
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number in class A : ");
	int a = input.nextInt();
	System.out.println("In class A : a =  " + a );
	System.out.println("\n\n\n" );
	}
}

class B extends A
{
	void cb()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number in class B : ");
		int a = input.nextInt();
		System.out.println("In class B : a =  " + a );
		//B obj = new B();
		//boj.ca();
		System.out.println("\n\n\n" );
	}
}

class C extends A
{
	void cc()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number in class C : ");
		int a = input.nextInt();
		System.out.println("In class C : a =  " + a );
		
		//C obj = new C();
		//boj.ca();
		System.out.println("\n\n\n" );
	}
} 

class Method
{
	public static void main (String args[])
	{
		
		B obj2 = new B();
		C obj3 = new C();

		System.out.println("Access class B from B :");
		obj2.cb();
		System.out.println("Access class A from B :");
		obj2.ca();
		System.out.println("Access class C from C :");
		obj3.cc();
		System.out.println("Access class A from C :");
		obj3.ca();

	}
}



