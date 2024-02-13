package cursosEProfessores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    public String nomeCurso;
    static List<Curso> cursos = new ArrayList<>();
    private static List<Curso> cursosConcluidos = new ArrayList<>();

    public static void adicionarCurso(String nome) {
        Curso curso = new Curso();
        curso.nomeCurso = nome;
        cursos.add(curso);
    }

    public static void removerCurso(int indice) {
        if (indice >= 0 && indice < cursos.size()) {
            cursos.remove(indice);
        }
    }
    public static void listarCurso() {
        for (int i = 0; i < cursos.size(); i++) {
            Curso curso = cursos.get(i);
            System.out.println(i + " - " + cursos.get(i).nomeCurso);
        }
    }
    public static int listarPedirIndiceCurso(Scanner entrada) {
        listarCurso();
        System.out.println("Escolha o índice do curso: ");
        int indice = entrada.nextInt();
        entrada.nextLine();

        if (indice >= 0 && indice < cursos.size()) {
            return indice;
        } else {
            System.out.println("Índice inválido.");
            return -1;
        }
    }
    public static void marcarComoConcluido(Scanner entrada) {
        int indice = listarPedirIndiceCurso(entrada);
        if (indice >= 0 && indice < cursos.size()) {
            Curso cursoConcluido = cursos.get(indice);
            cursosConcluidos.add(cursoConcluido);
            cursos.remove(indice);
            System.out.println("Curso '" + cursoConcluido.nomeCurso + "' marcado como concluído.");
        } else {
            System.out.println("Operação cancelada ou índice inválido.");
        }
    }
    public static void listarCursosConcluidos() {
        if (cursosConcluidos.isEmpty()) {
            System.out.println("Não há cursos concluídos.");
        } else {
            System.out.println("Os cursos Concluídos são: ");
            for (Curso curso : cursosConcluidos) {
                System.out.println(curso.nomeCurso);
            }
        }
    }


}

