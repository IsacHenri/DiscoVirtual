package application;

public class DiscoRigido {

	public static void main(String[] args) {
		Pasta pastaPrincipal = new Pasta("Principal");
        Pasta pastaFilha1 = new Pasta("Filha1");
        Pasta pastaFilha2 = new Pasta("Filha2");
        Pasta pastaNeta = new Pasta("Neta");

        Arquivo arquivo1 = new Arquivo("arquivo1.txt", "txt", 10);
        Arquivo arquivo2 = new Arquivo("arquivo2.txt", "txt", 20);
        Arquivo arquivo3 = new Arquivo("arquivo3.jpg", "jpg", 30);
        Arquivo arquivo4 = new Arquivo("arquivo4.jpg", "jpg", 40);

        pastaPrincipal.adicionarSubpasta(pastaFilha1);
        pastaPrincipal.adicionarSubpasta(pastaFilha2);
        pastaFilha2.adicionarSubpasta(pastaNeta);
        pastaPrincipal.adicionarArquivo(arquivo1);
        pastaFilha1.adicionarArquivo(arquivo2);
        pastaNeta.adicionarArquivo(arquivo3);
        pastaNeta.adicionarArquivo(arquivo4);

        // Calculando o tamanho total da pasta principal
        int tamanhoTotal = pastaPrincipal.calcularTamanhoTotal();
        System.out.println("Tamanho total da pasta principal: " + tamanhoTotal + " bytes");

        // Excluindo a pasta principal e seus conteúdos recursivamente
        pastaPrincipal.excluir();

        // Verificando se a pasta principal está vazia após a exclusão
        if (pastaPrincipal.getSubpastas().isEmpty() && pastaPrincipal.getArquivos().isEmpty()) {
            System.out.println("A pasta principal está vazia.");
        } else {
            System.out.println("A pasta principal ainda contém subpastas ou arquivos.");
        }

	}

}
