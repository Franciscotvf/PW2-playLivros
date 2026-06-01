package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Livro;
import br.com.etechoracio.playlivros.model.LivroImpresso;

public class TestaReferencias {

    static void main() {
        // tipo nome valor -> declaração de variável
        Livro livroA = new LivroImpresso();
        livroA.setTitulo("Meu br.com.etechoracio.playlivros.model.Livro A");
        System.out.println(livroA.getTitulo());

        Livro livroB = livroA;
        livroB.setTitulo("Meu livro B");
        System.out.println(livroB.getTitulo());

        System.out.println(livroA.getTitulo());
    }
}