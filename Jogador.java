package br.com.yasminalbino.desafiojogo;

import java.util.Random;
import java.util.Scanner;

public class Jogador {

    String nomeJogador;
    Personagem personagemEscolhido;
    Jogador atacante;
    Jogador defensor;

    public void definirOrdem(Jogador jogador1, Jogador jogador2, Random random, Scanner scan) {

        if(random.nextInt(10) %2 == 0) {
            System.out.println(jogador2.nomeJogador + " você ataca primeiro.");
            jogador2 = atacante;
            jogador2.personagemEscolhido.atacar(random, scan, atacante, defensor);
            System.out.println(jogador1.nomeJogador + " sua vez de atacar.");
            jogador1 = defensor;
            jogador1.personagemEscolhido.atacar(random, scan, atacante, defensor);
        } else {
            System.out.println(jogador1.nomeJogador + " você ataca primeiro.");
            jogador1 = atacante;
            jogador1.personagemEscolhido.atacar(random, scan, atacante, defensor);
            System.out.println(jogador2.nomeJogador + " sua vez de atacar.");
            jogador2 = defensor;
            jogador2.personagemEscolhido.atacar(random, scan, atacante, defensor);
        }
    }
}
