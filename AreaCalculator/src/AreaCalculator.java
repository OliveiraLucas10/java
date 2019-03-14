
public class AreaCalculator
{

	public static void main(String[] args)
	{
		System.out.println(area(5));
		System.out.println(area(-1));
		System.out.println(area(5, 4));
		System.out.println(area(-1, 4));

	}

	public static double area(double radius)
	{
		double area = -1d;

		if (radius >= 0)
		{
			area = radius * radius * Math.PI;
		}

		return area;
	}

	public static double area(double x, double y)
	{
		double area = -1d;

		if (x >= 0 && y >= 0)
		{
			area = x * y;
		}

		return area;
	}

}
