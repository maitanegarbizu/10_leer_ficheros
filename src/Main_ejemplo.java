import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/*
 * leer fichero y sacarlo por pantalla
 */

public class Main_ejemplo {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D:/Programacion/mifichero.txt");
		Scanner scan = new Scanner(fichero);
		while(scan.hasNextLine()){
			String linea = scan.nextLine();
			System.out.println(linea);
		}

	}

}
// 