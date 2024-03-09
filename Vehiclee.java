
public class Vehiclee
{
		   final String model;
		   public Vehiclee(String model)
		   {
			       this.model = model;  
		   }
		   public void start()
		   {
			     System.out.println("Starting the "+model);
		   }
		   public void stop()
		   {
			     System.out.println("Stopping the "+model);
		   }
}
class Car extends Vehiclee
{
	     final int year;
	     public Car(String model,int year)
	     {
	    	     super(model);      // 
	    	     this.year = year;   
	     }
	     public void drive()
	     {
	    	  System.out.println("Driving the "+model+" - Y	ear: "+year);
	     }
}


