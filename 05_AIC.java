class Country
{
	public 
		String India="INDIA";
	 public void Incredible()
	{
	}

}

class India
{
	public static void main(String args[])
	{
		Country C=new Country()
		{
			public void Incredible()
			{
				System.out.println("Incredible "+ India + " !");
			}
		};

		C.Incredible();
	}
}