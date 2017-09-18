package builders;

/**
 * Created by Iuri Menin on 18/09/17.
 */
public class ItemDaNota {

    private String nome;
    private double valor;

    public ItemDaNota(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
