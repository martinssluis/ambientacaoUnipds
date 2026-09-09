import mx.florinda.Relatorio.Relatorio;
import mx.florinda.Relatorio.RelatorioDetalhado;
import mx.florinda.Relatorio.RelatorioSimples;


void main(){

    Relatorio relatorio1 = new RelatorioSimples();
    relatorio1.gerarRelatorio();

    IO.println("----------");
    Relatorio relatorio2 = new RelatorioDetalhado();
    relatorio2.gerarRelatorio();

    Relatorio.imprimirDataHora();

}