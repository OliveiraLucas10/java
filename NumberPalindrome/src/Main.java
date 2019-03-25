
public class Main
{

	public static void main(String[] args)
	{
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		System.out.println(isPalindrome(9));

	}

	public static boolean isPalindrome(int number)
	{
		int numberMovement = number;
		int reverse = 0;

		while (numberMovement != 0)
		{
			int lastDigit = numberMovement % 10;
			numberMovement /= 10;
			reverse *= 10;
			reverse +=lastDigit;
		}

		return (number == reverse);

	}

}
