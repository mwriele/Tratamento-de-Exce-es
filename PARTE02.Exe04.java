package listas.lista03;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser positivos.");
        }
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
}
