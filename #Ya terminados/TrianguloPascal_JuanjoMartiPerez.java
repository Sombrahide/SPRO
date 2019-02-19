public class TrianguloPascal_JuanjoMartiPerez
{
	//Se pide el numero de niveles que se quiere
	static int niveles;
	//Funcion para errores
	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}
	//El estilo del html
	static void style()
	{
		System.out.println("<style>");
		System.out.println("td{max-width: 50px;min-width: 50px;overflow:scroll; color: white; font-size:20pt; background-color: black; border: 1px solid black; text-align: center; margin: auto; width:50px; height:50px;}");
		System.out.println("table{background-color: grey;}");
		System.out.println(".contenedor{display:flex; flex-direction: column;  justify-content: center; align-items: center;}");
		System.out.println("</style>");
	}
	//El head del html
	static void head()
	{
		System.out.println("<head>");
		System.out.println("<meta charset=\"UTF-8\"/>");
		style();
		System.out.println("</head>");
	}
	//Aqui estara la operacion con las cuales se calculara la tabla
	static void interiortabla(int niveles)
	{
		//El bucle se seguira ejecutando hasta que se hayan impreso todos los niveles/filas
		//i = al numero actual de la fila
        for(int i = 0; i < niveles; i++) 
        {
        	System.out.print("<table><tr>");
        	//El principio de la fila siempre comienza con un 1
            int numero = 1;
            //El programa se seguira ejecutando hasta haber impreso un numero igual al nivel en el que nos encontramos
            //j = posicion del numero en la fila
            for(int j = 0; j <= i; j++) 
            {
            	//Se imprime el numero actual y se añade un espacio
                System.out.print("<td>" + numero + "</td>");
                //El nuevo numero es calculado con la siguiente formula
                numero = numero * (i - j) / (j + 1);
            }
            //Se añade una nueva fila y el for comienza de nuevo
            System.out.println("</tr></table>");
        }
	}
	//El body del html
	static void body(int niveles)
	{
		System.out.println("<body>");
		System.out.println("<div class=\"contenedor\">");
		interiortabla(niveles);
		System.out.println("</div>");
		System.out.println("</body>");

	}
	//El cuerpo del html perse
	static void html(int niveles)
	{
		System.out.println("<!doctype html>");
		System.out.println("<html>");
		head();
		body(niveles);
		System.out.println("</html>");
	}
	public static void main(String[] args)
	{
		int niveles = Integer.parseInt(args[0]);
		html(niveles);
	}
}