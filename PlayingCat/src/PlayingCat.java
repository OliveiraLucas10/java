
public class PlayingCat
{

	public static boolean isCatPlaying(boolean summer, int temperature)
	{

		boolean isCatPlaying = false;

		if (summer)
		{
			isCatPlaying = (temperature >= 25 && temperature <= 45);
		}
		else
		{
			isCatPlaying = (temperature >= 25 && temperature <= 35);
		}

		return isCatPlaying;
	}

}
