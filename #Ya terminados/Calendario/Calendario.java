import java.text.*;
import java.util.*;

 

public class Calendario {

 

    public static void main(String[] args) {
        System.out.println("<hmtl>");
        System.out.println("<head>");
        System.out.println("<title>Calendario</title>");
        System.out.println("<style>");
        System.out.println("* {margin:0px; padding: 0px; font-weight: bold;}");
        System.out.println("table {width:200px; float:left; margin:5px; border-collapse: collapse;}");
        System.out.println("div {width: 650px; margin: auto; text-align:center;}");
        System.out.println("td {width: 20px; height:20px; text-align:center; background:rgba(150, 150, 150, 0.4); color: white;}");
        System.out.println(".dom{color:red;}");
        for (int i=1; i <= 12; i++)
        {
            System.out.println("#month"+ i +"{background-image: url(\"recursos/cat"+i+".jpg\");}");
        }
        System.out.println("</style>");
        System.out.println("</head>");
        System.out.println("<body>");
        printCalendar(1999);
        System.out.println("</body>");
        System.out.println("</html>");
    }

 

    static void printCalendar(int year) {

        int nCols = 1;
        if (nCols < 1 || nCols > 12)

            throw new IllegalArgumentException("Numero de columnas incorrecto!!");

 

        Calendar date = new GregorianCalendar(year, 0, 1);

 

        int nRows = (int) Math.ceil(12.0 / nCols);

        int offs = date.get(Calendar.DAY_OF_WEEK) - 2;

        int w = nCols * 24;

 

        String[] monthNames = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

 

        String[][] mons = new String[12][8];

        for (int m = 0; m < 12; m++) {

            String name = "<td colspan=\"7\">" + monthNames[m] + "</td>";

            int len = 11 + name.length() / 2;


            mons[m][0] = name;

            mons[m][1] = " \n<td>Lu</td> \n<td>Ma</td> \n<td>Mi</td> \n<td>Ju</td> \n<td>Vi</td> \n<td>Sa</td> \n<td class=\"dom\">Do</td>";

            int dim = date.getActualMaximum(Calendar.DAY_OF_MONTH);

 

            for (int d = 1; d < 43; d++) {
                String entry;
                boolean isDay = d > offs && d <= offs + dim;
                if ((d % 7) == 0)
                {
                    entry = isDay ? ("\n<td class=\"dom\">" + (d - offs) + "</td>") : "\n<td class=\"dom\">   </td>";
                }
                else entry = isDay ? ("\n<td>" + (d - offs) + "</td>") : "\n<td>   </td>";

                if (d % 7 == 1)

                    mons[m][2 + (d - 1) / 7] = entry;

                else

                    mons[m][2 + (d - 1) / 7] += entry;

            }

            offs = (offs + dim) % 7;

            date.add(Calendar.MONTH, 1);

        }

 

        System.out.println("<div><h1>[[ Calendario ]]</h1></div>");

        System.out.println("<div><h2>" + year + "</h2></div>");

 
        System.out.println("<div>");
        for (int r = 0; r < nRows; r++) {
            System.out.println("<table id=month" + (r+1) + ">");
            

            for (int i = 0; i < 8; i++) {
                System.out.println("<tr>");
                for (int c = r * nCols; c < (r + 1) * nCols && c < 12; c++)

                    System.out.print(mons[c][i]);

                System.out.println("</tr>");
           
            }
            System.out.println("</table>");
            System.out.println();

        }
        System.out.println("</div>");

    }

}