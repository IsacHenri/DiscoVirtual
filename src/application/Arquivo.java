package application;

public class Arquivo {
	private String nome;
    private String tipo;
    private int tamanho;

    public Arquivo(String nome, String tipo, int tamanho) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }
}
