package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Disciplina {
    private String nome;
    private Professor [] professor;

    public Disciplina(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }


    public void imprimirAulas(){
        if (professor == null) return;
        System.out.println("================");
        System.out.println("Disciplina: "+nome);
        System.out.println("Professores: ");
        for (Professor professor: professor){
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }
}
