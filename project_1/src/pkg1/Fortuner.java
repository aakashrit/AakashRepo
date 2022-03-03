package pkg1;

//heirarchical inheritance Fortuner is child 1 of father toyota

public class Fortuner extends Toyota
{
 public void model2()
 {
	 System.out.println("Fortuner is best car in india");
 }
 public static void main(String[] args) 
 {
	Fortuner q=new Fortuner(); // q is reference variable
	q.model1();
	q.model2();
	
 }
}
