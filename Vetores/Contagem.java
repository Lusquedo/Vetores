package com.mycompany.numerospareseimpares;

import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int[] numeros = new int[15];

        
        System.out.println("Digite 15 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        int contagemPares = 0;
        int contagemImpares = 0;

        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contagemPares++;
            } else {
                contagemImpares++;
            }
        }

        
        System.out.println("\nQuantidade de números pares: " + contagemPares);
        System.out.println("Quantidade de números ímpares: " + contagemImpares);

        
        scanner.close();
    }
}
