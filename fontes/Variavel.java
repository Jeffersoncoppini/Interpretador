import java.io.IOException;
class Variavel{
	
	private String nome;
	private double valor;
	
	public Variavel(String n){
		this.nome = n;
		this.valor = 0;
	}	
	
	public double getValor(){
		return this.valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setValor(double v){
		this.valor= v;
	}
}
	
