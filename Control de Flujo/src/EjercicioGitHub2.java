import java.util.Scanner;

public class EjercicioGitHub2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner i = new Scanner(System.in);
		
		System.out.println("Cual es tu edad?");
		double edad = s.nextDouble();
		double ticket = 7;
		
		if(edad<5 && edad>0) {
			ticket = ticket * 0.40;
			System.out.println("El precio del ticket sera " + ticket);
		}else if(edad>=60 && edad<=150) {
			ticket = ticket * 0.45;
			System.out.println("El precio del ticket sera " + ticket);
		}else if(edad>=5 && edad<60) {
			System.out.println("Cuantos boletos compraras?");
			int boletos = i.nextInt();
			
			if(boletos>=2) {
				ticket = ticket * 0.70;
				System.out.println("El precio del ticket por persona sera " + ticket);
			}else if(boletos>2 && boletos>0) {
				System.out.println("El precio del ticket sera " + ticket);
			}else {
				System.out.println("Ingresa un numero correcto de tickets");
			}
		}else {
			System.out.println("Ingresa un valor correcto");
		}
		
		
		
		
	}
}
