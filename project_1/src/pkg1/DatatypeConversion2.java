package pkg1;

//Assignment 2
//DatatypeConversion
//explicit call

public class DatatypeConversion2 
{
  public void c3()
  {
	  float a=45.9F;  //explicit conversion
	  int b;          //small datatype store big datatype
	  b=(int)a;
	  System.out.println("Value of b is " +b);
  }
  public void c5()
  {
	  double a=4.9F;  //explicit conversion
	  int b;          //small datatype store big datatype
	  b=(int)a;
	  System.out.println("Value of b is " +b);
}
  
  public void c4()
  {
	  int a=66;  //explicit conversion
	  char c;          //small datatype store big datatype
	  c=(char)a;
	  System.out.println("Value of c is " +c);
  }
  public static void main(String[] args) 
  {
	  DatatypeConversion2 obj=new DatatypeConversion2();
	  obj.c3();
	  obj.c5();
	  obj.c4();
  }
}
