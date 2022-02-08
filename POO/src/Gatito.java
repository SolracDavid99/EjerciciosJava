//Esta clase sera nuestra plantilla.Nos ayudara a crear un monton de gatitos
public class Gatito { // Eta clase nos ayudara a darle caracteristicas generales a nuestros gatitos
	
	//Crear atributos
	private String nombre;
	private String color;
	private String raza;
	private int edad;
	
	public Gatito(String nom, String col, String raz, int ed) {
		this.nombre = nom;
		this.color = col;
		this.raza = raz;
		this.edad = ed;
	}
	
	public Gatito() {
		this.nombre = "";
		this.color = "";
		this.raza = "";
		this.edad = 0;
	}
	
	//Creacion de set y gets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	public static void main(String[] args) {
		Gatito gatito1 = new Gatito();
		
		gatito1.setNombre("Perejil");
		gatito1.setColor("Blanco");
		gatito1.setRaza("main");
		gatito1.setEdad(3);
		
		System.out.println("El nombre del gato 1 es " + gatito1.getNombre());
		System.out.println("El color del gato 1 es " + gatito1.getColor());
		System.out.println("La raza del gato 1 es " + gatito1.getRaza());
		System.out.println("La edad del gato 1 es " + gatito1.getEdad());
		gatito1.setColor("Esfinge");
	}
	
	
}
