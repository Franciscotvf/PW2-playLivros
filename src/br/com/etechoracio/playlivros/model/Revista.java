package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.interfaces.Publicacao;

public class Revista implements Publicacao {
    @Override
    public double getPreco() {
        return 0;
    }
}
