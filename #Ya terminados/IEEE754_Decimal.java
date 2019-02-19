public class IEEE754_Decimal
{
	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}
	public static long decimal (long binario)
	{
		long solo, decimal;
		for (i=0; i < binario.length; i++)
		{
			solo = binario % (10^(i+1));
			decimal = (solo*(2^i)) + decimal;
			System.out.println((2^i) + ", ");
		}
		return decimal;
	}
	public static void main(String[] args)
	{
		long ie, s, e, n, decimal;
		if (args.length != 1) error("Introduce todo el binario en un solo argumento");
		ie = Longer.parseLong(args[0]);
		if (ie.length != 32) error("El IEEE754 es de 32 bits");
		s = ie / 10000000000000000000000000000000;
		e = decimal((ie / 100000000000000000000000) % 100000000);
		n = e - 127;
		decimal = decimal((ie % 100000000000000000000000) * (10 ^ n));
		if (s == 1) System.out.println("= -" + decimal);
		else System.out.println("= " + decimal);

	}
}