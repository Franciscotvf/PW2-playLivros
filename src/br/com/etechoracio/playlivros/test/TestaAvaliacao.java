package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.model.Avaliacao;
import br.com.etechoracio.playlivros.model.Usuario;

import java.time.LocalDateTime;

public class TestaAvaliacao {
    static void main() {

        Avaliacao primeiraAvaliacao = new Avaliacao();

        primeiraAvaliacao.getUsuario();
        primeiraAvaliacao.adicionar(5, "Bom","Gostei bastante do livro, parabens!!!");
        primeiraAvaliacao.getData();
        //primeiraAvaliacao.aprovado = true; --> private boolean aprovado; (encapsulamento: colocar os atributos ou métodos como private, para não quebrar as regras)

        primeiraAvaliacao.aprovar();
        primeiraAvaliacao.exibirDados();
        System.out.print("\n");

        //----------------------------------------------

        Avaliacao segundoAvaliacao = new Avaliacao();
        segundoAvaliacao.getUsuario();
        segundoAvaliacao.adicionar(5,"Bom","Para mim que tenho filho maior que 5 anos, não achei interessante.");
        segundoAvaliacao.getData();
        //segundoAvaliacao.aprovado = false; --> private boolean aprovado; (encapsulamento: colocar os atributos ou métodos como private, para não quebrar as regras)

        segundoAvaliacao.aprovar();
        segundoAvaliacao.exibirDados();
    }
}
