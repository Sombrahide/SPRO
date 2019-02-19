public class Errores
{
	private String mensaje;
	private String[] mensajes = {"mensaje uno", "mensaje dos"};

	public Errores()
	{
		this.mensaje = "Default";
	}

	public Errores(String mensaje)
	{
		this.mensaje = mensaje;
	}

	public Errores(int codigo)
	{
		if (codigo < 0 || codigo > 1)
		{
			this.mensaje = "Codigo invalido";
			this.error();
		}
		this.mensaje = this.mensajes[codigo];
	}

	public void error()
	{
		System.out.println(this.mensaje);
		System.exit(0);
	}

	public void alerta()
	{
		System.out.println(this.mensaje);
	}
}