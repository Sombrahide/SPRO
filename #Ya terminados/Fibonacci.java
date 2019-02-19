public class Fibonacci
{
	public static void main(String[] args)
	{
		int i, mida = 10;
		int[] n1 = new int[mida];
		n1[0] = 0;
		System.out.print(n1[0] + "-");
		n1[1] = 1;
		System.out.print(n1[1] + "-");
		for (i = 2; i < mida; i++) 
		{
			n1[i] = n1[i - 2] + n1[i - 1];
			if (i == (mida - 1)) System.out.print(n1[i]);
			else System.out.print(n1[i] + "-");
		}

		
	}
}