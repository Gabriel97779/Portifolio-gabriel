package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Pedido {
    private static int contador;
    private Produto[] produto;
    private int numPedido;

    static {
        contador = 1;
    }

    {
        numPedido = contador++;
    }


    public Pedido(Produto[] produtos) {
        this.produto = produtos;
        for (Produto produto : produtos) {
            produto.setPedido(this);
        }
    }


    public void imprimeProduto() {
        if (produto == null) return;
        System.out.println("=================");
        System.out.println(numPedido+"° pedido");
        for (Produto produto: produto){
            System.out.println("---------------");
            System.out.println("Produto: "+produto.getNome());
            System.out.println("Preço: "+produto.getPreco());

        }
        System.out.println("=================");
    }

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
}
