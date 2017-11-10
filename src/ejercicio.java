import java.io.File;
import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		
		File f = new File("D:/Programacion/deportistas.txt");
		Scanner s = new Scanner(f);
		
		int num_lineas = contarLineas(s);
		String[][] matriz = new String[num_lineas][2];
		
		s = new Scanner(f);
		
		int i = 0;
		while(s.hasNextLine()){
			String linea = s.nextLine();
			matriz[i] = linea.split(" ");
			i++;
			
		}
		
		
		static int contarLineas(File f){
			Scanner s = new Scanner(f);
			int num_lineas = 0;
			while()
		}
	}

	

}
