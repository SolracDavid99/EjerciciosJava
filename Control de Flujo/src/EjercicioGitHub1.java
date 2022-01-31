import java.util.Scanner;

/*https://github.com/generation-org/JAVA/tree/master/Control%20Flow*/
public class EjercicioGitHub1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Cuanto fue tu venta?");
		double venta = s.nextDouble();
		double comision = 0;
		
		if(venta>=10000){
			comision = venta*0.30;
			System.out.println("Por la venta de " + venta + " tu comision es de " + comision);
		}else if(venta>=5000 && venta<=9999){
			comision = venta*0.20;
			System.out.println("Por la venta de " + venta + " tu comision es de " + comision);	
		}else if(venta>=1001 && venta<=4999) {
			comision = venta*0.10;
			System.out.println("Por la venta de " + venta + " tu comision es de " + comision);	
		}else if(venta<=1000 &&venta>0) {
			System.out.println("Por la venta de " + venta + " tu comision es de " + comision);	
		}else {
			System.out.println("El monto ingresado no es valido");
		}
		}

}
