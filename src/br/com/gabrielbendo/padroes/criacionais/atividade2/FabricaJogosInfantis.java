/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielbendo.padroes.criacionais.atividade2;

/**
 *
 * @author gabri
 */
public class FabricaJogosInfantis implements FabricaJogo {
    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabuleiroInfantil();
    }

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartasInfantil();
    }
}