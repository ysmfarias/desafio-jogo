package br.com.yasminalbino.desafiojogo;

import java.util.Scanner;

public class Menu {

    public Personagem [] personagens = new Personagem [] {
            new Personagem("Malenia", "Assassino", 1,150, 40,30,
                    30,40,20,70,50),
            new Personagem("Radahn", "Tanque", 2,250,30,30,
                    20,40,10,70,10),
            new Personagem("Padre Gascoigne", "Guerreiro", 3,200,40,30,
                    30,40,20,70,30)
    };

    public void listarPersonagens() {
        for(Personagem personagem : personagens) {
            System.out.println(personagem);
        }
    }

    public Personagem escolherPersonagemJogador1(Scanner scan) {
        listarPersonagens();
        System.out.println("-------------------------------------------");
        System.out.println("Jogador 1 - digite o código do personagem que deseja jogar.");
        int codigoEscolhido1 = scan.nextInt();
        for(Personagem personagem : personagens) {
            if(personagem.codigo == codigoEscolhido1) {
                System.out.println("O personagem escolhido foi: " + personagem.nome);
                return personagem;
            }
        }
        return null;
    }

    public Personagem escolherPersonagemJogador2(Scanner scan) {
        listarPersonagens();
        System.out.println("-------------------------------------------");
        System.out.println("Jogador 2 - digite o código do personagem que deseja jogar.");
        int codigoEscolhido2 = scan.nextInt();
        for(Personagem personagem : personagens) {
            if(personagem.codigo == codigoEscolhido2) {
                System.out.println("O personagem escolhido foi: " + personagem.nome);
                return personagem;
            }
        }
        return null;
    }

    public void imprimirHp(Jogador jogador1, Jogador jogador2) {
        System.out.println("-------------------------------------------");
        System.out.println(jogador1.nomeJogador + " possui " + jogador1.personagemEscolhido.pontosDeVida + " pontos de vida.");
        System.out.println("-------------------------------------------");
        System.out.println(jogador2.nomeJogador + " possui " + jogador2.personagemEscolhido.pontosDeVida + " pontos de vida.");
        System.out.println("-------------------------------------------");
    }

    public void imprimirVencedor(Jogador jogador1, Jogador jogador2) {
        if(jogador1.personagemEscolhido.pontosDeVida > jogador2.personagemEscolhido.pontosDeVida) {
            System.out.println(jogador1.nomeJogador + " venceu a partida!");
        } else if (jogador1.personagemEscolhido.pontosDeVida < jogador2.personagemEscolhido.pontosDeVida) {
            System.out.println(jogador2.nomeJogador + " venceu a partida!");
        } else {
            System.out.println("Houve empate!");
        }
    }
}
