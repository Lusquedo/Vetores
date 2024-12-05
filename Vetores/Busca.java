package com.mycompany.buscaemvetor;

import java.util.Scanner;

public class Busca {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        String[] nomes = new String[10];

        
        System.out.println("Digite 10 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        
        System.out.print("\nDigite o nome a ser buscado: ");
        String nomeBusca = scanner.nextLine();

        
        int posicao = -1;  
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                posicao = i;
                break;
            }
        }

        
        if (posicao != -1) {
            System.out.println("O nome '" + nomeBusca + "' foi encontrado na posição " + (posicao + 1) + ".");
        } else {
            System.out.println("O nome '" + nomeBusca + "' não foi encontrado.");
        }

        
        scanner.close();
    }
}
