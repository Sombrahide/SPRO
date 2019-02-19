public class ParImpar
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		System.out.println((x % 2 == 0) ? "El numero es par" : "El numero es impar");
	}
}