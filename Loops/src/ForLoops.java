import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		String name = console.nextLine();
		
		for(int i=0 ; i<name.length() ; i++) {
			System.out.println( name.charAt(i));
		}
		
		
	}

}
