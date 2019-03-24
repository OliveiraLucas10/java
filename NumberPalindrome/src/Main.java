
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
		StringBuilder sb = new StringBuilder();
		int numberMovement = number < 0 ? number * -1 : number;

		while (numberMovement > 0)
		{
			sb.append(numberMovement % 10);
			numberMovement /= 10;
		}

		return (Integer.valueOf(sb.toString()) == ((number < 0) ? number * -1 : number));

	}

}
