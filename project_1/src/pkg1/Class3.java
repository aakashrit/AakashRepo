package pkg1;
 // (((((10+2)+2)-2)*2)/2)  output is 12
public class Class3 
{
  public int sum(int a,int b)
  {
	  int c;
	  c=a+b;
	  System.out.println("Sum Result is " +c);
	  return c;
  }
  public int sub(int a1,int b1)
  {
	  int c1;
	  c1=a1-b1;
	  System.out.println("Sub Result is" +c1);
	  return c1;
  }
  public int multi(int a2,int b2)
  {
	  int c2;
	  c2=a2*b2;
	  System.out.println("Multi Result is " +c2);
	  return c2;
  }
  public void div(int a3,int b3)
  {
	  int c3;
	  c3=a3/b3;
	  System.out.println("Final Result is "+c3);
	  
  } 
  public static void main(String[] args) 
  {
	Class3 obj= new Class3(); //obj is reference_variable
	int sumResult =obj.sum(10, 2);
	int sumResult2=obj.sum(sumResult,2);
	int subResult =obj.sub(sumResult2, 2);
	int multiResult =obj.multi(subResult, 2);
	obj.div(multiResult, 2);
  }
}
