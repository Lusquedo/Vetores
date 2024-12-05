package com.mycompany.somaemediadeelementos;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor = new int[10];

        
        int soma = 0;
        double media;

        
        System.out.println("Digite 10 números inteiros:");

       
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i]; 
        }

       
        media = soma / 10.0; 
        
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        
        scanner.close();
    }
}
