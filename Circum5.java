class Circumference5
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
 
  Circumference5 c5=new Circumference5();
  
  c5.getdata(5);
  c5.calculate();
 }

}