package br.com.etechoracio.playlivros.model;

public class Pocket extends Livro {

    private double largura;
    private double altura;
    private int paginas;

    @Override
    protected void exibirDetalhes() {
        System.out.println("Páginas: "+ paginas);
        System.out.println("Largura: " + largura);
        System.out.println("Altura: "+ altura
        );
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void aplicarDesconto (double percentual){

    }
}
