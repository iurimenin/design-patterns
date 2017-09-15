package dao.estadoOrcamento;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class Finalizado implements EstadoDeUmOrcamento {

    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amento j� finalizado!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Or�amento j� finalizado!");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Or�amento j� finalizado!");
    }
}
