import java.io.*;
class Parents
{
	public void Methodp()
	{
		System.out.println("We are in Method of Parents Class ! ");
	}

}
class Child extends Parents
{
	public void Methodc()
	{
		System.out.println("We are in Method of Child Class ! ");
	}
	public static void main(String args[])
	{
		Child oc=new Child();
		oc.Methodp();
		oc.Methodc();
	}

}