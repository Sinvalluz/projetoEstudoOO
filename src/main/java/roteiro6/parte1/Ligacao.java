package roteiro6.parte1;

// 5 - Com o implementado até o momento, seria possível, por exemplo, encerrar esta ligação do item 4 com o horário de “10:20:35” ?
// Sim, é possível, usando o chamando o método lig01.setHoraFim("10:20:35");

// 6 - Com o horário encerrado, ou seja, com os horários de início e término preenchidos,
// teríamos como calcular o tempo de duração desta ligação? Sim ou Não? Como? OBS.:
// Não é necessário implementar uma solução para este caso. Apenas analise o contexto e a
// complexidade envolvida, descrevendo o que seria necessário fazer.

// Tendo a hora de início e a hora do fim seria possível, essa solução seria possível na criação de um metodo onde transformaria as horas em segundos e diminuiria os valores.

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private String horaInicio;
    private String horaFim;

    public Ligacao (String numOrigem,String numDestino,String localOrigem, String localDestino, String horaInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = "";
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

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }
}
