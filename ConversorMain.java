package Conversor_Monedas;

import java.util.Scanner;

public class ConversorMain {
	
	public static void main (String [] args) {
		
		System.out.println(" *********  MENU  *********");
		System.out.println(" * - INGRESA UNA OPCION - *");
		System.out.println(" * 1. Convertir Dolaress  *");
		System.out.println(" * 2. Convertir Pesos     *");
		System.out.println(" * 3. Convertir Quetzales *");
		System.out.println(" * 4. Convertir Soles     *");
		System.out.println(" **************************");
		
		Scanner ent = new Scanner(System.in);
		int opcion = ent.nextInt();
		
		System.out.println("INGRESA LA CANTIDAD MONETARIA");
		int dinero = ent.nextInt();
		
		int op = opcion;
		
		switch (op) {
		
		case 1:
			Dolares.dolares(dinero);
			break;
		
		case 2:
			Pesos.pesos(dinero);
			break;
			
		case 3:
			Quetzales.quetzales(dinero);
			break;
		
		case 4:
			Soles.soles(dinero);
			break;
			
		default:
			System.out.println("INGRESA OTRO VALOR");
			break;
		}
						
		ent.close();
		
	}

}
