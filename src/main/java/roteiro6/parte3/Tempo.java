package roteiro6.parte3;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo (int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int calcularDiferencaEmMinutos(Tempo outro) {
        int totalSegundosAtual = this.hora * 3600 + this.minuto * 60 + this.segundo;
        int totalSegundosOutro = outro.hora * 3600 + outro.minuto * 60 + outro.segundo;
        int diferencaSegundos = Math.abs(totalSegundosOutro - totalSegundosAtual);
        return diferencaSegundos / 60;
    }

    public int calcularDiferencaArredondada(Tempo outro) {
        int totalSegundosAtual = this.hora * 3600 + this.minuto * 60 + this.segundo;
        int totalSegundosOutro = outro.hora * 3600 + outro.minuto * 60 + outro.segundo;
        int diferencaSegundos = Math.abs(totalSegundosOutro - totalSegundosAtual);
        return (int) Math.ceil(diferencaSegundos / 60.0);
    }
}
