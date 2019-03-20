
public class ForChallenge
{

	public static void main(String[] args)
	{

		int count = 0;

		for (int x = 10; x < 50; x++)
		{
			if (isPrime(x))
			{
				System.out.println(x + " is a prime number");
				count++;
				if (count == 3)
				{
					System.out.println("3 primes number were found!");
					break;
				}
			}
		}

	}

	public static boolean isPrime(int n)
	{
		if (n == 1)
		{
			return false;
		}

		for (int i = 2; i <= n / 2; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}

		return true;
	}

}
