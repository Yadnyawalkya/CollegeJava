import java.io.*;

class Test
{
	public static void main(String a[])
	{
		try{

		FileOutputStream o=new FileOutputStream("1file.java");

		String str="import java.io.*;\n class innerc{ \n public static void main (String a[]){}}";

		o.write(str);

		o.close();

		System.out.println("Process Completed ! "); 
		}catch(Exception e){System.out.println(e);}
	}
}
