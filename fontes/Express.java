//Resolve expressões

class Express{
	
		double resultado;
	
	public double ResolveSoma( double valora, double valorb){
		this.resultado=valora+valorb;
		return this.resultado;
	}
	public double ResolveSub( double valora, double valorb){
		this.resultado=valora-valorb;
		return this.resultado;
	}
	public double ResolveMult( double valora, double valorb){
		this.resultado=valora*valorb;
		return this.resultado;
	}
	public double ResolveDiv( double valora, double valorb){
		this.resultado=valora/valorb;
		return this.resultado;
	}
	public double ResolveMod( double valora, double valorb){
		this.resultado=(int)valora%(int)valorb;
		return this.resultado;
	}
}
