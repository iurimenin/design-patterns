package banco;

import dao.Conta;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class RespostaEmPorcento implements Resposta {

    private Resposta outraResposta;

    public RespostaEmPorcento (Resposta proxima) {
        setProxima(proxima);
    }

    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.PORCENTO) {
            System.out.println(conta.getTitular() + "%" + conta.getSaldo());
        }
        else if (outraResposta != null){
            outraResposta.responde(req, conta);
        } else {
            // n�o existe pr�xima na corrente, e ningu�m atendeu a requisi��o!
            // poder�amos n�o ter feito nada aqui, caso n�o fosse necess�rio!
            throw new RuntimeException("Formato de resposta n�o encontrado");
        }
    }

    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;
    }
}