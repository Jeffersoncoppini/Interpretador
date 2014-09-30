import java.io.IOException;
class Variavel{
	
	private String nome;
	private double valor;
	
	public Variavel(String n){
		this.nome = n;
		this.valor = 0;
	}	
	
	public double VaiValor(double leitura){
		this.valor=leitura;
		return this.valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setValor(double v){
		this.valor= v;
	}
}
	
