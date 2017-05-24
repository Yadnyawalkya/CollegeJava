import java.io.*;

class society
{
	society()
	{
	System.out.println("In society");
	}
}
class engineering extends society
{
	engineering()
	{
		System.out.println("In Engineering");
	}
}
class medical extends engineering
{
	medical()
	{
		System.out.println("In medical");
	}
}
class inheritance
{
	public static void main(String[] args)
	{
	medical m1=new medical();
	}
}