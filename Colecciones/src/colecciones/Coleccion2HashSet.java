package colecciones;

import java.util.HashSet;

public class Coleccion2HashSet {

	public static void main(String[] args) {
		HashSet <String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Fiat");
		System.out.println(cars);
		
		System.out.println(cars.contains("Volvo"));
		
		cars.remove("Volvo");
		System.out.println(cars);
		
		System.out.println(cars.size());
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		cars.clear();
		System.out.println(cars);
		
	}

}
