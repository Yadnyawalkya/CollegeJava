/**
Title   :  3. Study of Interfaces and extends keyword
*/

import java.io.*;

interface engineering
{
	void display();
}

interface medical
{
	void show();
}

class B
{
	void branch()
	{
	System.out.println("India !");
	}

}

class interface_college implements engineering,medical extends B
{
	public void display()
	{
	System.out.println("Enginnering...");
	}
	public void show()
	{
	System.out.println("show");
	}

	public static void main(String[] args)
	{
	interface_college obj = new interface_college();
	obj.display();
	obj.show();
	obj.branch();
 	}
}
