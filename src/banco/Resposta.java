package banco;

import dao.Conta;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public interface Resposta {
    void responde(Requisicao req, Conta conta);
    void setProxima(Resposta resposta);
}
