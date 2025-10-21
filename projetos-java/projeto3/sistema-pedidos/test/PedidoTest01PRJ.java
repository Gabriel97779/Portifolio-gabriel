package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Pedido;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Produto;

public class PedidoTest01PRJ {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Ventilador", 349.99);
        Produto produto2 = new Produto("Turbina", 5349.99);
        Produto produto3 = new Produto("Bicos", 449.99);
        Produto [] produtos1 = {produto1, produto2, produto3};

        Pedido pedidos1 = new Pedido(produtos1);
        pedidos1.imprimeProduto();

        Produto produto4 = new Produto("Kit Pistão Forjado", 6753.45);
        Produto produto5 = new Produto("FuelTech", 4390.00);
        Produto produto6 = new Produto("Wastegate", 349.99);
        Produto [] produtos2 = {produto4, produto5, produto6};

        Pedido pedidos2 = new Pedido(produtos2);
        pedidos2.imprimeProduto();


        produto1.imprime();
        produto4.imprime();




    }
}
