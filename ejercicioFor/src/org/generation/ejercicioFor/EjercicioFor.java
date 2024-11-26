package org.generation.ejercicioFor;

import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un nombre:");
		String name = scanner.next();
		scanner.close();
		
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

	}

}
