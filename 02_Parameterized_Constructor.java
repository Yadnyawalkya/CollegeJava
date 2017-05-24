
class Rectangle 
{
  int length;
  int breadth;

  Rectangle(int len,int bre)
  {
	length=len;
	breadth=bre;
  }
}
class mainRectangle
{
     public static void main(String args[]) 
	{
		Rectangle r=new Rectangle(20,10);
		System.out.println("Length of Rectangle : " + r.length);
		System.out.println("Breadth of Rectangle : " + r.breadth);
	}
}