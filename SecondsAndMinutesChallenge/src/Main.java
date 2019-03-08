
public class Main
{

	public static void main(String[] args)
	{

		System.out.println(Calc.getDurationString(345));
		System.out.println(Calc.getDurationString(7345));
		System.out.println(Calc.getDurationString(13515));
		
		System.out.println("");
		System.out.println(Calc.getDurationString(61, 0));
		System.out.println(Calc.getDurationString(65, 45));
		System.out.println(Calc.getDurationString(65, 9));

	}

}
