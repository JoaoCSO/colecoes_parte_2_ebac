package br.com.jcsilva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula (ex: João,Ana,Pedro):");
        String entrada = scanner.nextLine();

        // 1️⃣ Separar os nomes usando split
        String[] nomesArray = entrada.split(",");

        // 2️⃣ Converter o array em uma lista
        List<String> nomes = new ArrayList<>();

        for (String nome : nomesArray) {
            nomes.add(nome.trim()); // remove espaços extras
        }

        // 3️⃣ Ordenar em ordem alfabética
        Collections.sort(nomes);

        // 4️⃣ Imprimir o resultado
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
