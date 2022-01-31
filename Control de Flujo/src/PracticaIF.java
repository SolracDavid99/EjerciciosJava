
import java.util.Scanner;
public class PracticaIF {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("What is your age?");
		double age = s.nextDouble();
		/*
		if (age>=18 && age<=150) {
			System.out.println("You're an adult ");
			}
			else if(age<18 && age>0){
			System.out.println("You're underage");	
			} else{
			System.out.println("The age that you input is not in the correct range");
			}*/

			System.out.println( (age>=18 && age<=150) ? ("You're an adult "): (age<18 && age>0)?("You're underage"):("Value out of range"));


	}

}
