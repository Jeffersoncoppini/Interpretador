class Variavel{
	
	private string nome, tipo, 
	private double valor;
	
	public void setVar(String nome, double valor)	{
		Variavel var = new Variavel();
		int i = 0,k;
		k = getIndiceVar(nome);
		if(k >= 0)	
			setValorVar(nome,valor);
		else	{
			var.nome = nome;
			var.valor = valor;
			for(; vars[i] != null; i++)	{
			}
			vars[i] = nova;
		}
	}
	
	public int getIndiceVar(String nome)	{
		for(int i = 0; vars[i] != null; i++)	{
			if(vars[i].nome.equals(nome))
				return i;
		}
		return -1;
	}

	public void getNome() {
		return this.nome;
	}

	public void getTipo() {
		return this.tipo;
	}

	public void getValor() {
		return this.valor;
	}

	public string setNome(String n){
		this.nome = n;
	}
	
	public string setTipo(t) {
		this.tipo = t;
	}
	
	private double setValor(double v) {
		this.valor = v;
	}	
}