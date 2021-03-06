package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class ICCC extends Imposto {

    @Override
    public double calcula(Orcamento orcamento) {

        if (orcamento.getValor() < 1000)
            return orcamento.getValor() * 0.05;
        else if (orcamento.getValor() < 3000)
            return orcamento.getValor() * 0.07;
        else
            return (orcamento.getValor() * 0.08) + 30;
    }
}
