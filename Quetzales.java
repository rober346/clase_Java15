package Conversor_Monedas;

public class Quetzales {
	
	public static float quetzales (float dinero) {
		
		float pesos = (float) (dinero * 2.19);
		float dolares = (float) (dinero * .13);
		float soles = (float) (dinero * .46);
		
		System.out.println(pesos + " pesos");
		System.out.println(dolares + " dolares");
		System.out.println(soles + " soles");
		
	return 0;
	}

}
