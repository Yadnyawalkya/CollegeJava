package WIFI;

class internet
{
	public void Lan()
	{
		int Lspeed =100;
		System.out.println("We are Using 4G @" + Lspeed + " kb/s  Speed !");
	}
	public static void main(String a[])
	{
		wifi w=new wifi();
		w.FourG();
		internet i=new internet();
		i.Lan();
	}
}