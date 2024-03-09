class Circumference3
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
 }
 class Test
 {
 public static void main(String args[])
 {
  Circumference3 c3=new Circumference3();
  double s=4;
  c3.getdata(s);
  c3.calculate();
 }

}