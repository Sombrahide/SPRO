public class Primo
{
	public static void main (String[] args)
	{
		/*Primera version*/
		/*
		int n = Integer.parseInt(args[0]);
		int i, contador = 0;

		for (i = 2; i < n; i = i + 1)
		{
			if (n % i == 0) {
				contador = contador + 1;
			}
		}
		System.out.println((contador == 0) ? n + " es primo" : n + " no es primo");
		*/
		
		/*Segunda version*/
		/*int j = Integer.parseInt(args[0]);
		int i;

		for (i = 2; i < j; i = i + 1)
		{
			if (n % i == 0) {
				System.out.println(j + " no es primo");
				i= i + j;
			}
		}
		if (i == j) System.out.println(j + " es primo");*/

		/*Tercera version*/
		int n,i,j;

		for (n = 2; n < 1000000 ; n++ ) 
		{
			j = (int) Math.sqrt(n);
			for (i = 2; (i <= j) && (n % i != 0); i = i + 1);
			if (i == j + 1) System.out.println(n);	
		}

	}
}