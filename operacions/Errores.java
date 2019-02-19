public class Errores
{
	private String[] errores = {"numero de argumentos invalidos"};
	private String mensaje;
	public Errores(int codigo)
	{
		mensaje = "ERROR #"+codigo+": "+errores[codigo];
	}
	public void error()
	{
		System.out.println(mensaje);
		System.exit(0);
	}

	public void alerta()
	{
		System.out.println(mensaje);
	}
}