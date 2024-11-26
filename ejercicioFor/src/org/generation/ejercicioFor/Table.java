package org.generation.ejercicioFor;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
         int num;
         
         System.out.print("Enter any positive integer: ");
         num = console.nextInt();
                 
         System.out.println("Multiplication Table of " + num);
         int contador = 1;
         int resultado = 0;
         
         while(contador <=10) {
        	 resultado = num * contador;
        	 System.out.println(num + " x " + contador + " = " + resultado);
        	 contador++;
         }

	}

}
