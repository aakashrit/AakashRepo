package pkg1;

// Multi Level Inheritance

public class CretaSX extends Creta
{
 public void modeltype()
 {
	 System.out.println("Model Type Is SX");
 }
 public static void main(String[] args) 
 {
	CretaSX s =new CretaSX(); //s is reference variable
	s.modeltype();
	s.model();
	s.basePrice();
 }
}
