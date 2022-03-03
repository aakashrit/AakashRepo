package pkg1;

public class Student
{

 int age;
 int roll_no;   // variable decleration
 public void display1()
 {
	 System.out.println("Welcone to all of you");
 }
 public void display2()      // method decleration
 {
	 System.out.println("Automation is very easy");
	 System.out.println("Automation is very very easy");
 }
 
 public static void main(String[] args)
 {
	Student abc = new Student();   //abc is reference variable
	abc.display1();
	abc.display2();
	abc.age=27;
	System.out.println(abc.age);
	abc.roll_no=111;
	System.out.println(abc.roll_no);
 }
}
