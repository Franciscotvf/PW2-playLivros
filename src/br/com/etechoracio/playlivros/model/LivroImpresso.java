package br.com.etechoracio.playlivros.model;

public class LivroImpresso extends Livro {
    private int paginas;

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getTaxaEnvio() {
        return preco * 0.07;
    }

    @Override
    protected void exibirDetalhes() {
        System.out.println("Pagina" + paginas);
    }

    @Override
    public double getPreco() {
        return preco + getTaxaEnvio();
    }
}
