package mx.florinda.modelo;

import mx.florinda.leitor.LeitorItensCardapioCSV;
import mx.florinda.leitor.LeitorItensCardapioJSON;

import java.io.IO;
import java.io.IOException;

public class Cardapio {

    private ItemCardapio[] itens;

    public Cardapio(String nomeArquivo) throws IOException {

            if (nomeArquivo.endsWith(".csv")) {

                LeitorItensCardapioCSV leitorCSV = new LeitorItensCardapioCSV();
                itens = leitorCSV.processaCSV(nomeArquivo);

            } else if (nomeArquivo.endsWith(".json")) {

                LeitorItensCardapioJSON leitorJSON = new LeitorItensCardapioJSON();
                itens = leitorJSON.processaJSON(nomeArquivo);

            } else {

                itens = new ItemCardapio[0];
                IO.println("Arquivo com extensão inválida: " + nomeArquivo);

            }
        }

    public double getSomaDosPrecos () {
        double totalDePrecos = 0.0;
        for (ItemCardapio item : itens) {
            totalDePrecos += item.getPreco();
        }
        return totalDePrecos;
    }

    public int getTotalDeItensEmPromocao () {
        int totalItensEmPromocao = 0;
        for (ItemCardapio item : itens) {
            if (item.isEmPromocao()) {
                totalItensEmPromocao++;
            }
        }
        return totalItensEmPromocao;
    }

    public double getPrimeiroPrecoMaiorQueLimite ( double precoLimite){
        double precoMaiorQueLimite = -1.0;
        for (ItemCardapio item : itens) {
            if (item.getPreco() > precoLimite) {
                precoMaiorQueLimite = item.getPreco();
                break;
            }
        }
        return precoMaiorQueLimite;
    }

    public ItemCardapio getItemPorId ( long idSelecionado){
        return itens[((int) idSelecionado) - 1];
    }

    public ItemCardapio[] getItens () {
        return itens;
    }

}