package roteiro5.parte1;

public class Principal {
    public static void main(String[] args) {
        Loja loja01 = new Loja("Loja 01", "Loja de Teste", "12345678901234");
        Loja loja02 = new Loja("Loja 02", "", "98765432109876");

        loja01.setValorFat(10000.0);
        loja01.setArea(150.0);
        loja02.setValorFat(20000.0);
        loja02.setArea(250.0);
        Loja.informacoes(loja01);
        Loja.informacoes(loja02);

        System.out.println("Valor de faturamento da loja 01: " + loja01.getValorFat());
        System.out.println("Área da loja 01: " + loja01.getArea());

        System.out.println("Valor de faturamento da loja 02: " + loja02.getValorFat());
        System.out.println("Área da loja 02: " + loja02.getArea());
    }
}
