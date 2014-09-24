import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner;

public class Leitor { 
	public static void main(String[] args) {
		Interpretador codigo;
		codigo = new Interpretador();
		String linha [] = new String[3000]; // arquivo pode ter, no máximo, 3000 linhas.
		Scanner ler = new Scanner(System.in); 
		System.out.printf("Informe o caminho do arquivo texto:\n"); 
		String nome = ler.nextLine(); 
		System.out.printf("\nConteúdo do arquivo texto:\n"); 
		try { 
			FileReader arq = new FileReader(nome); 
			BufferedReader lerArq = new BufferedReader(arq);
			linha [i=0] = lerArq.readLine(); // lê as linhas do arquivo
			while (linha != null;i++) {
				linha [i] = lerArq.readLine(); // lê as linhas do arquivo					
			}
			codigo.interpreta(linhas[]);
			arq.close();
		} catch (IOException e) { 
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		} System.out.println(); 
	} 
}