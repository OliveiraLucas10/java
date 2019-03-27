
public class Main
{

	public static void main(String[] args)
	{
		System.out.println(hasSharedDigit(12, 21));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}

	public static boolean hasSharedDigit2(int number1, int number2)
	{
		// if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99))
		// {
		// return false;
		// }
		// else
		// {
		boolean hasSharedGigit = false;

		// while running number1
		while (number1 != 0)
		{
			int lastDigitNumber1 = 0;
			int lastDigitNumber2 = 0;
			int number2Aux = number2;

			lastDigitNumber1 = number1 % 10;

			// while running on number2 to compare with lastDigit number1
			while (number2Aux != 0)
			{
				lastDigitNumber2 = number2Aux % 10;
				number2Aux /= 10;
				hasSharedGigit = lastDigitNumber1 == lastDigitNumber2;
				if (hasSharedGigit)
				{
					return true;
				}
			}

			// return true because found one number equal in two parameters

			number1 /= 10;
			number2Aux = number2;

			// }

		}
		return hasSharedGigit;

	}

	public static boolean hasSharedDigit(int number1, int number2)
	{
		if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99))
		{
			return false;
		}
		else
		{
			int lastDigitN1 = number1 % 10;
			number1 /= 10;

			int lastDigitN2 = number2 % 10;
			number2 /= 10;

			return ((lastDigitN1 == lastDigitN2 || lastDigitN1 == number2) || (number1 == lastDigitN2 || number1 == number2));

		}
	}
}
