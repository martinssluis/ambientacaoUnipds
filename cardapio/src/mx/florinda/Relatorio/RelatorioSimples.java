package mx.florinda.Relatorio;

import java.io.IO;

public class RelatorioSimples extends Relatorio{
    @Override
    protected void gerarCorpo() {
        IO.println("--Corpo simples--");
    }
}
