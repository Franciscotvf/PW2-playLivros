package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.interfaces.Publicacao;

public class SacolaDeCompras {
    private double total;
    public void adicionar(Publicacao item){
        total  += item.getPreco();
        System.out.println("Valor "+ item.getPreco());
    }
    public void exibirTotal(){
        System.out.println("----------------------");
        System.out.println("Total: "+ total);


    }
}
