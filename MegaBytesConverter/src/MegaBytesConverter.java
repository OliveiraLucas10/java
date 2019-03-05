
public class MegaBytesConverter
{

	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{

		if (kiloBytes < 0)
		{
			System.out.println("Invalid Value");
		}

		else
		{
			int fatorMB = 1024;
			int mb = (int) Math.floor(kiloBytes / fatorMB);	
			int rKb = kiloBytes % fatorMB;
			System.out.println(kiloBytes + " KB = " + mb +" MB and " + rKb + " KB");
		}

	}

}
