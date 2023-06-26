package application;
import java.util.ArrayList;
import java.util.List;

public class Pasta {
	private String nome;
    private List<Pasta> subpastas;
    private List<Arquivo> arquivos;

    public Pasta(String nome) {
        this.nome = nome;
        this.subpastas = new ArrayList<>();
        this.arquivos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Pasta> getSubpastas() {
        return subpastas;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public int calcularTamanhoTotal() {
        int tamanhoTotal = 0;

        for (Arquivo arquivo : arquivos) {
            tamanhoTotal += arquivo.getTamanho();
        }

        for (Pasta subpasta : subpastas) {
            tamanhoTotal += subpasta.calcularTamanhoTotal();
        }

        return tamanhoTotal;
    }

    public void adicionarSubpasta(Pasta subpasta) {
        subpastas.add(subpasta);
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void excluir() {
        for (Pasta subpasta : subpastas) {
            subpasta.excluir();
        }

        subpastas.clear();
        arquivos.clear();
    }
}
