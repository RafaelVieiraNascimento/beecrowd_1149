package program;

/*
beecrowd | 1149 - Somando Inteiros Consecutivos

Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma
de A + i para cada i com os valores (0 <= i <= N-1). Enquanto N for negativo ou ZERO,
um novo N(apenas N) deve ser lido.

Entrada
A entrada contém somente valores inteiros, podendo ser positivos ou negativos.
Todos os valores estão na mesma linha.

Saída
A saída contém apenas um valor inteiro.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        int N;
        int soma = 0;
        int A = sc.nextInt();
        while ((N = sc.nextInt()) <= 0);
        for (int i = 1; i <= N; i++) {
        	soma += A;
        	A++;
        }
        System.out.println(soma);
		sc.close();
	}
}
