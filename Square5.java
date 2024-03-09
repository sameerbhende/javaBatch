class Square5
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
class  CheckSqr
	
{
	
	public static void main(String args[])
	{   
	    
		Square5 s5=new Square5();
		
		s5.getdata(6,7);
		s5.calculate();
		
		
	}
}