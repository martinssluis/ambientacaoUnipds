package mx.florinda.Relatorio;

import java.io.IO;

public class RelatorioDetalhado extends Relatorio{
    @Override
    protected void gerarCorpo() {
        IO.println("--Inicio Corpo--" +
                "\nEste é o corpo detalhado!" +
                "\n-- Fim Corpo--");
    }
}
