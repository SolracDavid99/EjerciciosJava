import java.util.Scanner;

public class EjercicioGithub2 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("What is your height?(mt)");
		double height = s.nextDouble();
		
		System.out.println("What is your weight?(Kg)");
		double weight = s.nextDouble();
		
		double bmi = weight/Math.pow(height, 2);
		
		System.out.println("Your BMI is " + bmi);
		
		if(bmi>=19 && bmi<25) {
			System.out.println("You're are Good");
		}else if(bmi>=25 && bmi<30) {
			System.out.println("You're Overweight");
		}else if(bmi>=30 && bmi<=39) {
			System.out.println("You're Obese");
		}else if(bmi<19 || bmi >39) {
			System.out.println("Your BMI is out of the charts , consult a doctor!");
		}
	}
}
