import java.util.Scanner;
class Leitura{
	Scanner s;
	double retorno;
	
	public double ler(){
		s= new Scanner(System.in);
		retorno=s.nextDouble();
		return retorno;
	}
}
	
	
