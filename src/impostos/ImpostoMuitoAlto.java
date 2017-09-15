package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto () { }

    public ImpostoMuitoAlto (Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
    }
}
