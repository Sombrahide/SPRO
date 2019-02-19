public class Orden3
{
	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}
	public static void main (String[] args)
	{
		if (args.length != 3) error("Three numbers were expected");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int t;
		if (a < b)
		{
			t = a;
			a = b;
			b = t;
		}
		if (a < c)
		{
			t = a;
			a = c;
			c = t;
		}
		if (b < c)
		{
			t = b;
			b = c;
			c = t;
		}
		System.out.println(a + " " + b + " " + c);
	}
}