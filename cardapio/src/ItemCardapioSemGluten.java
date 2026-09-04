public class ItemCardapioSemGluten extends ItemCardapio{
    ItemCardapioSemGluten(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        super(id, nome, descricao, preco, categoria);
    }

    boolean ehSemGluten(){
        return true;
    }
}
