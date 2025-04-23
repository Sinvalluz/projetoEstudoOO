import roteiro5.parte3.Loja;

public class Main {
    public static void main(String[] args) {
        Loja loja1 = new Loja("SinvassTech", "Sinval empreendimentos e tecnologias", "91146368000118");
        Loja loja2 = new Loja("Mercadão do povo", "50980160000112");
//        Loja loja3 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

        loja1.setValorFat(10000);
        loja2.setValorFat(20000);
//        loja3.setValorFat(10000);

        System.out.println(" ****** Comparação com método estático ********");
        Loja maiorLojaFatStatic = Loja.compararFat_static(loja1, loja2);
        System.out.println("Loja com maior faturamento (estático): " + maiorLojaFatStatic.getNomeFantasia());

        System.out.println(" ****** Comparação com método NÃO estático ********");
        Loja maiorLojaFatNaoStatic = loja1.compararFat_naoStatic(loja2);
        System.out.println("Loja com maior faturamento (não estático): " + maiorLojaFatNaoStatic.getNomeFantasia());

    }
}
