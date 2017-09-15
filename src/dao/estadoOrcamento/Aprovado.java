package dao.estadoOrcamento;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class Aprovado implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!descontoAplicado) {
            orcamento.setValor(orcamento.getValor() - orcamento.getValor() * 0.02);
            descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto j� aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        // jah estou em aprovacao
        throw new RuntimeException("Or�amento j� est� em estado de aprova��o");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        // nao pode ser reprovado agora!
        throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        // daqui posso ir para o estado de finalizado
        orcamento.setEstadoAtual(new Finalizado());
    }
}