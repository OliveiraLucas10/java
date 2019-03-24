
public class SumOddRange
{

	public static boolean isOdd(int num)
	{
		return (num > 0) && ((num % 2) != 0);
	}

	public static int sumOdd(int start, int end)
	{

		if (start > 0 && end >= start)
		{
			int sumOdd = 0;

			for (int x = start; x <= end; x++)
			{
				if (isOdd(x))
				{
					sumOdd += x;
				}
			}

			return sumOdd;
		}

		return -1;
	}

}
