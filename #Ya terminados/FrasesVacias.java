public class FrasesVacias
{
	public static void main(String[] args)
	{
		final String[] col1 = {"programacion", "estrategia", "movilidad", "planificacion", "dinamica", "flexibilidad", "implementacion", "instrumentacion", "retroaccion", "proyeccion"};
		final String[] col2 = {"funcional", "operacional", "dimensional", "transicional", "estructural", "global", "direccional", "opcional", "central", "logistica"};
		final String[] col3 = {"sistematica", "integrada", "equilibrada", "totalizada", "insumida", "balanceada", "coordinada", "combinada", "estabilizada", "paralela"};
		int n = Integer.parseInt(args[0]);
		System.out.print(col1[n / 100] + " " + col2[(n % 100) / 10] + " " + col3[n % 10]);

	}
}