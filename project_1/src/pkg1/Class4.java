package pkg1;
//  (((((10*2)-2)*2)+2)/2)   output is 19
public class Class4 
{
 public int multi(int a,int b)
 {
	 int c;
	 c=a*b;
	 System.out.println("Multi Result is " +c);
	 return c;
 }
 public int sub(int a1,int b1)
 {
	 int c1;
	 c1=a1-b1;
	 System.out.println("Sub Result is " +c1);
	 return c1;
 }
 public int sum(int a2,int b2)
 {
	 int c2;
	 c2=a2+b2;
	 System.out.println("Sum result is " +c2);
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
	Class4 obj = new Class4();  // obj is reference variable
	int multiResult = obj.multi(10, 2);
	int subResult = obj.sub(multiResult, 2);
	int multiResult2 = obj.multi(subResult, 2);
	int sumResult = obj.sum(multiResult2, 2);
	obj.div(sumResult, 2);
 }
}
 