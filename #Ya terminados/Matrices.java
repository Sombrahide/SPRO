public class Matrices
{
	static int[][] magic;

	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}

	static void style()
	{
		System.out.println("<style>");
		System.out.println("td{color: white; font-size:20pt; background-color: lightgrey; border: 1px solid black; text-align: center; margin: auto; width:50px; height:50px;}");
		System.out.println(".par{background-color: red;}");
		System.out.println(".impar{background-color: blue;}");
		System.out.println("</style>");
	}
	static void head()
	{
		System.out.println("<head>");
		System.out.println("<meta charset=\"UTF-8\"/>");
		style();
		System.out.println("</head>");
	}
	static void interiortabla(int n)
	{
		int i, j;
		for (i = 0; i < n; i++)
		{
			System.out.println("<tr>");
			for (j = 0; j < n; j++)
				if (((i + j) % 2) == 0)
					System.out.println("<td class=\"par\">" + magic[i][j] + "</td>");
				else
					System.out.println("<td class=\"impar\">" + magic[i][j] + "</td>");
			System.out.println("</tr>");
		}
	}
	static void body(int n)
	{
		System.out.println("<body>");
		System.out.println("<table>");
		interiortabla(n);
		System.out.println("</table>");
		System.out.println("</body>");

	}
	static void html(int n)
	{
		System.out.println("<!doctype html>");
		System.out.println("<html>");
		head();
		body(n);
		System.out.println("</html>");
	}
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		if (n % 2 == 0)
		{
			error("el argumento no debe ser par");
		}
		magic = new int [n] [n];
		int i, j, k, m;

		m = n * n;
		i = 0;
		j = (n - 1) >> 1;

		for (k = 0; k < m; k++)
		{
			if (k % n == 0)
				i = (i - 1 + n) % n;
			else
			{
				i = (i + 1) % n;
				j = (j + 1) % n;
			}
			magic[i][j] = k + 1;
		}

		html(n);
		
		

	}
}