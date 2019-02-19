public class Operators
{
	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}
	public static double suma(double x, double y)
	{
		return x + y;
	}
	public static void main (String[] args)
	{
		double x, y, a;

		if (args.length != 2) error("Debes introducir dos cifras");
		x = Double.parseDouble(args[0]);
		y = Double.parseDouble(args[1]);
		a = suma(x, y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
	}
}