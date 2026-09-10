package mx.florinda.modelo;

import java.util.Objects;

public class ItemCardapio {

    // atributos
    private long id;
    private String nome;
    private String descricao;
    private boolean emPromocao;
    private double preco;
    private double precoComDesconto;
    private CategoriaCardapio categoria;

    //construtor
    public ItemCardapio(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    //metodos
    public double getPorcentagemDesconto() {
        return (preco - precoComDesconto) / preco * 100;
    }

    public CategoriaCardapio obtemNomeCategoria() {
        return categoria;
    }

    public void setPromocao(double precoComDesconto) {
        emPromocao = true;
        this.precoComDesconto = precoComDesconto;
    }

    public double getImposto() {
        double imposto;
        if (emPromocao) {
            imposto = precoComDesconto * 0.1;
        } else {
            imposto = preco * 0.1;
        }
        return imposto;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public CategoriaCardapio getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "ItemCardapio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", emPromocao=" + emPromocao +
                ", preco=" + preco +
                ", precoComDesconto=" + precoComDesconto +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemCardapio that = (ItemCardapio) o;
        return id == that.id && emPromocao == that.emPromocao && Double.compare(preco, that.preco) == 0 && Double.compare(precoComDesconto, that.precoComDesconto) == 0 && Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao) && categoria == that.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, emPromocao, preco, precoComDesconto, categoria);
    }
}