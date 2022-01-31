package variables;

public class Main {
	//main Ctrl+space
	public static void main(String[] args) {
		
		String nombre = "Carlos";
		
		//Se coloca final para que se comporte como constante ya que no existe const
		final int nacimiento = 1999;
		//final int edad = 22;
		int edad = 22;
		
		float estatura = 1.92f;
		//double estatura = 1.92;
		
		char simbolo = 'a';
		
		//sysout Ctrl+space
		System.out.println("Hola " + nombre + " ,tienes " + edad + " años y mides " + estatura + " y naciste en " + nacimiento);
		
	}

}
