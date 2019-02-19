public class Ejercicio1 {
	public static void main(String[] args){
		double a,b,c,d,e,x,y;

		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		d=b*b-4*a*c;

		if (d>=0) {
			if (a != 0) {
				e=a+a;
				x=(-b+Math.sqrt(d)) / e;
				y=(-b-Math.sqrt(d)) / e;

				System.out.println(x);
				System.out.println(y);
			}

			else{
				System.out.println("Error: Divisor por 0");
			}
		}
		else{
			Sistem.out.println("Error: Raiz negativa");
		}
	}
}
