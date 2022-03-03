package pkg1;

//heirarchical inheritance Innova is child 2 of father toyota

public class Innova extends Toyota
{
 public void model3()
 {
	 System.out.println("Innova Is High Level Car");
 }
 public static void main(String[] args) 
 {
	Innova w=new Innova();  // w is reference variable
	w.model1();
	w.model3();
	
 }
}
