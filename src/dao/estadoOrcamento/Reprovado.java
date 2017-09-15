package dao.estadoOrcamento;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class Reprovado implements EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amento j� reprovado!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
