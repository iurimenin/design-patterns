package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional() { }

    public TemplateDeImpostoCondicional(Imposto outro) {
        super(outro);
    }

    public final double calcula(Orcamento orcamento) {

        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }

    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
