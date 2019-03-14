

public class MinutesToYearsAndDaysCalculator
{
	
	public static void main(String[] args)
	{
		printYearsAndDays(525600);		
		printYearsAndDays(1051200);		
		printYearsAndDays(561600);		
	}
	
	
	public static void printYearsAndDays(long minutes)
	{
		if(minutes < 0)
		{
			System.out.println("Invalid Value");
		}
		
		else
		{
			
			long hours = minutes / 60L;
			long days = hours / 24L;
			long years = days / 365L;
			days = days % 365L;
			
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
			
		}
		
	}

}
