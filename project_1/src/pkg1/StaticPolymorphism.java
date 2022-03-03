package pkg1;
// Overloading when the output are same
// Assignment 1 
public class StaticPolymorphism
{
 public void adition(int a,float b,int c)
 {
	 float d;//input count match but sequence is not match
	 d=a+b+c;
	 System.out.println("Result is " +d);
 }
 public void adition(int a,int b,float c)
 {
	 float e;
	 e=a+b+c;
	 System.out.println("Result is " +e);
 }
 public static void main(String[] args) 
 {
	StaticPolymorphism obj=new StaticPolymorphism();
	obj.adition(1, 7.4F, 1);
	obj.adition(1, 2, 8F );

 }
 
 
}
