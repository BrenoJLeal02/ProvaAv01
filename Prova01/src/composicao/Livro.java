package composicao;

public class Livro extends EntidadeBiblioteca {
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Título: " + getNome() + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao);
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}
