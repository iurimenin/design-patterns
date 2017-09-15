package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class ICMS extends Imposto {

    public ICMS() {}

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {

        return orcamento.getValor() * 0.1;
    }
}
