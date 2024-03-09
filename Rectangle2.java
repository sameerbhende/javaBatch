class Rectangle2
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
	 Rectangle2 r2=new Rectangle2();
	 r2.getadata(5,5);
	 r2.calculate();
 }
}