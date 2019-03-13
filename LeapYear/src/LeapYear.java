
public class LeapYear
{

	public static boolean isLeapYear(int year)
	{
		boolean isLeapYear = false;

		if (year >= 1 && year <= 9999)
		{
			boolean remainder_4 = (year % 4) == 0;
			boolean remainder_100 = (year % 100) == 0;
			boolean remainder_400 = (year % 400) == 0;

			if ((remainder_4 && !remainder_100) || remainder_400)
			{
				isLeapYear = true;
			}

		}

		return isLeapYear;

	}

}
