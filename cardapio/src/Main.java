void main() {

    Cardapio cardapio = new Cardapio();

    String linha = IO.readln("Digite um id de um item de cardápio: ");
    long idSelecionado = Long.parseLong(linha);

    ItemCardapio itemSelecionado = cardapio.itens[((int) idSelecionado) - 1];

    IO.println("== Item do Cardápio ==");
    IO.println("Id: " + itemSelecionado.id);
    IO.println("Nome: " + itemSelecionado.nome);
    IO.println("Descrição: " + itemSelecionado.descricao);
    if (itemSelecionado.emPromocao) {
        IO.println("Item em promoção! 🤑");
        double porcentagemDesconto = itemSelecionado.calculaPorcentagemDesconto();
        IO.println("Preco: de " + itemSelecionado.preco + " por " + itemSelecionado.precoComDesconto);
        IO.println("Porcentagem de desconto: " + porcentagemDesconto);
    } else {
        IO.println("Preco: " + itemSelecionado.preco);
        IO.println("Item não está em promoção");
    }
    IO.println("Categoria: " + itemSelecionado.obtemNomeCategoria());
    IO.println("Imposto: " + itemSelecionado.calculaImposto());

    IO.println("-------");

    double[] precos = new double[7];

    precos[0] = 2.99;
    precos[1] = 3.50;
    precos[2] = 12.99;
    precos[3] = 4.99;
    precos[4] = 2.50;
    precos[5] = 4.99;
    precos[6] = 25.90;

    boolean[] emPromocao = { false, true, true, true, true, true, false };

    IO.println("Soma dos preços: " + cardapio.obtemSomaDosPrecos());
    IO.println("Total de itens em promoção: " + cardapio.obtemTotalDeItensEmPromocao());

    double precoLimite = 10.0;
    IO.println("O primeiro preço que é maior que " + precoLimite + ": " + cardapio.obtemPrimeiroPrecoMaiorQueLimite(precoLimite));

    IO.println("-------");

    // Imprimir todos os precos menores ou iguais ao limite
    for (ItemCardapio item : cardapio.itens) {
        if (item.preco <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + item.preco);
            continue;
        }
    }

}