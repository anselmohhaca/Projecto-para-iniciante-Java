package projectossimples;

public class Operacoes {
	
	private  double val1;
	private double val2;
	
	
	public double soma(double val1,double val2) {
		return val1+val2;
		
	}
	
	public double subtracao(double val1,double val2) {
		return val1-val2;
	}
	
	public double multiplicao(double val1,double val2) {
		return val1*val2;
	}
	
	public void  divisao(double val1,double val2) {
		if (val2!=0) {
			System.out.println(val1/val2);
		}else {
			System.out.println("Erro");
		}
		
	}

}
