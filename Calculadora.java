 package projectossimples;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		
		Operacoes op=new Operacoes();
		
		Scanner ler=new Scanner(System.in);
		boolean desligar=false;
		
		while(!desligar) {
			double a=0;
			double b=0;
			int escolha=0;
			
			double result = 0;
			boolean sucesso=false; //varible that indicates whether the iput is valid

				boolean entry =false;
		while(!entry)	{
			try {
				System.out.println("Insirir  primeiro valor");
				 a=ler.nextDouble();
				  
				 entry=true;
			}catch(InputMismatchException e) {
				System.err.println("Erro!Insira um numero"+ e.getMessage());
				ler.nextLine();
				}
			}
		
		 entry=false;
		while(!entry)	{
			try {
				System.out.println("Insirir  segundo numero valor");
				  b=ler.nextDouble();
				   
				entry=true;
			}catch(InputMismatchException e) {
				System.err.println("Erro!Insira um numero"+ e.getMessage());
				ler.nextLine();
				}
			}
				
				System.out.println("1-Soma");
				System.out.println("2-Subtracao");
				System.out.println("3-Multiplicacao");
				System.out.println("4-DIvisao");

				
				  entry=false;
				  
				while(!entry)	{
					try {
						System.out.println("Insirir a opcao");
						  escolha=ler.nextInt();
						  
						entry=true;
					}catch(InputMismatchException e) {
						System.err.println("Erro!Insira um numero"+ e.getMessage());
						ler.nextLine();
						}
					}
				

				switch (escolha) {
		
		case 1: result=op.soma(a, b); 
				sucesso=true;
				break;
		
		case 2:  
		 		result=op.subtracao(a, b);
		 		sucesso=true;
				break;
				
		case 3:  result=op.multiplicao(a, b);
				sucesso=true;
				break;
				
		case 4: 
					 
			 if(Double.isNaN(op.divisao(a, b))) { 	
				 
			 System.out.println("Erro!Denominador nao pode ser 0");
					
			 	}else {
						
			 		result=op.divisao(a, b);
			 		sucesso=true;
					}

			 	break;
		 default:System.out.println("Opcao invalida");

		}

			if(sucesso) {
				System.out.println("Resultado: "+result);
			}
		 ler.nextLine();
	      System.out.println("Digite off para disligar ou qualaquer coisa para continuar");
	      String deslig=ler.nextLine();
	      
	      
	      if(deslig.equalsIgnoreCase("off")) {  	 
	    	  desligar=true;
	    	  System.out.println("Maquina desligada com sucesso");
	      			}
		
			}
		
	  
		}
	
}
