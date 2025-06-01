package roteiro6.parte3;

public class Resumo {
    public static void imprimir(Ligacao lig) {
        Tempo inicio = lig.getHoraInicio();
        Tempo fim = lig.getHoraFim();

        int duracaoSegundos = Math.abs(
                (fim.getHora() * 3600 + fim.getMinuto() * 60 + fim.getSegundo()) -
                        (inicio.getHora() * 3600 + inicio.getMinuto() * 60 + inicio.getSegundo())
        );
        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        int segundos = duracaoSegundos % 60;

        int tempoCobrado = lig.calcularValorLigacaoArredondado() > 0 ? (int) lig.calcularValorLigacaoArredondado() : 1;

        System.out.printf(
                "- Início: %02d:%02d:%02d; Término : %02d:%02d:%02d; Duração : %02d:%02d:%02d ; Tempo cobrado : %d minuto%s \n",
                inicio.getHora(), inicio.getMinuto(), inicio.getSegundo(),
                fim.getHora(), fim.getMinuto(), fim.getSegundo(),
                horas, minutos, segundos,
                tempoCobrado, tempoCobrado > 1 ? "s" : ""
        );
    }
}
