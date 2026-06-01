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
    public double getTotal() {
        return super.getTotal() + getTaxaEnvio();
    }
}
