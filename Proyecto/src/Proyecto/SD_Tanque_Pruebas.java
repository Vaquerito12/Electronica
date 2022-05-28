package Proyecto;

import java.util.Scanner;

public class SD_Tanque_Pruebas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String datos[] = new String [4];
		String datoscom[] = new String [4];
		
		System.out.println("Nivel Alto: ");
		datos[0] = teclado.nextLine();
		datoscom[0] = datos[0].replace(" ","");

		System.out.println("Nivel bajo: ");
		datos[1] = teclado.nextLine();
		datoscom[1] = datos[1].replace(" ","");		
		
		System.out.println("Temperatura : ");
		datos[2] = teclado.nextLine();
		datoscom[2] = datos[2].replace(" ","");
		
		System.out.println("High Level: ");
		datos[3] = teclado.nextLine();
		datoscom[3] = datos[3].replace(" ","");
		
		for(int i=0;i<=3;i++)
		{
			int correcto = 0;
			do
			if(datoscom[i].equals("0") || datoscom[i].equals("1"))	
			{
				correcto=1;
			}
			else
			{
				switch(i)
				{
					case 0:
						System.out.println("Se detecto un error en la variable \"Nivel Alto\" por favor introduzca un valor correcto: ");
						datos[0] = teclado.nextLine();
						datoscom[0] = datos[0].replace(" ","");
						do
						{
							if(datoscom[i].equals("0") || datoscom[i].equals("1"))
							{
								correcto=1;
							}
							else
							{
								System.out.println("Intente nuevamente");
								datos[i] = teclado.nextLine();
								datoscom[i] = datos[i].replace(" ","");
							}
						}
						while(correcto!=1);
						break;
					case 1:
						System.out.println("Se detecto un error en la variable \"Nivel Bajo\" por favor introduzca un valor correcto: ");
						datos[1] = teclado.nextLine();
						datoscom[1] = datos[1].replace(" ","");
						do
						{
							if(datoscom[i].equals("0") || datoscom[i].equals("1"))
							{
								correcto=1;
							}
							else
							{
								System.out.println("Intente nuevamente");
								datos[i] = teclado.nextLine();
								datoscom[i] = datos[i].replace(" ","");
							}
						}
						while(correcto!=1);
						break;
					case 2:
						System.out.println("Se detecto un error en la variable \"Temperatura\" por favor introduzca un valor correcto: ");
						datos[2] = teclado.nextLine();
						datoscom[2] = datos[2].replace(" ","");
						do
						{
							if(datoscom[i].equals("0") || datoscom[i].equals("1"))
							{
								correcto=1;
							}
							else
							{
								System.out.println("Intente nuevamente");
								datos[i] = teclado.nextLine();
								datoscom[i] = datos[i].replace(" ","");
							}
						}
						while(correcto!=1);
						break;
					case 3:
						System.out.println("Se detecto un error en la variable \"High Level\" por favor introduzca un valor correcto:");
						datos[i] = teclado.nextLine();
						datoscom[i] = datos[i].replace(" ","");
						do
						{
							if(datoscom[i].equals("0") || datoscom[i].equals("1"))
							{
								correcto=1;
							}
							else
							{
								System.out.println("Intente nuevamente");
								datos[i] = teclado.nextLine();
								datoscom[i] = datos[i].replace(" ","");
							}
						}
						while(correcto!=1);
						break;
					default:
						break;
				}
			}
			while(correcto!=1);
		}
		String lhll = datoscom[0] + datoscom[1] + datoscom[2] + datoscom[3];
		System.out.println(lhll);
		
		System.out.println("Estatus del tanque:");
		
		switch(lhll) 
		{
			case "0000":
				System.out.println("El tanque esta vacio en proceso de llenado con temperatura optima");
				break;
			case "0001":
				System.out.println("El tanque esta vacio en proceso de llenado con calefaccion encendida");
				break;
			case "0010":
				System.out.println("El tanque esta vacio en proceso de llenado, la temperatura es elevada inicia refrigeracion");
				break;
			case "0011":
				System.out.println("Error de sensor");
				break;
			case "0100":
				System.out.println("El tanque no esta lleno, en proceso de vaciado y rellenado con temperatura optima");
				break;
			case "0101":
				System.out.println("El tanque no esta lleno, en proceso de vaciado y rellenado con calefaccion encendida");
				break;
			case "0110":
				System.out.println("El tanque no esta lleno, en proceso de vaciado y rellenado, la temperatura es elevada inicia refrigeracion");
				break;
			case "0111":
				System.out.println("Error de sensor");
				break;
			case "1000":
				System.out.println("Error de Sensor");
				break;
			case "1001":
				System.out.println("Error de Sensor");
				break;
			case "1010":
				System.out.println("Error de Sensor");
				break;
			case "1011":
				System.out.println("Error de Sensor");
				break;
			case "1100":
				System.out.println("El tanque esta lleno, inicia vaciado con temperatura optima");
				break;
			case "1101":
				System.out.println("El tanque esta lleno, inicia vaciado con calefaccion encendida");
				break;
			case "1110":
				System.out.println("El tanque esta lleno, inicia vaciado la temperatura es elevada inicia refrigeracion");
				break;
			case "1111":
				System.out.println("Error de sensor");
				break;
			default:
				System.out.println("Error de sensor");
				break;
		}
	}
}