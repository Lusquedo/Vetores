package com.mycompany.calculodamedia;

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double[] notas = new double[5];

        
        System.out.println("Digite as 5 notas dos alunos:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;

       
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        int naMedia = 0;

        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            } else if (notas[i] < media) {
                abaixoDaMedia++;
            } else {
                naMedia++;
            }
        }

        
        System.out.println("\nMédia das notas: " + media);
        System.out.println("Alunos acima da média: " + acimaDaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoDaMedia);
        System.out.println("Alunos exatamente na média: " + naMedia);

        
        scanner.close();
    }
}
