import java.io.*;
class Cars
{
	private
		int Speed=600;
		
		
	class Ferrari
	{
		void Run()
		{
			System.out.println("Ferrari running at " + Speed + "Kmph");
		}
	}

	public static void main(String args[])
	{
		Cars.Ferrari CF=new Ferrari();
		Cars CF=new Cars();
		CF.Run();
	}

}