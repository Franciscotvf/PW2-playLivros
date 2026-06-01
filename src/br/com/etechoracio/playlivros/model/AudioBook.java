package br.com.etechoracio.playlivros.model;

import br.com.etechoracio.playlivros.enums.VersaoEnum;

import java.time.LocalTime;

public class AudioBook extends Livro{
    private String narrador;
    private LocalTime duracao;
    private VersaoEnum versao;

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public void setVersao(VersaoEnum versao) {
        this.versao = versao;
    }
}