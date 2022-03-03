package pkg2;

import pkg1.ClassA;

//Creation of the object of a classA in another classB in different package
//has a relationship 2nd Case

public class ClassB 
{
	public void hari()
	{
		System.out.println("I am Hari");
	}
	public static void main(String[] args) 
	{
			ClassA ob=new ClassA();
			ob.method1();
			ClassB obj=new ClassB();
			obj.hari();
	}
	
	  
}
