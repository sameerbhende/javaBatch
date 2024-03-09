class Circumference1
{
 double pi=3.14,r,circum;
 void getdata(int R)
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
  Circumference1 c1=new Circumference1();
  c1.getdata(5);
  c1.calculate();
 }

}