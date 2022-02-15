package finalAssessment;

//two classes car and ferrari are created and class ferrari extends car overriding it's method 
//the subclass method is overriding the parent class method hence the subclass method is invoked at runtime
public class DynamicPolymorphism
{
	class Car
	{
         void run()
         {
        	 System.out.println("Running");
         }
	}
	class ferrari extends Car
	{
		//run method is called by referenced variable of the parent clasds
		void run()
		{
			System.out.println("Speeding with 50kmph");
		}
		public void main(String args[])
		{
			Car c = new ferrari();   //upcasting
			c.run();
		}
	}
	
}
