package br.edu.unisep.veiculos.view;

import br.edu.unisep.veiculos.model.Caminhao;
import br.edu.unisep.veiculos.model.Carro;
import br.edu.unisep.veiculos.model.Frota;
import br.edu.unisep.veiculos.model.Moto;

public class Principal {
    public static void main(String[] args) {
        Frota frota = new Frota();

        // Adicionando veículos à frota
        frota.adicionarVeiculo(new Carro("Toyota", "Corolla", 2020, 4));
        frota.adicionarVeiculo(new Moto("Yamaha", "MT-07", 2021, "Naked"));
        frota.adicionarVeiculo(new Caminhao("Volvo", "FH", 2019, "Carga pesada"));

        // Exibindo detalhes de todos os veículos da frota
        frota.exibirDetalhesFrota();
    }
}
