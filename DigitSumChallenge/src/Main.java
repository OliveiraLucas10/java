
public class Main
{

	public static void main(String[] args)
	{
		System.out.println(sumDigits(125)); // 8
		System.out.println(sumDigits(222)); // 6
		System.out.println(sumDigits(-1)); // -1
		System.out.println(sumDigits(8)); // -1
		System.out.println(sumDigits(123)); // 6

	}

	private static int sumDigits(int number)
	{

		if (number >= 10)
		{
			int sumDigits = 0;

			while (number > 0)
			{
				sumDigits += number % 10;
				number /= 10;

			}

			return sumDigits;
		}

		return -1;
	}

	public static boolean isEvenNumber(int number)
	{
		return (number > 0) && ((number % 2) == 0);
	}

}
