package Conversor_Monedas;

public class Dolares {
	
	public static float dolares (float dinero) {
		
		float pesos = (float) (dinero * 17.16);
		float quetzales = (float) (dinero * 7.84);
		float soles = (float) (dinero * 3.63);
		
		System.out.println(pesos + " pesos");
		System.out.println(quetzales + " quetzales");
		System.out.println(soles + " soles");
		
	return 0;
	
	}
}
