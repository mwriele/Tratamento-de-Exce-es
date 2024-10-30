package listas.lista03;

public class Contribuinte {
    private String sexo;
    private int tempoContribuicao;
    private int idade;

    public Contribuinte(String sexo, int tempoContribuicao, int idade) {
        if (!sexo.equals("M") && !sexo.equals("F")) {
            throw new IllegalArgumentException("Sexo deve ser 'M' ou 'F'.");
        }
        if (tempoContribuicao <= 0 || idade <= 0) {
            throw new IllegalArgumentException("Tempo de contribuição e idade devem ser positivos.");
        }
        if (tempoContribuicao >= idade) {
            throw new IllegalArgumentException("O tempo de contribuição deve ser menor que a idade.");
        }
        this.sexo = sexo;
        this.tempoContribuicao = tempoContribuicao;
        this.idade = idade;
    }

}
