/**
Title       : 07 - MultiThreading
*/
class Th1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Th1::"+i);
		}

	}
}
class Th2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Th2::"+i);
		}
	}
}
class TDemo
{
	public static void main(String[] args)
	{
		Th1 t1=new Th1();
		Thread t2=new Thread(new Th2());
		
		t1.setPriority(1);
		t2.setPriority(10);
		t2.start();
		t1.start();
	} 
}