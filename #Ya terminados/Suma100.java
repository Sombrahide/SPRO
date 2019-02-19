public class Suma100
{
	public static void main(String[] args)
	{
		int l1 = args[0].length();
		int l2 = args[1].length();
		max = l1;
		if (l2 > max) max = l2;
		max++;
		int[] s1 = new int[max];
		int[] s2 = new int[max];
		int[] s3 = new int[max];
		for (i = 0; i < max; i++)
		{
			s1[i] = 0;
			s2[i] = 0;
		}
		for (i = 0; i < l1; i++) s1[max - i - 1] = args[0].charAt(l1 - i - 1) - '0';
		for (i = 0; i < l2; i++) s2[max - i - 1] = args[0].charAt(l2 - i - 1) - '0';
		acarreo = 0;
		for (i = 0; i < max ; i++) 
		{
			j = max - i - 1;
			s3[j] = s1[j] + s2[j] + acarreo;
			if (s3[j] >= 10) 
			{
				s3[j] -= 10;
				acarreo = 1;		
			}	
			else
			{
				acarreo = 0;
			}
		}
		for (i = 0; i < max; i++) System.out.print(s1[i]); System.out.println();
		for (i = 0; i < max; i++) System.out.print(s2[i]); System.out.println();
		for (i = 0; i < max; i++) System.out.print(s3[i]); System.out.println();
	}
}