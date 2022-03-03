package pkg1;
// Used the this and super keyword for constructor calling
// Class7 is the parent class

public class Class7 
{
  public Class7()
 {
	 this(5,6,4);
	 System.out.println("Parent default constructor");
 }
 public Class7(int a)
 { 
	 this(2,6);
	 System.out.println("Parent 1 parameterized constructor");
 }
 public Class7(int a,int b)
 {
	 this();
	 System.out.println("Parent 2 parameterized constructor");
 }
 public Class7(int a,int b,int c)
 {   
	 
	 System.out.println("Parent 3 parameterized constructor");
 }
 
}
