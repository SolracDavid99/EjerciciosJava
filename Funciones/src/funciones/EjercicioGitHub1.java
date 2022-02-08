package funciones;
import java.util.Scanner;
//https://github.com/generation-org/JAVA/tree/master/Functions
public class EjercicioGitHub1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		String name = console.nextLine();
		System.out.println("Cual es tu apellido?");
		String lastName = console.nextLine();
		printNameLength(name);
		printNameCharacters(name);
		printFullName(name,lastName);
	}

	private static void printNameLength( String name )
    {
      int length = name.length();
      System.out.println("La longitud de la cadena es " + length);
    }

    private static void printNameCharacters( String name )
    {	
    	System.out.println("Los caracteres del nombre son:");
		for(int i=0 ; i<name.length() ; i++) {
			System.out.println( name.charAt(i));
		}
    }
    
    private static void printFullName( String name , String lastName )
    {	
    	System.out.println(name + " " + lastName);
    }
	
}
