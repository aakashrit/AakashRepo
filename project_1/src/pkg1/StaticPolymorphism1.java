package pkg1;
// Overloading when the output are different
// Assignment 1
public class StaticPolymorphism1 
{
 public int airthmetic(int a,int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("The Result is " +c);
	 return c;
 }
 public void airthmetic(int a,int b,int c)
 {
	 int d;
	 d=a*b*c;
	 System.out.println("The Result is " +d);
 }
 public static void main(String[] args) 
 {
	 StaticPolymorphism1 ob =new  StaticPolymorphism1();
	 ob.airthmetic(10, 2, 3);
	 ob.airthmetic(10, 13);
 }

 
}
