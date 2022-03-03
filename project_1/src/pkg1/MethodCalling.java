package pkg1;
// this keyword used for method calling
public class MethodCalling
{
 public void method()
 {  
	  this.method3(10, 4, 5);
	  System.out.println("This is default method");
	  this.method1(7);
	  this.method2(8, 9);
	  this.method4(1, 2, 3, 4);
	  this.method5(6, 5, 4, 3, 1);
 }
 public void method1(int a)
 {    
	 System.out.println("One Parameterized method");
 }
 public void method2(int a,int b)
 { 
	 System.out.println("Two Parameterized method");
 }
 public void method3(int a,int b,int c)
 { 
	 System.out.println("Three Parameterized method");
 }
 public void method4(int a,int b,int c,int d)
 { 
	 System.out.println("Four Parameterized method");
 }
 public void method5(int a,int b,int c,int d,int e)
 { 
	 System.out.println("Five Parameterized method");
 }
 public static void main(String[] args) 
 {
	MethodCalling obj = new MethodCalling();
	obj.method();
 }
 
}
