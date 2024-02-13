package abstracao;

public class Professor {
    String nomeProfessor;
    String especialidade = "JAVA";

    public void ensinar() {
        System.out.println("O professor ensina a " + especialidade);
    }
}
