
public class Main
{

	public static void main(String[] args)
	{
		printDayOfTheWeekIf(0);
		printDayOfTheWeekSwitch(0);
		
		printDayOfTheWeekIf(7);
		printDayOfTheWeekSwitch(7);
	}

	public static void studying()
	{
		char charVariable = 'G';

		switch (charVariable)
		{
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
				System.out.println("The char is " + charVariable);
				break;

			default:
				System.out.println("The char is not A, B, C, D or E");
				System.out.println("Actually is " + charVariable);
				break;

		}

		String month = "January";
		switch (month.toLowerCase())
		{
			case "january":
				System.out.println("Jan");
				break;
			case "june":
				System.out.println("Jun");
				break;
			default:
				System.out.println("Not sure");
				break;
		}

	}

	public static void printDayOfTheWeekSwitch(int day)
	{
		switch (day)
		{
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}
	}

	public static void printDayOfTheWeekIf(int day)
	{
		if (day < 0 || day > 6)
		{
			System.out.println("Invalid day");
		}
		else
		{
			if (day == 0)
				System.out.println("Sunday");

			else if (day == 1)
				System.out.println("Monday");

			else if (day == 2)
				System.out.println("Tuesday");

			else if (day == 3)
				System.out.println("Wednesday");

			else if (day == 4)
				System.out.println("Thursday");

			else if (day == 5)
				System.out.println("Friday");

			else if (day == 6)
				System.out.println("Saturday");
		}

	}

}
