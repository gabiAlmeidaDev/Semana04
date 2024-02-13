package abstracao;

public class Main {

    public static void main(String[] args) {
        Curso cursoTeste = new Curso();
        Professor professorTeste = new Professor();

        cursoTeste.progresso();
        cursoTeste.notas();
        cursoTeste.participacao();
        System.out.println("-------------------");
        professorTeste.ensinar();
    }
}
