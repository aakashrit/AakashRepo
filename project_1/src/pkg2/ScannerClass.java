package pkg2;

import java.util.Scanner;

//Assignment on Scanner Class
//(((((x1+x2)-x3)+x4)*x5)/x6)

public class ScannerClass 
{
 public int sum(int x1,int x2)
 {
	 int z;
	 z=x1+x2;
	 System.out.println("The Sum of two number is "+z);
	 return z;
 }
 public int sub(int x3,int x4)
 {
	 int a;
	 a=x3-x4;
	 System.out.println("The Sub of two number is "+a);
	 return a;
 }
 public int multi(int x5,int x6)
 {
	 int b;
	 b=x5*x6;
	 System.out.println("The Multipli of two number is "+b);
	 return b;
 }
 public int div(int x7,int x8)
 {
	 int c;
	 c=x7/x8;
	 System.out.println("The div of two number is "+c);
	 return c;
	 
 }
 public static void main(String[] args) 
 {
  Scanner s=new Scanner(System.in);   // Scanner class object
  ScannerClass obj=new ScannerClass();       // obj is object of our main class
  System.out.println("Enter the value of x1 :");
  int x1=s.nextInt();
  System.out.println("Enter the value of x2 :");
  int x2=s.nextInt();
  int Sumresult1 =obj.sum(x1, x2);  // call sum method
  System.out.println("Enter the value of x3 :");
  int x3=s.nextInt();
  int SubResult=obj.sub(Sumresult1,x3);  // call sub method
  System.out.println("Enter the value of x4 :");
  int x4=s.nextInt();
  int SumResult2=obj.sum(SubResult,x4); // call sum method
  System.out.println("Enter the value of x5 :");
  int x5=s.nextInt();
  int MultiResult=obj.multi(SumResult2, x5);  //call multi method
  System.out.println("Enter the value of x6 :");
  int x6=s.nextInt();
  int DevResult=obj.div(MultiResult, x6);    // call div method
  System.out.println("Final Result is : "+DevResult);
 
  
 }
}
