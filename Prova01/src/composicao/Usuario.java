package composicao;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends EntidadeBiblioteca {
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        super(nome);
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Biblioteca biblioteca, Livro livro) {
        if (biblioteca.removerLivro(livro)) {
            livrosEmprestados.add(livro);
            System.out.println(getNome() + " emprestou o livro: " + livro.getNome());
        } else {
            System.out.println("O livro " + livro.getNome() + " não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Biblioteca biblioteca, Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            biblioteca.adicionarLivro(livro);
            System.out.println(getNome() + " devolveu o livro: " + livro.getNome());
        } else {
            System.out.println("O livro " + livro.getNome() + " não está com " + getNome());
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Usuário: " + getNome());
    }

    public void exibirLivrosEmprestados() {
        System.out.println("Livros emprestados por " + getNome() + ":");
        for (Livro livro : livrosEmprestados) {
            livro.exibirInformacoes();
        }
    }
    
    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}
