class Rectangle4
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
	 int s=5,t=5;
	 Rectangle4 r4=new Rectangle4();
	 r4.getadata(s,t);
	 r4.calculate();
 }
}