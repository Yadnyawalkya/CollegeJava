import java.io.*;

class A implements My
{
      
     public void get()
         {
              System.out.println("Inside another class");
              
         }
     public void display()
       {
                           System.out.println("Inside another class");
        }
}

class MainM
{
public static void main(String s[])
          {
               A a=new A();
               a.get();
              a.display();
           }
}
