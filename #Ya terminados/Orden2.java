public class Orden2
{
	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}
	public static void main(String[] args)
	{
		if (args.length != 2) error("Two numbers expected");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (a > b) System.out.println(a + " " + b);
		if (a < b) System.out.println(b + " " + a);
	}
}