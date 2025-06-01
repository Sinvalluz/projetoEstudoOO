package roteiro6.parte1;

public class Principal {
    public static void main(String[] args) {
        Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", "10:15:02");

        System.out.println("Numero de origem: " + lig01.getNumOrigem());
        System.out.println("Numero de destino: " + lig01.getNumDestino());
        System.out.println("Local de origem: " + lig01.getLocalOrigem());
        System.out.println("Local de destino: " + lig01.getLocalDestino());
        System.out.println("Hora de inicio: " + lig01.getHoraInicio());
    }
}
