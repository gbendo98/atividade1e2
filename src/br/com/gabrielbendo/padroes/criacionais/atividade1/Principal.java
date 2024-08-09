/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielbendo.padroes.criacionais.atividade1;

/**
 *
 * @author gabri
 */
public class Principal {
    
  
    public static void main(String[] args) {
        FabricaVeiculo fabricaEletrica = new FabricaVeiculosEletricos();
        Carro carroEletrico = fabricaEletrica.criarCarro();
        Caminhao caminhaoEletrico = fabricaEletrica.criarCaminhao();
        carroEletrico.dirigir();
        caminhaoEletrico.transportar();

        FabricaVeiculo fabricaCombustao = new FabricaVeiculosCombustao();
        Carro carroCombustao = fabricaCombustao.criarCarro();
        Caminhao caminhaoCombustao = fabricaCombustao.criarCaminhao();
        carroCombustao.dirigir();
        caminhaoCombustao.transportar();
    }
}


