package org.generation.ejercicioFor;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un número:");
		int numero = scanner.nextInt();
		scanner.close();
		
		int primerNumero = 0;
		int segundoNumero = 1;
		int contador = 0;
		int resultado = 0;
		do {
			System.out.println(primerNumero);
			resultado = primerNumero + segundoNumero;
			primerNumero = segundoNumero;
			segundoNumero = resultado;
			
			contador++;
		}while(contador <=10);

	}

}
