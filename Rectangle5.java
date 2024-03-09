class Rectangle5
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
  class Check
  {
 public static void main(String args[])
 {
	 
	 Rectangle5 r5=new Rectangle5();
	 r5.getadata(5,4);
	 r5.calculate();
 }
}