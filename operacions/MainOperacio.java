public class MainOperacio
{
	public static void main(String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);

		Errores er1 = new Errores(0);

		if (args.length != 2) er1.error();
		
		Operacions op1 = new Operacions(a, b);

		System.out.println(op1.suma());
		System.out.println(op1.resta());
		System.out.println(op1.div());
		System.out.println(op1.mult());
	}
}