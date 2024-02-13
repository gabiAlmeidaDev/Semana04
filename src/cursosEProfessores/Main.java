package cursosEProfessores;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean sair = false;
        while (!sair) {
            System.out.println("Bem vindo ao Menu Principal!");
            System.out.println("1 - Listar Cursos");
            System.out.println("2 - Adicionar Curso");
            System.out.println("3 - Remover Curso");
            System.out.println("4 - Buscar índice do Curso");
            System.out.println("5 - Listar Professores");
            System.out.println("6 - Adicionar Professor");
            System.out.println("7 - Remover Professor");
            System.out.println("8 - Buscar índice do Professor");
            System.out.println("9 - Marcar o curso como concluído");
            System.out.println("10 - Listar os cursos concluídos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int menu = entrada.nextInt();
            entrada.nextLine();

            switch (menu) {
                case 1:
                    Curso.listarCurso();
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("Qual curso deseja adicionar?");
                    String nomeCurso = entrada.nextLine();
                    Curso.adicionarCurso(nomeCurso);
                    System.out.println("Curso: " + nomeCurso + " adicionado com sucesso!");
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("Digite o índice do curso que quer remover: ");
                    int indiceCurso = entrada.nextInt();
                    Curso.removerCurso(indiceCurso);
                    System.out.println("Curso com índice: " + indiceCurso + " foi removido.");
                    System.out.println("-------------------------");
                    break;
                case 4:
                    int indiceCursoEscolhido = Curso.listarPedirIndiceCurso(entrada);
                    if (indiceCursoEscolhido != -1) {
                        System.out.println("Curso selecionado: " + Curso.cursos.get(indiceCursoEscolhido).nomeCurso);
                    }
                    break;
                case 5:
                    Professor.listarProfessores();
                    System.out.println("-------------------------");
                    break;
                case 6:
                    System.out.println("Qual o professor a ser adicionado? ");
                    String nomeProfessor = entrada.nextLine();
                    Professor.adicionarProfessor(nomeProfessor);
                    System.out.println("Professor: " + nomeProfessor + " adicionado com sucesso!");
                    System.out.println("-------------------------");
                    break;
                case 7:
                    System.out.println("Digite o índice do Professor que quer remover: ");
                    int indiceProfessor = entrada.nextInt();
                    Professor.removerProfessor(indiceProfessor);
                    System.out.println("Professor com índice: " + indiceProfessor + " foi removido.");
                    System.out.println("-------------------------");
                    break;
                case 8:
                    int indiceProfessorEscolhido = Professor.listarPedirIndiceProfessor(entrada);
                    if (indiceProfessorEscolhido != -1) {
                        System.out.println("Professor selecionado: " + Professor.professores.get(indiceProfessorEscolhido).nomeProfessor);
                    }
                    break;
                case 9:
                    Curso.marcarComoConcluido(entrada);
                    break;
                case 10:
                    Curso.listarCursosConcluidos();
                    break;
                case 0:
                    System.out.println("Cursos inseridos: ");
                    Curso.listarCurso();
                    System.out.println("Professores inseridos: ");
                    Professor.listarProfessores();
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
        entrada.close();

    }

}
