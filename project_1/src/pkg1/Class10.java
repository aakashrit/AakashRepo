package pkg1;
//Assignment 2
//Used the this and super keyword for method calling
//Class10 is the child class
public class Class10 extends Class9
{
 public void method4()
 {  
	 this.method3(4, 7, 9);
	 super.method();
	 this.method2(2,3);
	 super.method1(4);
	 System.out.println("Child default method");
 }
 public void method5(int a)
 {   
	this.method7(7, 9, 14);
	System.out.println("Child 1 parameterized method");
	
	 
 }
 public void method6(int a,int b)
 {
     this.method5(4);
	 System.out.println("Child 2 parameterized method");
 }
 public void method7(int a,int b,int c)
 {
	 this.method4();
	 System.out.println("Child 3 parameterized method");
 }
 public static void main(String[] args) 
 {
	Class10 obj= new Class10();
	obj.method6(10,8);
	
 }
} 
