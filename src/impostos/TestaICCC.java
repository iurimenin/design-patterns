package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class TestaICCC {

    public static void main(String[] args) {

        Orcamento orcamentoMenorMil = new Orcamento(500.0);
        Orcamento orcamentoMenorTresMil = new Orcamento(2000.0);
        Orcamento orcamentoMaiorTresMil = new Orcamento(5000.0);

        Imposto iccc = new ICCC();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        calculadorDeImpostos.realizaCalculo(orcamentoMenorMil, iccc);
        calculadorDeImpostos.realizaCalculo(orcamentoMenorTresMil, iccc);
        calculadorDeImpostos.realizaCalculo(orcamentoMaiorTresMil, iccc);
    }
}
