public class Matricula
{
	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}
	public static String generarmatricula()
	{
		char[] array = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
		String matricula = "";
		for (int i = 0; i < 7; i++) 
		{

		}
	}
	public static void main (String[] args)
	{
		String matricula = "1234BCD";
		String numeros = "0123456789";
		String letras = "BCDFGHJKLMNPRSTVWXYZ";
		int i, p, valor = 0;
		if (matricula.length() != 7) error("Wrong plate number");
		matricula = matricula.toUpperCase();
		for (i = 0; i < 4; i++)
		{
			p = numeros.indexOf(matricula.charAt(i));
			
		}
	}
}