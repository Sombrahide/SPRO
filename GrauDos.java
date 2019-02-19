public class GrauDos
{
	public static void main(String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double d = b*b - 4 * a * c;
		double e, x, y;

		if (d >= 0)
		{
			/*Podem calcular*/
			if (a != 0)
			{
				d = Math.sqrt(d);
				e = a + a;
				x = (-b + Math.sqrt(d)) / e;
				y = (-b - Math.sqrt(d)) / e;
				System.out.println(x);
				System.out.println(y);
			}
			else
			{
				System.out.println("No es tracta de segon grau");
				if (b != 0)
				{
					System.out.println("Solucion: " + -c / b);
				}
				else
				{
					if (c == 0)
					{
						System.out.println("Equacio trivial");
					}
					else
					{
						System.out.println("Equacio incongruent");
					}
				}
			}
		}
		else
		{
			e = a + a;
			x = -b / e;
			y = Math.sqrt(-d) / e;
			System.out.println(x + "+" + y + "i");
			System.out.println(x + "-" + y + "i");
		}
	}
}