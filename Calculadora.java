package projectossimples;

import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		
		Operacoes op=new Operacoes();
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Insirir  primeiro valor");
		double a=ler.nextDouble();
		
		System.out.println("Insirir  segundo valor");
		double b=ler.nextDouble();
		
		System.out.println("1-Soma");
		System.out.println("1-Subtracao");
		System.out.println("Multiplicacao");
		System.out.println("DIvisao");
		
		System.out.println("Insira o tipo de operacao ");
		int escolha =ler.nextInt();
		
		switch (escolha) {
		
		case 1: op.soma(a, b);
				break;
		case 2: op.subtracao(a, b);
				break;
		case 3: op.multiplicao(a, b);
				break;
		case 4: op.divisao(a, b);
		        break;
		 default :System.out.println("Operacao invalida");
		 break;

		}

	}

}
