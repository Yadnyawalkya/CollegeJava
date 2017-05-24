import java.io.*;

class create
{
	public static void main(String a[])
	{
		boolean bool=false;
		String d = "C:\\Program Files\\Java\\jdk1.6.0\\bin\\iFile\\1.txt";
		File f=new File(d);
		bool=f.mkdirs();
		
		System.out.println(bool);
	
		if(bool == true)
		{
			System.out.println("File Created ! @ " + d);
		}
		else
		{
			System.out.print("Unfortunately File Not Created because ");
			if (f.exists())
			{
				System.out.print("File Already Exists !"+ f.exists);	
			}
			else
			{
				System.out.print("of Some Technical Failure !");	
			}		
		}
	}
}
