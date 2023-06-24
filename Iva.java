package CalculadoraPrecio;

public class Iva {
	
	public static float iva(float preciototal) {
		
		float precioiva = (float)(preciototal * 1.16);
		System.out.println("El Precio Total + IVA es: " + precioiva);
		
		return precioiva;
	}

}
