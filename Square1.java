class Square1
{
	int s1,s2,area;
	void getdata(int x,int y)
	{
		s1=x;
		s2=y;
	}
	void calculate()
	{
		area=s1*s2;
		System.out.println("Area of square is"+area);
	}
	
	
	public static void main(String args[])
	{
		Square1 s1=new Square1();
		s1.getdata(3,4);
		s1.calculate();
		
		
	}
}