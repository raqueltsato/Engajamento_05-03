package org.example;

import java.lang.reflect.Array;
import java.util.*;


public class App {

    private static Scanner sc = new Scanner(System.in);
    private static HashSet<Aluno> listaAlunos = new HashSet<Aluno>();

    public static void main(String[] args) {

        int i = 0;
        String option;

        do {

            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    inserirAluno();
                    break;
                case "2":
                    exibirLista();
                    break;
                case "0":
                    exibirLista();
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno() {
        System.out.println("Insira o Ra: ");
        String ra = sc.nextLine();
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        Aluno a = new Aluno(ra, nome);
        if (listaAlunos.contains(a)) {
            System.err.println("Aluno já cadastrado");
        } else{
            listaAlunos.add(new Aluno(ra, nome));
        }

    }


    private static void exibirLista() {

        System.out.println("----- Lista de nomes -----");
        listaAlunos.forEach(System.out::println);

    }
}