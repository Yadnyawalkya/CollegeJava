import java.io.*;

class Cars
{
	public void CarsM()
	{
		System.out.println("I have Cars");
	}

}

class Audi extends Cars
{
	public void AudiM()
	{
		System.out.println("I have Audi");
	}
}

class Ferrari extends Cars
{
	public void FerrariM()
	{
		System.out.println("I have Ferrari");
	}
}

class BMW extends Cars
{
	public void BMWM()
	{
		System.out.println("I have BMW");
	}

}
class Test
{
	public static void main(String args[])
	{
		BMW ob=new BMW();
		Ferrari of=new Ferrari();
		Audi oa=new Audi();
		Cars oc=new Cars();

		//Method Calling 

		ob.BMWM();
		of.FerrariM();
		oa.AudiM();
		oc.CarsM();
	}
}