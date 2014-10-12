//Resolve expressões

class Express{
	
		double resultado;
		double valor1;
		double valor2;
		String token;
	
		public void setValor1(double v1){
			this.valor1=v1;
		}
		public void setValor2(double v2){
			this.valor1=v2;
		}
		public void setToken(String tk){
			this.token=tk;
		}
		public double getValor1(){
			return this.valor1;
		}
		public double getValor2(){
			return this.valor2;
		}
		public String getToken(){
			return this.token;
		}
		public double resolveExpressao(){
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
			
		
