import roteiro6.parte3.Ligacao;
import roteiro6.parte3.Tempo;

public class Main {
    public static void main(String[] args) {
        Tempo inicio = new Tempo(10, 0, 0);
        Tempo fim = new Tempo(10, 5, 35);

        Ligacao ligacao = new Ligacao("71996186907", "71996186907", "Bahia", "Rio de Janeiro", inicio);
        ligacao.setHoraFim(fim);

        System.out.println("Valor exato da ligação: R$" + ligacao.calcularValorLigacao());
        System.out.println("Valor arredondado da ligação: R$" + ligacao.calcularValorLigacaoArredondado());

    }
}
