package Conversor_Monedas;

public class Soles {
	
	public static float soles (float dinero) {
		
		float pesos = (float) (dinero * 4.73);
		float quetzales = (float) (dinero * 2.16);
		float dolares = (float) (dinero * .28);
		
		System.out.println(pesos + " pesos");
		System.out.println(quetzales + " quetzales");
		System.out.println(dolares + " dolares");
		
	return 0;
	
	}

}
