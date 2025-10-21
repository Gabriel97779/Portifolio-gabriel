package academy.devdojo.maratonajava.javacore.projectsJava.reservaCinema.dominio;

public class Cinema {
    private String nomeFilme;
    private double precoIngresso;
    private int assentosDisponiveis;

    public Cinema(String nomeFilme, double precoIngresso, int assentosDisponiveis) {
        this.nomeFilme = nomeFilme;
        this.precoIngresso = precoIngresso;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public Cinema(String nomeFilme) {
        this(nomeFilme, 20, 100);
    }



    public void reservar(Comprador comprador) {
        if (this.assentosDisponiveis > 0) {
            this.assentosDisponiveis -= 1;
            System.out.println("=================================================");
            System.out.println("1 assento reservado para "+comprador.getNome()+" no filme: " + this.nomeFilme);

        } else {
            System.out.println(" ");
            System.out.println("Não há assentos disponivéis para o filme: " + this.nomeFilme);

        }

    }

    public void reservar(Comprador comprador, int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade Inválida");
            System.out.println("=================================================");

        } else if (this.assentosDisponiveis <= 0) {
            System.out.println("Não há assento para o filme " + nomeFilme);

        } else if (quantidade <= this.assentosDisponiveis) {
            this.assentosDisponiveis -= quantidade;
            System.out.println("=================================================");
            System.out.println(quantidade + " assentos reservados para "+comprador.getNome()+" no filme: " + this.nomeFilme);


        } else {
            System.out.println("Não é possível reservar " + quantidade + " assentos. Há apenas só  " + this.assentosDisponiveis + " disponíveis");
            System.out.println("=================================================");


        }
    }


    public void imprimirInfo() {
        System.out.println("-----------------------------------------------------");
        System.out.println("FIlme: " + nomeFilme + " | Preço: R$" + precoIngresso + " | Assentos Disponivéis: " + assentosDisponiveis);
        System.out.println(" ");
    }


}



