class Circumference4
{
 double pi=3.14,r,circum;
 void getdata(double R)
 {
  r=R;
 }
 void calculate()
 {
  circum=2*pi*r;
  System.out.println("Circumference of circle is"+circum);
 }
 
 
 
 public static void main(String args[])
 {
  double s=4;
  Circumference4 c4=new Circumference4();
  
  c4.getdata(s);
  c4.calculate();
 }

}