package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

        double resultado = imposto.calcula(orcamento);
        System.out.println(resultado);
    }
}
