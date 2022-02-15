package finalAssessment;

import org.junit.Test;

public class Ques2
{
	@Test
	public void ifFantastic()
	{
		String[] StringValue=new String[5];    //Allocating memory dynamically
		StringValue[0]="Fantastically";        //String at first position
		StringValue[1]="Fantastic";
		StringValue[2]="Intrigue";
		StringValue[3]="Awesome";
		StringValue[4]="Awful";
        String fant="Fantastic";         //String to be compared with
        int len=fant.length();
        for(int i=0;i<5;i++)
        {
        	int lengString=StringValue[i].length();
        	if(len==lengString)                  //if compared strings lengths is unequal no need to compare the string
        	{
        		if(fant==StringValue[i])
        		{
        			System.out.println("SUCCESSFUL!!");
        		}
        		else
        			System.out.println("UNSUCCESSFUL!!");
        	}
        	else
        		System.out.println("UNSUCCESSFUL!!");
        }
	}
}
