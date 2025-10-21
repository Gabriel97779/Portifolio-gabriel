package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Produto {
    private String nome;
    private double preco;
    private Pedido pedido;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }


    public void imprime() {
        System.out.println("===Produto do "+pedido.getNumPedido()+"° pedido===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}