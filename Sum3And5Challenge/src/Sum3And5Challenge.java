
public class Sum3And5Challenge
{

	public static void main(String[] args)
	{

		int sum = 0;
		int count = 0;

		for (int x = 1; x <= 100; x++)
		{
			if (x % 3 == 0 && x % 5 == 0)
			{
				count++;
				sum += x;
				System.out.println("Found number = " + x);

			}

			if (count == 5)
			{
				break;
			}
		}

		System.out.println("The sum is " + sum);

	}

}
