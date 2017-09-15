package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class TestaImposto {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(500.0);

        Imposto icms = new ICMS();
        Imposto iss = new ISS();

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();

        calculadorDeImpostos.realizaCalculo(orcamento, icms);
        calculadorDeImpostos.realizaCalculo(orcamento, iss);
    }
}
