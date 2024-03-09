class Square2
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
}
	
	class Test
	{
	public static void main(String args[])
	{
		Square2 s2=new Square2();
		s2.getdata(3,4);
		s2.calculate();
		
		
	}
}