public class SumaHastaUno
{
	public static void main(String[] args)
	{
		int cifra = Integer.parseInt(args[0]);
		
		while (cifra > 9)
		{
			cifra=(cifra % 10) + (cifra / 10);
		}
		System.out.println(cifra);
	}
}