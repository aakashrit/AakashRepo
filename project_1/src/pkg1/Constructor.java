package pkg1;
// this keyword used for constructor calling
public class Constructor 
{
  public Constructor()
  {  
	  this(45,63,21);
	  System.out.println("This is default constructor");
  }
  public Constructor(int a)
  { 
	  this(78,89,45,65);
	  System.out.println("This is one parameterized constructor");
  }
  public Constructor(int a,int b)
  { 
	  this();
	  System.out.println("This is two parameterized constructor");
  }
  public Constructor(int a,int b,int c)
  {
	  System.out.println("This is three parameterized constructor");
  }
  public Constructor(int a,int b,int c,int d)
  {  
	 this(14,56);
	System.out.println("This is four parameterized constructor");  
  }
  public static void main(String[] args) 
  {
	Constructor obj = new Constructor(45);
  }
}
