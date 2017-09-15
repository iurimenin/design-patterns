package dao.estadoConta;

import dao.Conta;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public interface EstadoDaConta {

    void saca(Conta conta, double valor);
    void deposita(Conta conta, double valor);
}
