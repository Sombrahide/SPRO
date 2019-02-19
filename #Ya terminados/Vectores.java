public class Vectores
{
	static int[] valores = new int[10]
	public static int aleatorio(int inferior, int superior)
	{
		int res = ((int) (Math.random() * superior - inferior + 1) + inferior);
		return res;
	}
	public static void init( int inferior, int superior)
	{
		int i;
		for (i = 0; i < valores.length; i++) valores[i] = aleatorio(inferior, superior);
	}
	public static void mostrar()
	{
		int i, j, t;
		for (i = 0; i < valores.length; i++) System.out.println(valores[i]);
	}
	public static void ordenar()
	{
		int i, j, t, k;
		for (i = 0; i < valores.length; i++)
		{
			k = i;
			for (j = i + 1; j < valores.length; j++)
			{
				if (valores[j] < valores[k]) k = j;
			}
			if (k != i) {
				t = valores[i];
				valores[i] = valores[k];
				valores[k] = t;
			}

		}


	}
	public static void main(String[] args)
	{
		init(33, 44);
		mostrar();
		System.out.println("-----------");
		ordenar();
		mostrar();
	}
}