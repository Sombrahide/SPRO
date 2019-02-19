public class Mult8
{
	static final int base = 10000;
	static final int logbase = 4;

	public static void main(String[] args)
	{
		String s1 = args[0];
		int l1 = s1.length();
		String s2 = args[1];
		int l2 = s2.length();

		int a1 = l1 / logbase;
		if (l1 % logbase != 0) a1 = a1 + 1;
		int a2 = l2 / logbase;
		if (l2 % logbase != 0) a2 = a2 + 1;

		int[] b1 = new int[a1];
		int[] b2 = new int[a2];
		int[] b3 = new int[1 + a2];
		int[] b4 = new int[a1 + a2];

		int p = 0, q, acarreo;
		while (s1.length() >= logbase)
		{
			b1[p] = Integer.parseInt(s1.substring(s1.length() - logbase, s1.length()));
			s1 = s1.substring(0, s1.length() - logbase);
			p = p + 1;
		}
		if (s1.length() != 0) b1[p] = Integer.parseInt(s1);
		p = 0;
		while (s2.length() >= logbase)
		{
			b2[p] = Integer.parseInt(s2.substring(s2.length() - logbase, s2.length()));
			s2 = s2.substring(0, s2.length() - logbase);
			p = p + 1;
		}
		if (s2.length() != 0) b2[p] = Integer.parseInt(s2);

		for (p = 0; p < a1 + a2; p++) b4[p] = 0;

		for (p = 0; p < a1; p++)
		{
			acarreo = 0;
			for (q = 0; q < a2; q++)
			{
				b3[q] = b1[p] * b2[q] + acarreo;
				acarreo = b3[q] / base;
				b3[q] = b3[q] % base;
			}
			b3[a2] = acarreo;
			acarreo = 0;
			for (q = 0; q < a2 + 1; q++)
			{
				b4[p + q] = b4[p + q] + b3[q] + acarreo;
				acarreo = b4[p + q] / base;
				b4[p + q] = b4[p + q] % base;
			}
		}
		for (p = a1 + a2 - 1; p >= 0; p--) System.out.format("%04d", b4[p]);
		System.out.println();
	}
}