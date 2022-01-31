import java.util.Scanner;

public class EjercicioGithub {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("What is your score?");
		double score = s.nextDouble();
		
		if(score<0 || score>10) {
			System.out.println("Valor fuera del rango 0-10");
		}else if(score>=0 && score <=3) {
			System.out.println("Failed");
		}else if(score>3 && score<=5) {
			System.out.println("Insufficient");
		}else if(score>5 && score<10) {
			System.out.println("Good");
		}else if(score == 10) {
			System.out.println("Excellent");
		}

	}

}
