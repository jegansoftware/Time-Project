//file name should be named as hour_min.java
package Program;

public class hour_min {
	
	public int hour;
	public int min;
	public int currect;
	public int i=1;
	
	public void time(int hour,int min)
	{
	
		
		while(i==1)
		{
			if(hour>12 || min>60)
			{
				hour=0;
				min=0;
			
				System.out.printf("\nSorry!! ");
				System.out.printf("\nHour Shouldn't be entered above 12");
				System.out.printf("\nMinites Shouldn't be entered above 12");			
				break;
				
			}
			
			
			
			
			i++;
			if(min<=5)
			{
				min=5;
				break;
			}
			else if(min<=10)
			{
				min=10;
				break;
			}
			else if(min<=15)
			{
				min=15;
				break;
			}
			else if(min<=20)
			{
				min=20;
				break;
			}
			else if(min<=25)
			{
				min=25;
				break;
			}
			else if(min<=30)
			{
				min=30;
				break;
			}
			else if(min<=35)
			{
				min=35;
				break;
			}
			else if(min<=40)
			{
				min=40;
				break;
			}
			else if(min<=45)
			{
				min=45;
				break;
			}
			else if(min<=50)
			{
				min=50;
				break;
			}
			else if(min<=55)
			{
				min=55;
				break;
			}
			else if(min<=60)
			{
				min=60;
				break;
			}
			else if(min>60)
			{
				min=60;
				break;
				
			}
			
		}
		
		
		if(min==60)
		{
			hour++;
			min=00;
			
			
			
			if(hour==13)
			{
				
				hour=1;
			}
		}
		
	
		System.out.printf("\n%2d : %2d",hour,min);
		
		System.out.printf("\nThank you for using our software");
	}
}
