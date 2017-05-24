/* Programs to Printing exception message with Three Ways
	1. Printing exception object-Catch and try block 
	2. Using getMessage()
	3. Using printStackTrace()
 */
class Ex
{
	public static void main(String args[])
	{
		try
		{
			int TEN=10,ZERO=0,TOTAL;
			TOTAL=(TEN/ZERO);	
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Occurs !"); //Simple Printing

			System.out.println(e.getMessage()); //using getMessage Keyword

 			e.printStackTrace(); // printStackTrace
		} 
	}
}