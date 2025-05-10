package roteiro6.parte3;

import roteiro6.parte3.Tempo;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    private static double valorPorMinuto = 1.0;

    public Ligacao (String numOrigem,String numDestino,String localOrigem, String localDestino, Tempo horaInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;
    }

    public String getNumOrigem() {
        return numOrigem;
    }

    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public Tempo getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Tempo getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

    public boolean verificaNumero(String numero) {
        return this.numOrigem.equals(numero) || this.numDestino.equals(numero);
    }

    public static void setValorPorMinuto(double valor) {
        valorPorMinuto = valor;
    }

    public double calcularValorLigacao() {
        if (horaFim == null) {
            throw new IllegalStateException("Hora de término não definida.");
        }
        int minutos = horaInicio.calcularDiferencaEmMinutos(horaFim);
        return minutos * valorPorMinuto;
    }

    public double calcularValorLigacaoArredondado() {
        if (horaFim == null) {
            throw new IllegalStateException("Hora de término não definida.");
        }
        int minutos = horaInicio.calcularDiferencaArredondada(horaFim);
        return minutos * valorPorMinuto;
    }
}
