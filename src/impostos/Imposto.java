package impostos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public interface Imposto {

    double calcula(Orcamento orcamento);
}
