class Rectangle1
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
 public static void main(String args[])
 {
	 Rectangle1 r1=new Rectangle1();
	 r1.getadata(5,5);
	 r1.calculate();
 }


}