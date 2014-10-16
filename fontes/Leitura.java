import java.util.Scanner;
class Leitura{
	public double retorno;
	
	public double ler(){
		Scanner s= new Scanner(System.in);
		retorno=Double.parseDouble(s.nextLine());
		return retorno;
	}
}

	
	
