package cursosEProfessores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Professor {

    String nomeProfessor;
    protected static List<Professor> professores = new ArrayList<>();

    public static void adicionarProfessor(String nome) {
        Professor professor = new Professor();
        professor.nomeProfessor = nome;
        professores.add(professor);
    }

    public static void removerProfessor(int indice) {
        if (indice >= 0 && indice < professores.size()) {
            professores.remove(indice);
        }
    }

    public static void listarProfessores() {
        for (int i = 0; i < professores.size(); i++) {
            System.out.println(i + " - " + professores.get(i).nomeProfessor);
        }
    }
    public static int listarPedirIndiceProfessor(Scanner entrada) {
        listarProfessores();
        System.out.println("Escolha o índice do curso: ");
        int indice = entrada.nextInt();
        entrada.nextLine();

        if (indice >= 0 && indice < professores.size()) {
            return indice;
        } else {
            System.out.println("Índice inválido.");
            return -1;
        }
    }

}
