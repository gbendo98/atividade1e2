/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielbendo.padroes.criacionais.atividade2;

/**
 *
 * @author gabri
 */
public class Principal {
    public static void main(String[] args) {
       
        FabricaJogo fabricaAdultos = new FabricaJogosAdultos();
        JogoTabuleiro jogoTabuleiroAdulto = fabricaAdultos.criarJogoTabuleiro();
        JogoCartas jogoCartasAdulto = fabricaAdultos.criarJogoCartas();

        jogoTabuleiroAdulto.jogar();
        jogoCartasAdulto.embaralhar();

        
        FabricaJogo fabricaInfantil = new FabricaJogosInfantis();
        JogoTabuleiro jogoTabuleiroInfantil = fabricaInfantil.criarJogoTabuleiro();
        JogoCartas jogoCartasInfantil = fabricaInfantil.criarJogoCartas();

        jogoTabuleiroInfantil.jogar();
        jogoCartasInfantil.embaralhar();
    }
}

