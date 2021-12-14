package exercicioAula04;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
	
		
		Scanner read = new Scanner(System.in);
		
		double[] pontos = new double[5];
		double maiorPonto = 0.0;
		
		for(int cont = 0; cont < pontos.length; cont++){
			
			System.out.println("Digite um valor: ");
			pontos[cont] = read.nextDouble();
			
			if(pontos[cont] > maiorPonto){
				
				maiorPonto = pontos[cont];
			}
		}
		System.out.println("Maior valor: " + maiorPonto);
		read.close();

	}

}
