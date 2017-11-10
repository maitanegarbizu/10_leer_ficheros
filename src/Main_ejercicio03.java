import java.util.Scanner;

public class Main_ejercicio03 {
/*
 * Menu con funciones
 * teniendo articulo.txt
 * 1- contar palabras
 * 2- contar cuantas veces aparece una palabra introducida por teclado
 * 3- contar cuantas veces aparece la vocal 'a'
 * 4- introducir un numero por teclado y que saque la suma del mismo con sus inferiores
 * 5- introducir un numero por teclado y sacar por pantalla los multiplos de 5 inferiores
 * 6- utilizad funciones para que el main quede mejor estructurado y simple
 */
	public static void main(String[] args) {
		
		final int SALIR = 0;
		final int CONTAR_PALABRAS = 1;
		final int CUANTAS_VECES_TECLADO = 2;
		final int VOCAL_A =3;
		final int SUMA_CON_SUS_INFERIORES = 4;
		final int MULTIPLO_5_INFERIORES = 5;
		final int MEJORA_MAIN = 6;
		
		Scanner scan = new Scanner(System.in);
		int option;
		
		
		do{
			System.out.println("-------MENU-------");
			System.out.println(CONTAR_PALABRAS + "Contar palabras");
			System.out.println(CUANTAS_VECES_TECLADO + "Cuantas veces aparece una palabra");
			System.out.println(VOCAL_A + "Cuantas veces aparece la letra A");
			System.out.println(SUMA_CON_SUS_INFERIORES + "Suma de de los numerosinferiores de un numero");
			System.out.println(MULTIPLO_5_INFERIORES + "Multiplos de 5 numerosinferiores de un numero");
			System.out.println(MEJORA_MAIN + "Funciones para que el main este mejor");
			
			//leer la opcion
			option = Integer.parseInt(scan.nextLine());
			
			
			switch(option){
			
			case CONTAR_PALABRAS:
				
				
				
			break;
			
			case CUANTAS_VECES_TECLADO:
				
				
				
			break;
			
			case VOCAL_A:
				
				
			break;
			
			case SUMA_CON_SUS_INFERIORES:
				
				
			break;
			
			case MULTIPLO_5_INFERIORES:
				
				
			break;
			
			case MEJORA_MAIN:
				
			break;
			
			case SALIR:
				default:
					System.out.println("Opcion mal");
			break;
			
			}
			
			
		}while (option != SALIR);
		
			
	}
}