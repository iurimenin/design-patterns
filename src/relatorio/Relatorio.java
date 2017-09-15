package relatorio;

import dao.Conta;

import java.util.List;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public abstract class Relatorio {

    protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public void imprime(List<Conta> contas) {
        cabecalho();
        corpo(contas);
        rodape();
    }
}