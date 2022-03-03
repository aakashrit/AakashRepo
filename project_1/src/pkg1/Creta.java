package pkg1;

// single level Inheritance

public class Creta extends Hyundai
{
 public void model()
 {
	 System.out.println("Model is Creta");
 }
 public static void main(String[] args) 
 {
	Creta c=new Creta(); // c is reference variable
	c.model();
	c.basePrice();
 }
}
