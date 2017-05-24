import java.io.*;

class create
{
	public static void main(String a[])
	{
		boolean bool=false;
		String d = "C:\\Program Files\\Java\\jdk1.6.0\\bin\\iFile";
		File f=new File(d);
		bool=f.mkdir();
		
		/*System.out.println(bool);
	
		if(bool == true)
		{
			System.out.println("File Created ! @ " + d);
		}
		else
		{
			System.out.print("Unfortunately File Not Created because ");
			if (f.exists() == true)
			{
				System.out.print("File Already Exists !");	
			}
			else
			{
				System.out.print("of Some Technical Failure !");	
			}		
		}*/

		try{
		FileOutputStream o=new FileOutputStream("iFile\\myfile.txt");
		String s="File Created  @ '" +  d  + "' location";
		byte b[]=s.getBytes();
		o.write(b);
		o.close();  
		}catch(Exception e){System.out.println(e);}
	}
}
