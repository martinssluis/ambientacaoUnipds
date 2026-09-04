public class ItemCardapioBebida extends ItemCardapio{
    ItemCardapioBebida(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        super(id, nome, descricao, preco, categoria);
    }

    @Override
    double calculaImposto() {
        return 5.0/100;
    }
}
