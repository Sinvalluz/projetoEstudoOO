package roteiro9.parte2;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica quadrado = new Quadrado(4);
        FiguraGeometrica retangulo = new Retangulo(3, 6);

        System.out.println("Figura: " + circulo.getNomeFigura());
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Perímetro: " + circulo.getPerimetro());

        System.out.println();

        System.out.println("Figura: " + quadrado.getNomeFigura());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());

        System.out.println();

        System.out.println("Figura: " + retangulo.getNomeFigura());
        System.out.println("Área: " + retangulo.getArea());
        System.out.println("Perímetro: " + retangulo.getPerimetro());
    }
}
