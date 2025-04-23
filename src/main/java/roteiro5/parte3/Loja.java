package roteiro5.parte3;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

    public Loja (String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public Loja (String nomeFantasia, String cnpj) {
        this(nomeFantasia, nomeFantasia, cnpj);
    }


    public static void informacoes (roteiro5.parte2.Loja loja) {
        System.out.println("O nome da loja é: " + loja.getNomeFantasia());
        System.out.println("A razão social é: " + loja.getRazaoSocial());
        System.out.println("cnpj: " + loja.getCnpj());
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorFat() {
        return valorFat;
    }

    public void setValorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public static Loja compararFat_static (Loja lojaA, Loja lojaB) {
        return  lojaA.getValorFat() > lojaB.getValorFat() ? lojaA : lojaB;
    }

    public Loja compararFat_naoStatic (Loja lojaB) {
        return (this.getValorFat() > lojaB.getValorFat() ? this : lojaB);
    }
}
