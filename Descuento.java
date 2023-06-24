package CalculadoraPrecio;

public class Descuento {
	
	public static float descuento (float precioiva) {
		
		if (precioiva <= 50) {
			float preciodesc = (float) (precioiva * .95); 
			System.out.println("5% de descuento por compra menor a $50, Total: " + preciodesc);
			return preciodesc;
			
		}else {
			float preciodesc = (float) (precioiva * .90); 
			System.out.println("10% de descuento por compra mayor a $50, Total: " + preciodesc);
			return preciodesc;					
		}
	
	}

}
