package mx.florinda.modelo;

public class Restaurante {
    private String nome;
    private String endereco;
    private Cardapio cardapio;

    public Restaurante(String nome, String endereco, Cardapio cardapio) {
        this.nome = nome;
        this.endereco = endereco;
        this.cardapio = cardapio;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }
}
