package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.interfaces.ElegivelParaDesconto;

public class LivroImpresso extends Livro implements ElegivelParaDesconto {
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

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual <= 0.25){
            preco = preco - (preco * percentual);
        }
    }
}
