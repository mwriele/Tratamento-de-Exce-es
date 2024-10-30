import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int quantidade;

    public Livro(String titulo, String autor, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponivel() {
        return quantidade > 0;
    }

    public void emprestar() {
        if (quantidade > 0) {
            quantidade--;
        }
    }

    public void devolver() {
        quantidade++;
    }
}

class LivroNaoEncontradoException extends RuntimeException {
    public LivroNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

class LivroNaoDisponivelException extends RuntimeException {
    public LivroNaoDisponivelException(String mensagem) {
        super(mensagem);
    }
}

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        Livro livro = encontrarLivro(titulo);
        if (!livro.estaDisponivel()) {
            throw new LivroNaoDisponivelException("O livro '" + titulo + "' não está disponível.");
        }
        livro.emprestar();
    }

    private Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        throw new LivroNaoEncontradoException("O livro '" + titulo + "' não foi encontrado.");
    }
}

public class Lista03Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 3));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 0));

        System.out.print("Digite o título do livro para emprestar: ");
        String titulo = scanner.nextLine();

        try {
            biblioteca.emprestarLivro(titulo);
            System.out.println("Livro emprestado com sucesso.");
        } catch (LivroNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (LivroNaoDisponivelException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
