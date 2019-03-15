
public class IntEqualityPrinter
{

	public static void printEqual(int a, int b, int c)
	{
		boolean a_is_b = (a == b);
		boolean a_is_c = (a == c);
		boolean b_is_c = (b == c);

		if (a < 0 || b < 0 || c < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			if (a_is_b && a_is_c)
			{
				System.out.println("All numbers are equal");
			}
			else if (!a_is_b && !a_is_c && !b_is_c)
			{
				System.out.println("All numbers are different");
			}
			else
			{
				System.out.println("Neither all are equal or different");
			}

		}

	}

}
