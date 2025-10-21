package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Disciplina;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class DisciplinaTest01PRJ {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Obi-Wan Kenobi");
        Professor professor2 = new Professor("Anakin Skywalker");
        Professor professor3 = new Professor("Yoda");

        Professor [] professores1 = {professor1, professor2, professor3};

        Disciplina disciplina1 = new Disciplina("Fluxo da FORÇA", professores1);

        disciplina1.imprimirAulas();

        Professor professor4 = new Professor("Mace Windu");
        Professor professor5 = new Professor("Anakin Skywalker");

        Professor [] professores2 = {professor4, professor5};

        Disciplina disciplina2 = new Disciplina("Ataque usando a FORÇA",professores2);

        disciplina2.imprimirAulas();



    }
}
