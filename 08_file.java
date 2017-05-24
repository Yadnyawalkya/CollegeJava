import java.io.*;

class create
{
	public static void main(String a[])
	{
		boolean bool=false;
		String d = "C:\\Program Files\\Java\\jdk1.6.0\\bin\\iFiles";
		File f=new File(d);
		bool=f.mkdir();
		
		System.out.println(bool);
	
		if(bool == true)
		{
			System.out.println("File Created ! @ " + d);
		}
		else
		{
			System.out.println("Unfortunately File Not Created !");		
		}
		
	}
}
