class Circumference2
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
 }
 class Test
 {
 public static void main(String args[])
 {
  Circumference2 c2=new Circumference2();
  c2.getdata(5);
  c2.calculate();
 }

}