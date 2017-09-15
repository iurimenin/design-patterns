package descontos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class SemDesconto implements Desconto {

    public double desconta(Orcamento orcamento) {
        return 0;
    }

    public void setProximo(Desconto desconto) {
        // nao tem!
    }
}

