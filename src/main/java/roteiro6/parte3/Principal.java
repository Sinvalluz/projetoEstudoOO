package roteiro6.parte3;

public class Principal {
    public static void main(String[] args) {
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", new Tempo(10, 0, 0));
        Ligacao lig02 = new Ligacao("121212", "565656", "A", "B", new Tempo(10, 0, 0));
        Ligacao lig03 = new Ligacao("121212", "565656", "A", "B", new Tempo(10, 0, 0));
        Ligacao lig04 = new Ligacao("121212", "565656", "A", "B", new Tempo(9, 55, 50));

        lig01.setHoraFim(new Tempo(10, 0, 1));
        lig02.setHoraFim(new Tempo(10, 5, 1));
        lig03.setHoraFim(new Tempo(10, 5, 35));
        lig04.setHoraFim(new Tempo(10, 3, 53));

        Resumo.imprimir(lig01);
        Resumo.imprimir(lig02);
        Resumo.imprimir(lig03);
        Resumo.imprimir(lig04);
    }


}
