class Square4
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
	    int S=5,T=3;
		Square4 s4=new Square4();
		
		s4.getdata(S,T);
		s4.calculate();
		
		
	}
}