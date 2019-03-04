
public class SpeedConverter
{

	public static long toMilesPerHour(double kilometersPerHour)
	{

		double milesFator = 1.609d;

		if (kilometersPerHour < 0)
		{
			return -1;

		}

		return Math.round(kilometersPerHour / milesFator);

	}

	public static void printConversion(double kilometersPerHour)
	{
		if (kilometersPerHour < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
		}
	}
}
