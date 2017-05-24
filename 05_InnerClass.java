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
		Cars C=new Cars();
		Cars.Ferrari CF=C.new Ferrari();
		CF.Run();
	}

}