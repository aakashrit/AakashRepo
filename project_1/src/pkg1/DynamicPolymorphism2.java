package pkg1;
//Overriding Polymorphism Example
//DynamicPolymorphism2 This is Child Class
//Assignment 1
public class DynamicPolymorphism2 extends DynamicPolymorphism1
{
	 public void airthmetic(int a,int b)
	 {
		
		int c;
		c=a-b;
		
		System.out.println("The Result is " +c);
	 }
 public static void main(String[] args) 
 {
	 DynamicPolymorphism2 obj=new  DynamicPolymorphism2();
	 obj.airthmetic(10, 5);
	 obj.airthmetic(12, 1);
	
 }
}
