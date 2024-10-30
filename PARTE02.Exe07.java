package listas.lista03;

public class Aluno {
    private double notaA1;
    private double notaA2;
    private double notaAI;
    private double notaA3;

    public Aluno(double notaA1, double notaA2, double notaAI, double notaA3) {
        if (notaA1 < 0 || notaA2 < 0 || notaAI < 0 || notaA3 < 0) {
            throw new IllegalArgumentException("As notas não podem ser negativas.");
        }
        this.notaA1 = notaA1;
        this.notaA2 = notaA2;
        this.notaAI = notaAI;
        this.notaA3 = notaA3;
    }

}
