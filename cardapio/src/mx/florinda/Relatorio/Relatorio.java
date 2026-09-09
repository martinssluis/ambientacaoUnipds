package mx.florinda.Relatorio;

import java.io.IO;
import java.time.LocalDateTime;

public abstract class Relatorio {

    public final void gerarRelatorio(){
        gerarCabecalho();
        gerarCorpo();
        gerarRodape();
    }

    public void gerarCabecalho(){
        IO.println("---Cabeçalho---");
    }

    protected abstract void gerarCorpo();

    public void gerarRodape(){
        IO.println("---Rodape---");
    }

    public static void imprimirDataHora(){
        IO.println(LocalDateTime.now());
    }

}
