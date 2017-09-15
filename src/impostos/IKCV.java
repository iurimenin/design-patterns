package impostos;

import dao.Item;
import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class IKCV extends TemplateDeImpostoCondicional {

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemValorMaiorCem(orcamento);
    }

    private boolean temItemValorMaiorCem(Orcamento orcamento) {

        for (Item item : orcamento.getItens()) {

            if (item.getValor() > 100) return true;
        }
        return false;
    }
}
