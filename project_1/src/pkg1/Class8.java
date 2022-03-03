package pkg1;
// Assignment 1
//Used the this and super keyword for constructor calling
//Class8 is the child class

public class Class8 extends Class7
{
 public Class8()
 {  
	 super(2);
	 System.out.println("Child default constructor");
 }
 public Class8(int a)
 {
	 this(7,9,5);
	 System.out.println("Child 1 parameterized constructor");
 }
 public Class8(int a,int b)
 {   
	 this(8);
	 System.out.println("Child 2 parameterized constructor");
 }
 public Class8(int a,int b,int c)
 {  
	 this();
	 System.out.println("Child 3 parameterized constructor");
 }
 public static void main(String[] args) 
 {
	Class8 obj=new Class8(12,45);
 }
 
}
	