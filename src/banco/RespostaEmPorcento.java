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
            // não existe próxima na corrente, e ninguém atendeu a requisição!
            // poderíamos não ter feito nada aqui, caso não fosse necessário!
            throw new RuntimeException("Formato de resposta não encontrado");
        }
    }

    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;
    }
}