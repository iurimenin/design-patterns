package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {

        return orcamento.getValor() * 0.06;
    }
}
