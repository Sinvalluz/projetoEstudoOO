package roteiro9.parte1;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica retangulo = new Retangulo(5, 10);
        System.out.println("Figura: " + retangulo.getNomeFigura());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());

        FiguraGeometrica quadrado = new Quadrado(4);
        System.out.println("Figura: " + quadrado.getNomeFigura());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());
    }
}
