
public class IntEqualityPrinter
{

	public static void printEqual(int a, int b, int c)
	{
		boolean aIsB = (a == b);
		boolean aIsC = (a == c);
		boolean bIsC = (b == c);

		if (a < 0 || b < 0 || c < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			if (aIsB && aIsC)
			{
				System.out.println("All numbers are equal");
			}
			else if (!aIsB && !aIsC && !bIsC)
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
