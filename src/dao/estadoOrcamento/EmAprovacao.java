package dao.estadoOrcamento;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class EmAprovacao implements EstadoDeUmOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.setValor( orcamento.getValor() - orcamento.getValor() * 0.05);
            descontoAplicado = true;
        }
        else {
            throw new RuntimeException("Desconto j� aplicado!");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de aprovado
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de reprovado tambem
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        // daqui n�o posso ir direto para finalizado
        throw new RuntimeException("Orcamento em aprova��o n�o podem ir para finalizado diretamente");
    }
}