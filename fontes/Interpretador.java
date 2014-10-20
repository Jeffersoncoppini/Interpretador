/**
 * Classe interpretador.
 *
 * Esse código não faz qualquer interpretação, ele apenas lê o conteúdo de um arquivo que foi
 * passado pela linha de comando.
 *
 * Por Edson Giachini, Cleiton Piccini e Jefferson Coppini. 
 */

class Interpretador {
	
	Variavel vars[] = new Variavel [100];
	Express exp = new Express();
	Impressao imp = new Impressao();
	Leitura le = new Leitura();

	public Interpretador(){
		
		 
	}	
    
    public void interpreta(String linhas[]) {
		
		double r_val;		
		int ind_var = 0;
		
        for(int i = 0; i < linhas.length && linhas[i] != null; i++) { //percorre o vetor das linhas de codigo
			
			if(linhas[i].trim().isEmpty())
				continue;
				
			String linha = linhas[i].substring(0,(linhas[i].indexOf('.') != -1)? linhas[i].indexOf(';') : linhas[i].length()).trim();
			linha.replace(" ","");
			String[] words = null;
			words = linha.split("[\\+\\-*/@#\\<>=!\\$?&|_\\%,;:null ]+");
			String[] tokens = linha.split("[0-9 a-z A-Z null]+");

			if(tokens.length > 0 && tokens.length == words.length+1 &&  tokens[0].equals("_"))	{
				
				words = linha.split("[\\+\\-/*@#\\<>=!\\$?&|_\\%,;: ]+");
				tokens = linha.split("[0-9a-zA-Z ]+");
			}
				
			if (tokens[0].equals("#")) { //verifica se tem apenas um token e se ele é #
				
				if (words.length >= 1) { //verifica se words for maior que 1 tem alguma palavra
											      
					vars [i] = new Variavel (words[1]); //instancia uma variavel passando um parametro para o atributo nome.
					continue;
				}	
			}
			
			if (tokens[1].equals(":") && tokens[2].equals(";")) { //verifica se token for igual a : que significa atribuição e ; que significa fim de linha.
					
					
				for ( int k=0; vars.length > k ;k++) { // percorre o vetor de objeto variavel 
					
					if(vars[k].getNome().equals(words[0])) { // Se algum objeto variavel for igual a o conteudo da "words".
						int flag = 0;
							
						if (words.length >= 2) {
								
							for ( int c=0; k >= c; c++) { // Percorre o vetor de variaveis para verificar se words é igual uma variavel ja existente.
									
								if (vars[c].getNome().equals (words[1])) {
										
									flag = 1;
									vars[k].setValor(vars[c].getValor());
									break;
										
								}
									
							}
								
							if (flag == 0) {								 
								vars[k].setValor(Double.parseDouble(words[1])); // Transforma String em Double.
								break;
							}
										
						}		
					break;
					}
				}				
				break;
			}
		}
	}
}
                									
			
