package roteiro8.parte3;

public class Principal {
    public static void main(String[] args) {
        Cliente sinval = new Cliente(
                "12345678900",
                "Sinval",
                "Rua 1",
                "Sinval@email.com", "719 9999-9999",
                new VeiculoPequeno("ABC1234", 2020, "Fusca"));

        System.out.println("Dados do cliente:");
        System.out.println("Nome: " + sinval.getNome());
        System.out.println("CPF: " + sinval.getCpf_cnpj());
        System.out.println("Veiculo pequeno:");
        System.out.println("Placa: " + sinval.getVeiculo().getPlaca());
        System.out.println("Ano de fabricacao: " + sinval.getVeiculo().getAnoFabricacao());
        System.out.println("Modelo: " + ((VeiculoPequeno) sinval.getVeiculo()).getModelo());
        System.out.println("Taxa de Pedagio: " + sinval.getVeiculo().calcPedagio());

        sinval.setVeiculo(new VeiculoCarga("DEF5678", 2018, 2000));
        System.out.println("\nVeiculo de carga:");
        System.out.println("Placa: " + sinval.getVeiculo().getPlaca());
        System.out.println("Ano de fabricacao: " + sinval.getVeiculo().getAnoFabricacao());
        System.out.println("Peso maximo: " + ((VeiculoCarga) sinval.getVeiculo()).getPesoMax());
        System.out.println("Taxa de Pedagio: " + sinval.getVeiculo().calcPedagio());

        sinval.setVeiculo(new VeiculoPasseio("GHI9012", 2019, 5));

        System.out.println("\nVeiculo de passeio:");
        System.out.println("Placa: " + sinval.getVeiculo().getPlaca());
        System.out.println("Ano de fabricacao: " + sinval.getVeiculo().getAnoFabricacao());
        System.out.println("Quantidade maxima de passageiros: " + ((VeiculoPasseio) sinval.getVeiculo()).getQtdeMaxPassageiros());
        System.out.println("Taxa de Pedagio: " + sinval.getVeiculo().calcPedagio());
    }
}
