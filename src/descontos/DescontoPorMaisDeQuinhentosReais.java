package descontos;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class DescontoPorMaisDeQuinhentosReais implements Desconto{

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }
        else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}