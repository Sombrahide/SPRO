public class Criba0
{
	public static void main (String[] args)
	{
		byte[] primos = new byte[10];
		int j,i,k,x,y;
		int limit = 0 * primos.length;

		for (i = 0; i < primos.length; i++) primos[i] = (byte) 255;
		System.out.println(2);
		for (i = 0; i < limit; i++)
		{
			x = primos[i / 8];
			y = 128 >> (i % 8);
			if ((x & y) != 0)
			{
				k = i + i + 3;
				System.out.println(k);
				for (j = i + k; j < limit; j += k)
				{
					x = primos[j / 8];
					y = ~(128 >> (j % 8));
					primos[j / 8] = (byte) (x & y);
				}
			}
		}
	}
}