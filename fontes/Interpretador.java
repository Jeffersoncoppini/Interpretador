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
<<<<<<< HEAD
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
=======
			String[] words = linha.split("[\\+\\-*/@\\;#\\<>=!\\$?&|_\\%, ]+");
			//String[] words = linha.split("(?<=[!+-*/@;#<>=!$?&|_%,])");
			String[] tokens = linha.split("[0-9a-zA-Z ]+");
			if(tokens.length > 0 && tokens.length == words.length+1 &&  tokens[0].equals("_"))	{
				words = linha.split("[\\+\\-*/@\\;\\#\\<>=!\\$?&|_\\%, ]+");
				//words = linha.split("(?<=[!+-*/@;#<>=!$?&|_%,])");
				tokens = linha.split("[0-9a-zA-Z ]+");
			}
			
			if(tokens[0].equals("#"))	{ //verifica se tem apenas um token e se ele é #
				if(words.length >= 1){
					vars=new Variavel[100];					      //verifica se words for maior que 1 tem alguma palavra
					vars [ind_var] = new Variavel(words[0]); //instancia uma variavel passando um parametro para o atributo nome
					System.out.println(vars[ind_var].getNome());
					ind_var++;                                   //incrementa o indice de variaveis
				}	
			}
			
			if(tokens.length == 1 && tokens[0].equals(":")) { //verifica se token for igual a : que significa atribuição
				for(c=0;vars.length > c;c++) { //percorre o vetor de objetor variavel
					if(vars[c].getNome().equals(words[1])) { //criar getNome na classe Variavel que retorna o nome
						vars[c].setValor(Double.parseDouble(words[2])); //criar setValor
						System.out.println(vars[c].getValor());
                    }				
				}					
			}
			if(tokens.length == 2 && tokens[0].equals(":")){
				for(c=0;vars.length > c;c++){
					if(vars[c].getNome().equals(words[1])) {						
						vars[c].setValor(exp.resolveExpressao(tokens[1],Double.parseDouble(words[2]),Double.parseDouble(words[3])));
											
					}
				}
>>>>>>> b9cd94aec6fcef21cd1706fc1a697a8c41816882
					
					
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
<<<<<<< HEAD
		}
	}
=======
			
			if(tokens.length==2 && tokens[0].equals("!") && tokens[1].equals("?;")){ // impressao
				imp.impress(linhas[i].replace("!","").replace("?","").replace(";",""));
			}
			if(tokens[0].equals("$")){//leitura
				for(c=0;ind_var > c;c++){
					System.out.println(words[0]);
					if(vars[c].getNome().equals(words[0])) {
						System.out.println(le.ler());
						vars[c].setValor(le.ler());
						System.out.println(vars[c].getValor());
						break;
					}
				}			
			}
			
			//for(c=0;vars.length > c;c++){
			//	System.out.println(vars[c].getValor());
			//}	
				
			
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
	
>>>>>>> b9cd94aec6fcef21cd1706fc1a697a8c41816882
}
                									
			
