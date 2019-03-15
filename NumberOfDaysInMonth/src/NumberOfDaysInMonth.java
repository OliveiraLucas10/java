
public class NumberOfDaysInMonth
{

	public static void main(String[] args)
	{
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));

		System.out.println("");

		System.out.println(getDaysInMonth(1, 2020));
		System.out.println(getDaysInMonth(2, 2020));
		System.out.println(getDaysInMonth(2, 2018));
		System.out.println(getDaysInMonth(-1, 2020));
		System.out.println(getDaysInMonth(1, -2020));

	}

	public static boolean isLeapYear(int year)
	{
		boolean isLeapYear = false;

		if (year >= 1 && year <= 9999)
		{
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			{
				isLeapYear = true;
			}
		}

		return isLeapYear;
	}

	public static int getDaysInMonth(int month, int year)
	{
		int getDaysInMonth = -1;

		if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999))
		{
			switch (month)
			{
				case 2:
					getDaysInMonth = isLeapYear(year) ? 29 : 28;
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					getDaysInMonth = 31;
					break;
				default:
					getDaysInMonth = 30;
					break;
			}

		}

		return getDaysInMonth;
	}

}
