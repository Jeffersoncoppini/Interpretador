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
	Express exp = new Express();
	Impressao imp = new Impressao();
	Leitura le = new Leitura();
	public Interpretador(){
		//ArrayList< String >  codigo = new ArrayList< String >(); 
	}	
    
    public void interpreta(String linhas[]) {
		double r_val;		
		int ind_var = 0;
        for(int i = 0; i < linhas.length && linhas[i] != null; i++) { //percorre o vetor das linhas de codigo
			int c=0;
			if(linhas[i].trim().isEmpty())
				continue;
			String linha = linhas[i].substring(0,(linhas[i].indexOf('.') != -1)? linhas[i].indexOf(';') : linhas[i].length()).trim();
			linha.replace(" ","");
			String[] words = linha.split("[\\+\\-*/@#\\<>=!\\$?&|_\\%, ]+");
			String[] tokens = linha.split("[0-9a-z ]+");
			if(tokens.length > 0 && tokens.length == words.length+1 &&  tokens[0].equals("_"))	{
				words = linha.split("[\\+\\-*/@#\\<>=!\\$?&|_\\%, ]+");
				tokens = linha.split("[0-9a-z ]+");
			}
			if(tokens.length == 1 && tokens[0].equals("#"))	{ //verifica se tem apenas um token e se ele é #
				if(words.length >= 1){					      //verifica se words for maior que 1 tem alguma palavra
					vars [ind_var] = new Variavel(words[0]); //instancia uma variavel passando um parametro para o atributo nome
					ind_var++;                                   //incrementa o indice de variaveis
				}	
			}
			
			if(tokens.length == 1 && tokens[0].equals(":")) { //verifica se token for igual a : que significa atribuição
				for(c=0;vars.length > c;c++) { //percorre o vetor de objetor variavel
					if(vars[c].getNome().equals(linha.substring(0,linha.indexOf(":")-1))) { //criar getNome na classe Variavel que retorna o nome
						vars[c].setValor(Double.parseDouble(linha.substring(linha.indexOf(":")+1,linha.indexOf(";")-1))); //criar setValor
                    }				
				}					
			}
			if(tokens.length == 2 && tokens[0].equals(":")){
				for(c=0;vars.length > c;c++){
					if(vars[c].getNome().equals(linha.substring(0,linha.indexOf(":")-1))) {						
						vars[c].setValor(exp.resolveExpressao(tokens[1],Double.parseDouble(linha.substring(linha.indexOf(":")+1,linha.indexOf(tokens[1]))),Double.parseDouble(linha.substring(linha.indexOf(tokens[1])+1,linha.length()-1))));
											
					}
				}
					
			}
			
			if(tokens.length==2 && tokens[0].equals("!") && tokens[1].equals("?")){ // impressao
				imp.impress(linhas[i].replace("(?i)(!|?|;)",""));
			}
			if(tokens.length==2 && tokens[0].equals(":") && tokens[1].equals("$")){//leitura
				for(i=0;vars.length > i;i++){
					if(vars[i].getNome().equals(linha.substring(0,linha.indexOf(":")-1))) {
						vars[i].setValor(le.ler());
					}
				}
			}
				
				
			
			/*if (linhas[i] == null){
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
			//}*/           
            
        }
    }
	
	/*public void imprime() {		
                
        for(int i = 0; i < linhas.length; i++) { //percorre o vetor das linhas de codigo
			System.out.printf("%d\n", linhas[i]);
			for(int c = 0; c < codigo.size(); c++) {
				System.out.printf("%d\n", codigo.get[c]);				
			} 
		}
	}*/
	
}
	

