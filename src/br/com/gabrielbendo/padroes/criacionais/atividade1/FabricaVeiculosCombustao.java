/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielbendo.padroes.criacionais.atividade1;

/**
 *
 * @author gabri
 */
public class FabricaVeiculosCombustao implements FabricaVeiculo {
    @Override
    public Carro criarCarro() {
        return new CarroCombustao();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoCombustao();
    }
}
