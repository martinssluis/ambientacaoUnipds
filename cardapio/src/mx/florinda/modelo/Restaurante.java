package mx.florinda.modelo;

public class Restaurante {
    private String nome;
    private String endereco;

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
