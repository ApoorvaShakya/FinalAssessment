package finalAssessment;

public class StaticPolymorphism 
{
	
	class overloading
	{
		public void main(String args[])
		{
			StaticPolymorphism addition=new StaticPolymorphism();
			addition.add(2,3);
			addition.add(1,2,3);
			addition.add('A', 'B');
		
	}
   }

	public void add(int i, int j, int k)
	{
		  //function to add two integers
		  System.out.println("Addition of two integers " +(i+j+k));	
	}

	public void add(int i, int j) 
	{  //function to add two integers
		System.out.println("Addition of two integers " +(i+j));	
	}

	public void add(char c, char d) 
	{
		//function to add two characters
	    System.out.println("Addition of 2 characters "+(c+d));	
	}
}
