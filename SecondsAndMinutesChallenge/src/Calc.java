public class Calc
{

	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static String getDurationString(int minutes, int seconds)
	{
		if (minutes < 0 || seconds < 0 || seconds > 59)
		{
			return INVALID_VALUE_MESSAGE;

		}

		int hours = minutes / 60;
		minutes = minutes % 60;

		String hoursString = hours < 10 ? "0" + hours + "h " : hours + "h ";
		String minutesString = minutes < 10 ? "0" + minutes + "m " : minutes + "m ";
		String secondsString = seconds < 10 ? "0" + seconds + "s" : seconds + "s";

		return hoursString + minutesString + secondsString;
	}

	public static String getDurationString(int seconds)
	{
		if (seconds < 0)
		{
			return INVALID_VALUE_MESSAGE;
		}

		int minutes = seconds / 60;
		seconds = seconds % 60;

		return getDurationString(minutes, seconds);

	}

}
