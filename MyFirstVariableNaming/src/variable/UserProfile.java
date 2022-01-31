package variable;
import java.util.Scanner;

public class UserProfile {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Scanner i= new Scanner(System.in);
		
		System.out.println("Please enter your name ");
		String name = s.nextLine(); 
		
		System.out.println("Please enter your age ");
		int age= i.nextInt(); 

		System.out.println("Please enter your gender ");
		String gender = s.nextLine();
		
		System.out.println("Please enter your job preference ");
		String job = s.nextLine();
		
		System.out.println("Please enter your nationality ");
		String nat = s.nextLine();
		
		System.out.println("Please enter your blood type ");
		String blood = s.nextLine();
		
		int year = 2022-age;
		
		//String name = console.readLine();
		System.out.println("\nName: "+ name + "\nAge:" + age +"\nGender:" + gender + "\nJob Preference:" + job + "\nNationality: " + nat + "\nBlood Type: " + blood + "\n\n Your birth year was: " + (year-1) + "-" + year);
	}

}
