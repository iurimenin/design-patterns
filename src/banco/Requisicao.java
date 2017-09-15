package banco;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class Requisicao {

    private Formato formato;
    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
}
