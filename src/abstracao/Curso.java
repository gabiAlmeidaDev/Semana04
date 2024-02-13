package abstracao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //Atributos:
    String nomeCurso;
    String descricaoCurso;
    ArrayList<String> professores;
    int cargaHoraria;

    // Métodos:
    public void progresso () {
        System.out.println("O curso está em 50%");
    }
    public void notas ()  {
        List<Double> notas = new ArrayList();
        notas.add(9.7);
        notas.add(9.8);
        notas.add(9.5);
        notas.add(9.8);
        System.out.println("Suas notas são: " + notas);
    }
    public void participacao () {

        System.out.println("Sua participção foi de 100%. Parabéns!");
    }
}