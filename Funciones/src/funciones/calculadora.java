package funciones;
import java.util.Scanner;

public class calculadora {
	
	static double suma(double a,double b) {
		return a+b;
	}
	
	static double resta(double a,double b) {
		return a-b;
	}
	
	static double multiplicacion(double a,double b) {
		return a*b;
	}
	
	static double division(double a,double b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Cual es tu primer valor?");
		double s1 = console.nextDouble();
		System.out.println("Cual es tu segundo valor?");
		double s2 = console.nextDouble();
		
		System.out.println(suma(s1,s2));
		System.out.println(resta(s1,s2));
		System.out.println(multiplicacion(s1,s2));
		System.out.println(division(s1,s2));
	}

}
