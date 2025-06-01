package roteiro5.parte3;

public class Principal {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Lojão", "Lojão LTDA", "12345678");
        Loja loja2 = new Loja("Mercado", "Mercado SA", "87654321");

        loja1.setValorFat(15000);
        loja2.setValorFat(25000);

        // Usando método estático
        Loja maiorFatEstatica = Loja.compararFat_static(loja1, loja2);
        System.out.println("Maior faturamento (estático):");
        System.out.println("Nome: " + maiorFatEstatica.getNomeFantasia());
        System.out.println("Faturamento: " + maiorFatEstatica.getValorFat());

        // Usando método não estático
        Loja maiorFatNaoEstatica = loja1.compararFat_naoStatic(loja2);
        System.out.println("Maior faturamento (não estático):");
        System.out.println("Nome: " + maiorFatNaoEstatica.getNomeFantasia());
        System.out.println("Faturamento: " + maiorFatNaoEstatica.getValorFat());
    }
}
