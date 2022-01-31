import java.util.Scanner;

public class PracticaSwitch {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Elige una opcion: ");
		String enter = s.nextLine();
		
		switch(enter){
			case "1":
				System.out.println("Elegiste opcion uno");
				break;
			
			case "2":
				System.out.println("Elegiste opcion dos");
				break;
			
			default:
				System.out.println("No elegiste una opcion valida");
				break;
		}
		
	}
}
