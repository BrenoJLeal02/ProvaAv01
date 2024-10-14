package composicao;

abstract class EntidadeBiblioteca {
    private String nome;

    public EntidadeBiblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibirInformacoes();
}
