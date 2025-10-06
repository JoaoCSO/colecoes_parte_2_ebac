package br.com.jcsilva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite nome e sexo separados por vírgula (Ex: Felipe,M) ou 'sair' para terminar: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            // Divide a string usando split
            String[] partes = entrada.split(",");

            if (partes.length != 2) {
                System.out.println("Entrada inválida! Use o formato Nome,Sexo (Ex: Ana,F)");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim();

            if (sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido! Digite apenas M ou F.");
            }
        }

        System.out.println("\n--- Grupo Masculino ---");
        for (String pessoa : grupoMasculino) {
            System.out.println(pessoa);
        }

        System.out.println("\n--- Grupo Feminino ---");
        for (String pessoa : grupoFeminino) {
            System.out.println(pessoa);
        }

        scanner.close();
    }
}
