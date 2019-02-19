import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class Horario2
{
	static File archivohtml;
	static PrintWriter pw;
	final static int MODULS = 5;
	static String[] horariClase = {"0313", "223242", "523202", "41022112", "530132"};
	static String[][] moduls = {
		/*{"Nombre", "abreviacion", "color de fondo", "color de letra"}*/
		/*0*/{"Base de dades", "spbdd", "#d98880", "#954440"},
		/*1*/{"Sistemes informatics", "spsin", "#1abc9c", "#067858"},
		/*2*/{"Entorns de desenvolupament", "spede", "#DAF7A6", "#A6B362"},
		/*3*/{"Programacio", "sppro", "#2980b9", "#054075"},
		/*4*/{"Formacion i orientacio laboral", "spfol", "#af7ac5", "#6B3681"},
		/*5*/{"Llenguatge de marques i sistemes gestio", "splmg", "#FFC300", "#BB8000"}
	};
	static String[] dias = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"};
	static String[] hores = {
		"HORARI",
		"15:20<br/>16:10",
		"16:10<br/>17:00",
		"17:20<br/>18:10",
		"18:10<br/>19:00",
		"19:20<br/>20:10",
		"20:10<br/>21:00"
	};
	public static void css()
	{
		pw.println("<style>");
		pw.println("*{margin:0px; padding:0px;text-align: center; background-color: black;}");
		pw.println("div{display:flex; flex-direction: column; border-collapse: collapse; flex-wrap: nowrap; justify-content: center; border:1px solid grey; box-sizing: border-box; background-color: lightgrey;}");
		pw.println(".columna, .columnah{height: 350px; width: 240px;}");
		pw.println(".columnah{width: 100px;}");
		pw.println(".horas, .hora1{height: 50px;}");
		pw.println(".hora2{height: 100px;}");
		pw.println(".hora3{height: 150px;}");
		pw.println("#contenedor{display: flex;flex-direction: row; width: 1300px; margin:auto; margin-top:30px;}");
		for (int i = 0; i < moduls.length ; i++ ) 
		{
			pw.println("."+moduls[i][1]+"{background-color:"+moduls[i][2]+"; color:"+moduls[i][3]+";}");
		}
		pw.println("</style>");
	}
	public static void calendario()
	{
		int i, j;
		pw.println("<div id=\"contenedor\">");
		pw.println("<div class=\"columnah\">");
		for (i = 0; i < hores.length ;i++ ) 
		{
			pw.println("<div class=\"horas\">"+ hores[i] +"</div>");	
		}
		pw.println("</div>");
		for (i = 0; i < horariClase.length; i++) 
		{
			pw.println("<div class=\"columna\">");
			pw.println("<div class=\"horas\">" + dias[i] + "</div>");
			for (j = 0; j < horariClase[i].length(); j = j + 2 ) 
			{
				int materia = Integer.parseInt(horariClase[i].substring(j, j+1));
				int hora = Integer.parseInt(horariClase[i].substring(j+1, j+2));
				pw.println("<div class=\"hora" + hora + " "+moduls[materia][1]+"\">" + moduls[materia][0] + "</div>");
			};
			pw.println("</div>");
		};
		pw.println("</div>");
	}
	public static void html()
	{
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Horario</title>");
		css();
		pw.println("</head>");
		pw.println("<body>");
		calendario();
		pw.println("</body>");
		pw.println("</html>");
	}
	public static void main(String[] args)
	{
		try
		{
			archivohtml = new File ("Horari.html");
			pw = new PrintWriter(archivohtml);
			html();
			pw.close();
		}
		catch (FileNotFoundException e)
		{
            e.printStackTrace();
		}
	}
}