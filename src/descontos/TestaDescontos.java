package descontos;


import dao.Item;
import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class TestaDescontos {
    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);

    }
}

