public class Test
{
	public static void main(String[] args)
	{
		Errores e1 = new Errores();
		Errores e2 = new Errores("Gatete");
		Errores e3 = new Errores(1);

		e1.alerta();
		e2.alerta();
		e3.alerta();
	}
}