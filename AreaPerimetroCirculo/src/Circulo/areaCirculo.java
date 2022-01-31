package Circulo;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

		System.out.println ("Ingresa el diametro");
		int diam= s.nextInt();
		
		double perimetro = (2*3.1416*(diam/2)) ; 
		double area = (3.1416*((diam/2)*(diam/2)));

		System.out.println("El area del circulo es: " + area + "\nEl perimetro es: " + perimetro);

	}

}