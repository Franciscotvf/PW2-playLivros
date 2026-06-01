package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.AudioBook;
import br.com.etechoracio.playlivros.model.Livro;
import br.com.etechoracio.playlivros.model.SacolaDeCompras;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CarrinhoCompras {
    static void main() {
        // Primeiro Livro
        AudioBook primeioLivro = new AudioBook();
        primeioLivro.setTitulo("Brawl Stars");
        primeioLivro.setAutor("Supercell");
        primeioLivro.setNarrador("Spike");
        primeioLivro.setEditora("Supercell Books");
        primeioLivro.setDuracao(LocalTime.of(6, 7));
        primeioLivro.setVersao(VersaoEnum.INTEGRAL);
        primeioLivro.setPreco(67.67);
        primeioLivro.setResumo("Entenda mais: Mentes geniais que criaram  o Brawl Stars");
        primeioLivro.setDataLancamento(LocalDate.now());
        primeioLivro.exibir();

        // Segundo Livro

        AudioBook segundolivro = new AudioBook();
        segundolivro.setTitulo("O segredo por tras do Francisco");
        segundolivro.setAutor("Todo mundo menos o Francisco");
        segundolivro.setNarrador("Chico Mestre");
        segundolivro.setEditora("Global, todo mundo menos o Francisco");
        segundolivro.setDuracao(LocalTime.of(6, 7));
        segundolivro.setVersao(VersaoEnum.INTEGRAL);
        segundolivro.setPreco(10.00);
        segundolivro.setResumo("Entenda mais sobre um mundo que todos conhecem: o Francisco");
        segundolivro.setDataLancamento(LocalDate.of(2026, 5, 5));
        segundolivro.exibir();

        // Terceiro Livro
        AudioBook terceiroLivro = new AudioBook();
        terceiroLivro.setTitulo("Minecraft: O Guia Definitivo de Sobrevivência");
        terceiroLivro.setAutor("Mojang Studios");
        terceiroLivro.setNarrador("Steve Narrador");
        terceiroLivro.setEditora("Bloco por Bloco Editora");
        terceiroLivro.setDuracao(LocalTime.of(12, 30));
        terceiroLivro.setVersao(VersaoEnum.INTEGRAL);
        terceiroLivro.setPreco(49.90);
        terceiroLivro.setResumo("Aprenda a não morrer para um Creeper na sua primeira noite.");
        terceiroLivro.setDataLancamento(LocalDate.of(2026, 3, 15));
        terceiroLivro.exibir();

        // Quarto Livro
        AudioBook quartoLivro = new AudioBook();
        quartoLivro.setTitulo("Valorant");
        quartoLivro.setAutor("Riot Games");
        quartoLivro.setNarrador("Narrador riot");
        quartoLivro.setEditora("Hextech Books");
        quartoLivro.setDuracao(LocalTime.of(20, 45));
        quartoLivro.setVersao(VersaoEnum.INTEGRAL);
        quartoLivro.setPreco(89.99);
        quartoLivro.setResumo("Descubra as histórias por trás dos bonecos de valorant.");
        quartoLivro.setDataLancamento(LocalDate.now());
        quartoLivro.exibir();



        SacolaDeCompras sacola = new SacolaDeCompras();
        sacola.adicionar(primeioLivro);
        sacola.adicionar(segundolivro);
        sacola.adicionar(terceiroLivro);
        sacola.adicionar(quartoLivro);
        sacola.exibirTotal();
    }

}
