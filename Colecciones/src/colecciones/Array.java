package colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		
		//String[] arreglo = {"Hola","Humano"};
		//System.out.println(arreglo[0]);
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Fiat");
		
		//System.out.println(cars);
		
		//System.out.println(cars.get(0));
		
		//cars.set(1, "Ferrari");
		//System.out.println(cars);
		
		//cars.remove(2);
		//System.out.println(cars);
		
		//System.out.println(cars.size());
		
		//for(int i=0 ; i<cars.size() ; i++) {
			//System.out.println(cars.get(i));
		//}
		
		Collections.sort(cars);
		
		//For each structure 
		for(String i:cars) {
			System.out.println(i);
		}
	}

}
