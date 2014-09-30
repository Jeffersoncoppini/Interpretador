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
		int c = 0;
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
			if(tokens.length == 1 || tokens[0].equals("_"))	{
				if((words.length > 1) && (vars[])	
					Variavel[v]var  
				continue; 
			}
			if (linhas[i] == null) 
				i = linhas.length;
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