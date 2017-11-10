import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicio00 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:/ficherosjava/numeros.txt");
		Scanner scan = new Scanner(f);
		
		String linea = scan.nextLine();
		
		String[] numeros_string = linea.split(" ");
		
		for(int i = 0; i < numeros_string.length; i++){
			if(es_multiplo_de_tres(Integer.parseInt(numeros_string[i]))){
				System.out.println(numeros_string[i]);
			}
		}
	}
	
	static boolean es_multiplo_de_tres(int num){
		if(num %3 == 0){
			return true;
		}else{
			return false;
		}
	}
}
