package pkg1;
// create the object of one classC to another classD in same package
//  has a relationship 1st Case
public class ClassD 
{
	 public void hello()
	 {
		 System.out.println("Hello Guys"); 
	 }
	 public static void main(String[] args) 
	 {
		ClassC obj=new ClassC(); //obj is reference variable
		obj.method1();
		ClassD obj1=new ClassD();//obj1 is reference variable
		obj1.hello();
	 }
}
