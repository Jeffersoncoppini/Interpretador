//Resolve expressões

class Express{
	private double resultado;
			
		public double resolveExpressao(String token, double valor1,double valor2){
			
			switch(token){
				case "+":
					resultado=valor1+valor2;
					break;
				case "-":
					resultado=valor1-valor2;
					break;
				case "/":
					resultado=valor1/valor2;
					break;
				case "*":
					resultado=valor1*valor2;
					break;
				case "%":
					resultado=(int)valor1%(int)valor2;
					break;
			}

			return resultado;
		}
}
			
		
