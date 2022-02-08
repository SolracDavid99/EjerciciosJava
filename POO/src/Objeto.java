
public class Objeto {
	
 private String nombre;
 private String color;
 private String ojos;
 private String raza;
 private int edad;
 
 public static void main(String[] args) {
		Objeto gatito1 = new Objeto("Perejil", "Negro", "Cafes", "Esfingue", 3);
		Objeto gatito2 = new Objeto("Cilantro", "Blanco", "Verdes", "Main", 4);
		
		System.out.println(gatito1.getNombre());
		System.out.println(gatito2.getNombre());
		
		System.out.println("Mi gatito se llama " + gatito2.getNombre() + " es de color " + gatito2.getColor() + " tiene ojos color " + gatito2.getOjos() + " su raza es " + gatito2.getRaza() + " y su edad es de " + gatito2.getEdad());
	 }
 
 public Objeto(String nombre, String color, String ojos, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.ojos = ojos;
		this.raza = raza;
		this.edad = edad;
	}
 
 
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


public String getOjos() {
	return ojos;
}


public void setOjos(String ojos) {
	this.ojos = ojos;
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





 
}

