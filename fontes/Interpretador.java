/**
 * Classe interpretador.
 *
 * Esse código não faz qualquer interpretação, ele apenas lê o conteúdo de um arquivo que foi
 * passado pela linha de comando.
 *
 * Por Edson Giachini 
 */

class Interpretador {
    private String linhas[];
	private String codigo[][];
	
	public Interpretador(){
		String linhas [] = new String[3000];
		String codigo [][] = new String[3000][300]; 
	}	
    
    public void interpreta(String l[]) {		
        this.linhas = l;
        
        for(int i = 0; i < linhas[].length(); i++) { //percorre o vetor das linhas de codigo
            if(linhas[i] != null) {
				//linhas[i].trim();
				String indicador = linhas[i].substring(0, linhas[i].indexOf(' '));
				for (int j = 0; j < linhas[].legth(); i++ {  //percorre as colunas do vetor
				    String codigo[i][j] = linhas[i].substring(linha.indexOf(' ') + 1, linha.IndexOf(' ')); //adiciona as palavras na posição da matriz
					while (codigo[i][j] == ' '){ //ignora espaços em branco mas precisa validar ainda
						String codigo[i][j] = linhas[i].substring(linha.indexOf(' ') + 1, linha.IndexOf(' ')); 
					}
				}
                System.out.println("Linha " + (i + 1) + ": " + this.linhas[i]);
            }
        }
    }
	
}