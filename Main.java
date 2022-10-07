package br.com.yasminalbino.desafiojogo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        boolean jogoContinua = true;


        System.out.println("Player 1 - Digite o seu nome: ");
        jogador1.nomeJogador = scan.next();

        System.out.println("Player 2 - Digite o seu nome: ");
        jogador2.nomeJogador = scan.next();

        jogador1.personagemEscolhido = menu.escolherPersonagemJogador1(scan);
        jogador2.personagemEscolhido = menu.escolherPersonagemJogador2(scan);

        while (jogoContinua) {
            if (jogador1.personagemEscolhido.pontosDeVida > 0 || jogador2.personagemEscolhido.pontosDeVida > 0) {
                jogador1.definirOrdem(jogador1, jogador2, random, scan);
                menu.imprimirHp(jogador1, jogador2);
                jogoContinua = true;
            } else {
                menu.imprimirVencedor(jogador1, jogador2);
                jogoContinua = false;
            }
        }
    }
}
