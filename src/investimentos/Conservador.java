package investimentos;

import dao.Conta;

/**
 * Created by Iuri Menin on 14/09/17.
 */
public class Conservador implements Investimento{

    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}
