import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LivroNaoEncontradoException extends RuntimeException {
    public LivroNaoEncontradoException(String message) {
        super(message);
    }
}

class LivroNaoDisponivelException extends RuntimeException {
    public LivroNaoDisponivelException(String message) {
        super(message);
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponivel() {
        return quantidadeDisponivel > 0;
    }

    public void emprestar() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
        }
    }

    public void devolver() {
        quantidadeDisponivel++;
    }
}

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!livro.estaDisponivel()) {
                    throw new LivroNaoDisponivelException("O livro '" + titulo + "' não está disponível.");
                }
                livro.emprestar();
                System.out.println("Você emprestou o livro: " + titulo);
                return;
            }
        }
        throw new LivroNaoEncontradoException("O livro '" + titulo + "' não foi encontrado.");
    }
}

public class Lista03Exe02 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 3));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título do livro que deseja emprestar: ");
        String titulo = scanner.nextLine();

        try {
            biblioteca.emprestarLivro(titulo);
        } catch (LivroNaoEncontradoException | LivroNaoDisponivelException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
