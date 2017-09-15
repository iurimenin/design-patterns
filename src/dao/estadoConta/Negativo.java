package dao.estadoConta;

import dao.Conta;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class Negativo implements EstadoDaConta {

    @Override
    public void saca(Conta conta, double valor) {
        throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
    }

    @Override
    public void deposita(Conta conta, double valor) {

        conta.setSaldo(conta.getSaldo() + valor * 0.95);
        if(conta.getSaldo() > 0) conta.setEstado(new Positivo());
    }
}
