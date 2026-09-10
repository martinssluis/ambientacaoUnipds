package mx.florinda.leitor;

import mx.florinda.modelo.ItemCardapio;

public interface LeitorItensCardapio {

    ItemCardapio[] processaArquivo();

    static LeitorItensCardapio criaLeitor(String nomeArquivo){

        LeitorItensCardapio leitor = null;

        if (nomeArquivo.endsWith(".csv")) {

            leitor = new LeitorItensCardapioCSV(nomeArquivo);

        } else if (nomeArquivo.endsWith(".json")) {

            leitor = new LeitorItensCardapioGSON(nomeArquivo);

        }
        return leitor;
    }

}
