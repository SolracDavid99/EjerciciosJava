package funciones;

public class Main {
	
	static void myMethod(String nombre,String apellido, int age) {
		System.out.println(nombre + " " + apellido + " Edad: " + age);
	}
	
	public static void main(String[] args) {
		myMethod("Carlos","Fregoso",22);
		myMethod("Jose","Fregoso",24);
	}
	
	
}
