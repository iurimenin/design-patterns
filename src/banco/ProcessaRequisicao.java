package banco;

import dao.Conta;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class ProcessaRequisicao {

    public void processar(Requisicao req, Conta conta) {

        RespostaEmPorcento respostaEmPorcento = new RespostaEmPorcento(null);
        RespostaEmCsv respostaEmCsv = new RespostaEmCsv(respostaEmPorcento);
        RespostaEmXml respostaEmXml = new RespostaEmXml(respostaEmCsv);

        respostaEmXml.responde(req, conta);
    }
}
