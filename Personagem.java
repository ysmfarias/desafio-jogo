package br.com.yasminalbino.desafiojogo;

import java.util.Random;
import java.util.Scanner;

public class Personagem {

    String nome;
    String classe;
    int codigo;
    int pontosDeVida;
    int ataqueForte;
    int chanceAtaqueForte;
    int ataqueMedio;
    int chanceAtaqueMedio;
    int ataqueFraco;
    int chanceAtaqueFraco;
    int chanceCritico;

    public Personagem(String nome, String classe, int codigo, int pontosDeVida, int ataqueForte,
                      int chanceAtaqueForte, int ataqueMedio, int chanceAtaqueMedio, int ataqueFraco,
                      int chanceAtaqueFraco, int chanceCritico) {
        this.nome = nome;
        this.classe = classe;
        this.codigo = codigo;
        this.pontosDeVida = pontosDeVida;
        this.ataqueForte = ataqueForte;
        this.chanceAtaqueForte = chanceAtaqueForte;
        this.ataqueMedio = ataqueMedio;
        this.chanceAtaqueMedio = chanceAtaqueMedio;
        this.ataqueFraco = ataqueFraco;
        this.chanceAtaqueFraco = chanceAtaqueFraco;
        this.chanceCritico = chanceCritico;
    }

    public void atacar(Random random, Scanner scan, Jogador atacante, Jogador defensor) {
        System.out.println("Escolha o seu ataque:");
        System.out.println("FORTE - MEDIO - FRACO");
        String ataque = scan.next();
        if(ataque.equalsIgnoreCase("forte")) {
            atacarForte(random, atacante, defensor);
        } else if (ataque.equalsIgnoreCase("medio")) {
            atacarMedio(random, atacante, defensor);
        } else if (ataque.equalsIgnoreCase("fraco")) {
            atacarFraco(random, atacante, defensor);
        }
    }

    public void atacarForte(Random random, Jogador atacante, Jogador defensor) {
        if(random.nextInt(100)<atacante.personagemEscolhido.chanceAtaqueForte) {
            if(random.nextInt(100)<atacante.personagemEscolhido.chanceCritico) {
                defensor.personagemEscolhido.pontosDeVida = defensor.personagemEscolhido.pontosDeVida - 2* atacante.personagemEscolhido.ataqueForte;
            } else {
                defensor.personagemEscolhido.pontosDeVida -= atacante.personagemEscolhido.ataqueForte;
            }
            System.out.println("Você acertou o ataque.");
        } else {
            System.out.println("Você errou o ataque!");
        }
    }

    public void atacarMedio(Random random, Jogador atacante, Jogador defensor) {
        if(random.nextInt(100)<atacante.personagemEscolhido.chanceAtaqueMedio) {
            if(random.nextInt(100)<atacante.personagemEscolhido.chanceCritico) {
                defensor.personagemEscolhido.pontosDeVida = defensor.personagemEscolhido.pontosDeVida - 2 * atacante.personagemEscolhido.ataqueMedio;
            } else {
                defensor.personagemEscolhido.pontosDeVida -= atacante.personagemEscolhido.ataqueMedio;
            }
            System.out.println("Você acertou o ataque.");
        } else {
            System.out.println("Você errou o ataque!");
        }
    }

    public void atacarFraco(Random random, Jogador atacante, Jogador defensor) {
        if(random.nextInt(100)<atacante.personagemEscolhido.chanceAtaqueFraco) {
            if(random.nextInt(100)< atacante.personagemEscolhido.chanceCritico) {
                defensor.personagemEscolhido.pontosDeVida = defensor.personagemEscolhido.pontosDeVida - 2* atacante.personagemEscolhido.ataqueFraco;
            } else {
                defensor.personagemEscolhido.pontosDeVida -= atacante.personagemEscolhido.ataqueFraco;
            }
            System.out.println("Você acertou o ataque.");
        } else {
            System.out.println("Você errou o ataque!");
        }
    }

    @Override
    public String toString() {
        return "NOME: " + nome + " | CLASSE: " + classe + " | CODIGO: " + codigo +" | PONTOS DE VIDA: " +
                pontosDeVida + " | ATAQUE FORTE: " + ataqueForte + " | ATAQUE MÉDIO: " + ataqueMedio +
                " | ATAQUE FRACO: " + ataqueFraco + " | CHANCE DE ACERTO CRÍTICO: " + chanceCritico;
    }
}
