package CalculadoraPrecio;

import java.util.Scanner;

public class MainCalculadora {
	
	public static void main (String [] args) {
	
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del producto 1 ");
		Float prod1 = ent.nextFloat();
		
		System.out.println("Ingrese el precio del producto 2 ");
		Float prod2 = ent.nextFloat();
		
		System.out.println("Ingrese el precio del producto 3 ");
		Float prod3 = ent.nextFloat();
		
		float preciototal = prod1 + prod2 + prod3;
		
		float precioiva = Iva.iva(preciototal);
		
		Descuento.descuento(precioiva);
		
		ent.close();
	}
}
