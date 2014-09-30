import java.io.IOException;
class Variavel{
	
	private String nome;
	private double valor;
	
	public Variavel(String n){
		this.nome = n;
		this.valor = 0;
	}

	public String RecebeLeitura(String leitura){
		this.v=leitura;
		return this.v;
		
	}	
	public double VaiValor(double leitura){
		this.valor=leitura;
		return this.valor;
	}
}
	
