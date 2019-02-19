public class Operacions
{
	private double a, b;

	public Operacions(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public double suma()
	{
		return a + b;
	}

	public double resta()
	{
		return a - b;	
	}

	public double div()
	{
		if ( b == 0) 
		{
			System.out.println("Divisor 0, cambie el divisor");
			System.exit(0);
		}
		return a / b;
	}

	public double mult()
	{
		return a * b;
	}
}