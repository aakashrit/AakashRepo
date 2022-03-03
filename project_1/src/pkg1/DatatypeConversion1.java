package pkg1;

// Assignment 2
//DatatypeConversion
//implicit call

public class DatatypeConversion1 
{
 public void c1()
 {
	 int c=25;  // implicit conversion
	 float d;  // big datatype store small datatype
	 d=c;
	 System.out.println("Value of d is" +d);
	 System.out.println("Value of float  is" +d);
 }
 public void c2()
 {
	 char c='b';  // implicit conversion
	 int d;  // big datatype store small datatype
	 d=c;
	 System.out.println("Value of d is" +d);
 }
 
 public static void main(String[] args)
 {
	 DatatypeConversion1 obj=new DatatypeConversion1();
	 obj.c1();
	 obj.c2();
			 
 }
}
