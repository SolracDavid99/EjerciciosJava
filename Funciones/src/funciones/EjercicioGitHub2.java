package funciones;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import java.lang.Math;
//https://github.com/generation-org/JAVA/tree/master/Functions

public class EjercicioGitHub2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double x,y;
		
		int opc;		
		do {
			//Menu
			System.out.println("1.-Sum");
			System.out.println("2.-Rest");
			System.out.println("3.-Multiplication");
			System.out.println("4.-Division");
			System.out.println("5.-Square Root");
			System.out.println("6.-Power Of");
			System.out.println("7.-Exit");
			
			opc = s.nextInt();
			
			switch(opc) {
			
			case 1:
				
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				
				System.out.println("Sum of " + x + " + " + y + " = " + sum(x,y));
			break;
			case 2:
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				System.out.println("Rest of " + x + " - " + y + " = " + rest(x,y));
			break;
			case 3:
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				System.out.println("Multiplication of " + x + " * " + y + " = " + multi(x,y));
			break;
			case 4:
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				System.out.println("Division of " + x + " / " + y + " = " + div(x,y));
			break;
			case 5: //Square Root
				System.out.println("First Value : ");
				x = s.nextDouble();
				System.out.println("Square root is " + sqrt(x));
				
			break;
			
			case 6: //Power Of
				System.out.println("First Value : ");
				x = s.nextDouble();
				System.out.println("Second Value : ");
				y = s.nextDouble();
				System.out.println("The result is " + Math.pow(x, y));
				  
				
			break;
			
			case 7: //Exit
			break;
				
			default:
				System.out.println("Enter a valide option");
			break;
			}
			
		}while(opc!=7);
		
	}
	
	static double sum(double a, double b) {
		return (a+b);
	}
	static double rest(double a, double b) {
		return (a-b);
	}
	static double multi(double a, double b) {
		return (a*b);
	}
	static double div(double a, double b) {
		return (a/b);
	}

}
