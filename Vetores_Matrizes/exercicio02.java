package exercicioAula04;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		// Variaveis
		int[] dado = new int[10];
		int soma = 0, maior = 0, media = 0, cont = 0;
		
		for(int j = 0; j < 10; j++) {
			System.out.println("Digite o " + (j+1) + "º valor: ");
			dado[j] = input.nextInt();
			soma = soma + dado[j];
			media = soma / 10;
			if(dado[j] > maior) {
				maior = dado[j];
			}
		}
		
		for(int i = 0; i < dado.length; i++) {
			if(dado[i] == maior) {
				cont++;
			}
		}
		
		System.out.print("Os valores lidos foram ");
		for(int i = 0; i < 10; i++) {
			if(i == 9) {
				System.out.print(dado[i] + ".");
			}
			else {
				System.out.print(dado[i] + ", ");
			}
		}
		
		
		System.out.println("\nA média dos valores lidos é " + media);
		if(cont == 1) {
			System.out.println(maior + " foi o maior número lido e apareceu " + cont + " vez.");
		}
		else {
			System.out.println(maior + " foi o maior número lido e apareceu " + cont + " vezes.");			
		}
		
		input.close();

	}

}
