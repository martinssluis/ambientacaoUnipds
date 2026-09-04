import mx.florinda.modelo.Cardapio;
import mx.florinda.modelo.ItemCardapio;
import mx.florinda.modelo.Restaurante;

void main() {

    Cardapio cardapio = new Cardapio();

    String linha = IO.readln("Digite um id de um item de cardápio: ");
    long idSelecionado = Long.parseLong(linha);

    ItemCardapio itemSelecionado = cardapio.getItemPorId(idSelecionado);

    IO.println("== Item do Cardápio ==");
    IO.println("Id: " + itemSelecionado.getId());
    IO.println("Nome: " + itemSelecionado.getNome());
    IO.println("Descrição: " + itemSelecionado.getDescricao());
    if (itemSelecionado.isEmPromocao()) {
        IO.println("Item em promoção! 🤑");
        double porcentagemDesconto = itemSelecionado.getPorcentagemDesconto();
        IO.println("Preco: de " + itemSelecionado.getPreco() + " por " + itemSelecionado.getPrecoComDesconto());
        IO.println("Porcentagem de desconto: " + porcentagemDesconto);
    } else {
        IO.println("Preco: " + itemSelecionado.getPreco());
        IO.println("Item não está em promoção");
    }
    IO.println("Categoria: " + itemSelecionado.getCategoria());
    IO.println("Imposto: " + itemSelecionado.getImposto());

    IO.println("-------");

    IO.println("Soma dos preços: " + cardapio.getSomaDosPrecos());
    IO.println("Total de itens em promoção: " + cardapio.getTotalDeItensEmPromocao());

    double precoLimite = 10.0;
    IO.println("O primeiro preço que é maior que " + precoLimite + ": " + cardapio.getPrimeiroPrecoMaiorQueLimite(precoLimite));

    IO.println("-------");

    // Imprimir todos os precos menores ou iguais ao limite
    for (ItemCardapio item : cardapio.getItens()) {
        if (item.getPreco() <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + item.getPreco());
        }
    }

    Restaurante vicosa = new Restaurante("Viçosa", "Rodoviária");

    IO.println(vicosa.getNome() + " unidade " +vicosa.getEndereco());

}