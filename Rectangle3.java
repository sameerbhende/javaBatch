class Rectangle3
{
  int l,b,area;
  void getadata(int L,int B)
  {
	  l=L;
	  b=B;
  }
  void calculate()
  {
	  area=l*b;
	  System.out.println("Area of rectangle is"+area);
  }
 }
class Test
{ 
 public static void main(String args[])
 {
	 Rectangle3 r3=new Rectangle3();
	 int s=5,t=5;
	 r3.getadata(s,t);
	 r3.calculate();
 }
}