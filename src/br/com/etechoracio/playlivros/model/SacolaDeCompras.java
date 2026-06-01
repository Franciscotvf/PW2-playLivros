package br.com.etechoracio.playlivros.model;

public class SacolaDeCompras {
    private double total;
    public void adicionar(Livro livro){
        total  += livro.getTotal();
        System.out.println("Valor "+ livro.getTotal());
    }
    public void exibirTotal(){
        System.out.println("----------------------");
        System.out.println("Total: "+ total);


    }
}
