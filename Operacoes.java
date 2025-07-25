package projectossimples;

public class Operacoes {
	
 
	
	
	public double soma(double val1,double val2) {
		return val1+val2;
		
	}
	
	public double subtracao(double val1,double val2) {
		return val1-val2;
	}
	
	public double multiplicao(double val1,double val2) {
		return val1*val2;
	}
	
	public double divisao(double val1,double val2) {
	 	if(val2!=0) {
	 		return val1/val2;
	 	}else {
	 		return Double.NaN;
	 	}
		
		
	}

} 
