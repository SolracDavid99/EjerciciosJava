package colecciones;
import java.util.HashMap;

public class Coleccion2 {
	
	public static void main(String[] args) {
		//Create a HashMap object called capitalCities
		HashMap<String,String>  capitalCities = new HashMap<String,String>();
		
		//Add keys and values (Country,City)
		capitalCities.put("England","London");
		capitalCities.put("Germany","Berlin");
		capitalCities.put("Norway","Oslo");
		capitalCities.put("USA","Washington DC");
		
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.get("England"));
		
		capitalCities.remove("England");
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.size());
		
		for(String i:capitalCities.keySet()) {
			System.out.println(i);
		}
		
		for (String i : capitalCities.values()) { 		System.out.println(i); 
		}

		for (String i : capitalCities.keySet()) {  		System.out.println("key: " + i + " value: " + 		capitalCities.get(i));
		}

		capitalCities.clear();
		System.out.println(capitalCities);
		
	}
}
