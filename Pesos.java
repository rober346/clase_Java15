package Conversor_Monedas;

public class Pesos {
	
	public static float pesos (float dinero) {
		
		float dolares = (float) (dinero * .058);
		float quetzales = (float) (dinero * .46);
		float soles = (float) (dinero * .21);
		
		System.out.println(dolares + " dolares");
		System.out.println(quetzales + " quetzales");
		System.out.println(soles + " soles");
		
	return 0;
	
	}

}
