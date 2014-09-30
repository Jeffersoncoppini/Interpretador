////package org.interpretador_iluminum;

/**
 * Classe interpretador.
 *
 * Esse código não faz qualquer interpretação, ele apenas lê o conteúdo de um arquivo que foi
 * passado pela linha de comando.
 *
 * Por Edson Giachini 
 */

class Interpretador {
	Variavel vars[];	
	public Interpretador(){
		//ArrayList< String >  codigo = new ArrayList< String >(); 
	}	
    
    public void interpreta(String linhas[]) {		
		int ind_var = 0;
        for(int i = 0; i < linhas.length && linhas[i] != null; i++) { //percorre o vetor das linhas de codigo
			if(linhas[i].trim().isEmpty())
				continue;
			String linha = linhas[i].substring(0,(linhas[i].indexOf('.') != -1)? linhas[i].indexOf(';') : linhas[i].length()).trim();
			String[] words = linha.split("[\\+\\-*/@#\\<>=!\\$?&|_\\%, ]+");
			String[] tokens = linha.split("[0-9a-z ]+");
			if(tokens.length > 0 && tokens.length == words.length+1 &&  tokens[0].equals("_"))	{
				words = linha.split("[\\+\\-*/@#\\<>=!\\$?&|_\\%, ]+");
				tokens = linha.split("[0-9a-z ]+");
			}
			if(tokens.length == 1 && tokens[0].equals("#"))	{ //verifica se tem apenas um token e se ele é #
				if(words.length >= 1){					      //verifica se words for maior que 1 tem alguma palavra
					vars [ind_var] = new Variavel(words.substring(0,words.length-1)); //instancia uma variavel passando um parametro para o atributo nome
					ind_var++;                                   //incrementa o indice de variaveis
				}	
			}
			
			if(tokens.length == 1 && tokens[0].equals(":")) { //verifica se token for igual a : que significa atribuição
				for(i=0;vars.length > i;i++) { //percorre o vetor de objetor variavel
					if(vars[i].getNome().equals(linha.substring(0,linha.indexOf(':')-1))) { //criar getNome na classe Variavel que retorna o nome
						vars[i].setValor(Double.parseDouble(linha.substring(linha.indexOf(':')+1,linha.length-1))); //criar setValor
                    }				
				}					
			}
			if(tokens.length == 2 && tokens[0].equals(":")){//provisório, preciso criar um metodo para isso.	
				switch (tokens[1].charat(4)){
					case '+':
						for(i=0;vars.length > i;i++) {
							if(vars[i].getNome().equals(linha.substring(0,linha.indexOf(':')-1))) {
								vars[i].ResolveSoma(Double.parseDouble(linha.substring(linha.indexOf(':')+1,linha.substring(linha.indexOf('+')-1)),Double.parseDouble(linha.substring(linha.indexOf('+')+1,linha.length-1))));
								break;
							}
						}
					case '-':
						for(i=0;vars.length > i;i++) {
							if(vars[i].getNome().equals(linha.substring(0,linha.indexOf(':')-1))) {
								vars[i].ResolveSub(Double.parseDouble(linha.substring(linha.indexOf(':')+1,linha.substring(linha.indexOf('-')-1)),Double.parseDouble(linha.substring(linha.indexOf('-')+1,linha.length-1))));
							}
						}
					
						break;
					case '/':
						for(i=0;vars.length > i;i++) {
							if(vars[i].getNome().equals(linha.substring(0,linha.indexOf(':')-1))) {
								vars[i].ResolveDiv(Double.parseDouble(linha.substring(linha.indexOf(':')+1,linha.substring(linha.indexOf('/')-1)),Double.parseDouble(linha.substring(linha.indexOf('/')+1,linha.length-1))));
							}
						}
						break;
					case '*':
						for(i=0;vars.length > i;i++) {
							if(vars[i].getNome().equals(linha.substring(0,linha.indexOf(':')-1))) {
								vars[i].ResolveMult(Double.parseDouble(linha.substring(linha.indexOf(':')+1,linha.substring(linha.indexOf('*')-1)),Double.parseDouble(linha.substring(linha.indexOf('*')+1,linha.length-1))));
							}
						}
						break;
					case '%':
						for(i=0;vars.length > i;i++) {
							if(vars[i].getNome().equals(linha.substring(0,linha.indexOf(':')-1))) {
								vars[i].ResolveMod(Double.parseDouble(linha.substring(linha.indexOf(':')+1,linha.substring(linha.indexOf('%')-1)),Double.parseDouble(linha.substring(linha.indexOf('%')+1,linha.length-1))));
							}
						}
							break;
					
					default:
						break;
				}
			if (linhas[i] == null){
				i = linhas.length;
			}
			else 
			{				
				codigo.add((linhas[i].substring((ind + 1), (ind=linhas[i].IndexOf(' ')))));
				c++;
			}	
			 
				
			
			imprime();
        	//int ind = linhas[i].indexOf(' ');
			//int c = 0;
			//while (l[i].indexOf('\n') != ind) {
			//	codigo[i][c] = {(l[i].substring((ind + 1), (ind=l[i].IndexOf(' '))))};
			//	c++;
			//}           
            
        }
    }
	
	public void imprime() {		
                
        for(int i = 0; i < linhas.length; i++) { //percorre o vetor das linhas de codigo
			System.out.printf("%d\n", linhas[i]);
			for(int c = 0; c < codigo.size(); c++) {
				System.out.printf("%d\n", codigo.get[c]);				
			} 
		}
	}
}
	

