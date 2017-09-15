package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class ImpostoX extends TemplateDeImpostoCondicional {

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
