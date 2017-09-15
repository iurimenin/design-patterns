package descontos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public interface Desconto {

    double desconta(Orcamento orcamento);

    void setProximo(Desconto proximo);
}
