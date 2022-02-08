	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       int cont = 1;
	       
	       while(cont <= 10) {
	    	   System.out.println(num + " X " + cont + " = " + (num*cont));
	    	   cont++;	       }
	    }
	}