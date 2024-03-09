class Square3
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
		Square3 s3=new Square3();
		int S=5,T=3;
		s3.getdata(S,T);
		s3.calculate();
		
		
	}
}