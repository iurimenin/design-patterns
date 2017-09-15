package dao.estadoConta;

import dao.Conta;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class Positivo implements EstadoDaConta {

    @Override
    public void saca(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() - valor);

        if(conta.getSaldo() < 0) conta.setEstado(new Negativo());

    }

    @Override
    public void deposita(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor * 0.98);
    }

}
