package dao.estadoOrcamento;

import dao.Orcamento;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public interface EstadoDeUmOrcamento {

    void aplicaDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}
