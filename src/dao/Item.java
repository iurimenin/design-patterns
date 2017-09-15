package dao;

/**
 * Created by Iuri Menin on 15/09/17.
 */
public class Item {

    private String nome;
    private Double valor;

    public Item(String nome, Double valor) {

        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
