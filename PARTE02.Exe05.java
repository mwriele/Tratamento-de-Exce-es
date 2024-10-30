package listas.lista03;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Largura e altura devem ser positivas.");
        }
        this.largura = largura;
        this.altura = altura;
    }

}
