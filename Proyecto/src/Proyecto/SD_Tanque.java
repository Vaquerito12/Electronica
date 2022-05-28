package Proyecto;

import java.util.Scanner;

public class SD_Tanque {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String datos[] = new String [4];
		
		System.out.println("Nivel Alto: ");
		datos[0] = teclado.nextLine();
		
		System.out.println("Nivel bajo: ");
		datos[1] = teclado.nextLine();
		
		System.out.println("Temperatura : ");
		datos[2] = teclado.nextLine();
		
		System.out.println("High Level: ");
		datos[3] = teclado.nextLine();
		
		String lhll = datos[0] + datos[1];
		System.out.println(lhll);
		String thtl = datos[2] + datos[3];
		System.out.println(thtl);		
		String resultado = " ";
		
		switch(lhll) {		
		case "00":
			resultado = "Tanque vacio, llenar tanque,";
			switch(thtl) {
			case "00":
				resultado+= " la temperatura es optima.";
				break;
			case "01":
				resultado+= " encender calefacción.";
				break;
			case "10":
				resultado+= " encender Alarma.";
				break;
			case "11":
				resultado= "ERROR DE SENSOR";
			}
			break;		
		case "01":
			resultado= "No está lleno, llenar tanque,";
			switch(thtl) {
			case "00":
				resultado+= " vaciar, la temperatura es optima.";
				break;
			case "01":
				resultado+= " encender calefacción.";
				break;
			case "10":
				resultado+= " activar Alarma.";
				break;
			case "11":
				resultado= "ERROR DE SENSOR";
			}
			break;		
		case "10":
			resultado= "ERROR DE SENSOR";
			break;		
		case "11":
			resultado= "Tanque lleno,";
			switch(thtl) {
			case "00":
				resultado+= " vaciar, la temperatura es optima.";
				break;
			case "01":
				resultado+= " encender calefacción.";
				break;
			case "10":
				resultado+= "encender Alarma.";
				break;
			case "11":
				resultado= "ERROR DE SENSOR";
			}
			break;
		}	
		System.out.println(resultado);	
	}
}