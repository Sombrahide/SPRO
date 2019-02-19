public class ContieneCinco
{
	public static void main(String[] args)
	{
		/*
		int i, cifra = Integer.parseInt(args[0]);
		boolean tiene = false;
		
		for (i = cifra; i > 0; i= i / 10) 
		{
			int ultimo = i % 10;
			if (ultimo == 5 && tiene == false)
			{
				System.out.println(cifra + " tiene un cinco");
				tiene=true;
			}

		}
		*/
		if (tiene == false)
		{
			System.out.println(cifra + " no tiene un cinco");
		}

		int n = Integer.parseInt(args[0]);
		int m = n;
		while ((n % 10 != 5) && (n > 0)) n = n / 10;
		System.out.println(m + ((n == 0) ? " no tiene 5" : " si tiene 5"));
	}
}