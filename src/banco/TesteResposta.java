package banco;

import dao.Conta;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class TesteResposta {

    public static void main(String[] args) {

        Conta conta = new Conta("Iuri", 50000);

        ProcessaRequisicao processaRequisicao = new ProcessaRequisicao();
        processaRequisicao.processar(new Requisicao(Formato.XML), conta);
        processaRequisicao.processar(new Requisicao(Formato.CSV), conta);
        processaRequisicao.processar(new Requisicao(Formato.PORCENTO), conta);
    }
}
