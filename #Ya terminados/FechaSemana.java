public class FechaSemana
{
	public static void error (String x)
	{
		System.out.println ("ERROR: " + x);
		System.exit(1);
	}
	public static void main(String[] args)
	{
		int date = Integer.parseInt(args[0]);
		int day = date / 1000000;
		int month = (date / 10000) % 100;
		int year = date % 10000;
		boolean correcte=true;
		boolean bisiesto=false;
		String day_w = "";
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) bisiesto = true;
		if ((day < 1) || (day > 31)) correcte= false;
		if ((month < 1) || (month > 12)) correcte= false;
		if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 30)) correcte = false;
		if (month == 2 && (bisiesto==true && (day > 29)) && (bisiesto == false && (day > 28))) correcte = false;
		if (correcte == true) 
		{
			int a = (14 - month) / 12;
			int m = month + 12 * a - 2;
			int y = year - a;
			int d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
			if (d == 1) day_w = "Monday";
			if (d == 2) day_w = "Tuesday";
			if (d == 3) day_w = "Wednesday";
			if (d == 4) day_w = "Thursday";
			if (d == 5) day_w = "Friday";
			if (d == 6) day_w = "Saturday";
			if (d == 7) day_w = "Sunday";
			System.out.println(day_w + " " + day + " of " + month + ", " + year);
		}
		else
		{
			error("Se ha introducido una fecha incorrecta");
		}

	}
}