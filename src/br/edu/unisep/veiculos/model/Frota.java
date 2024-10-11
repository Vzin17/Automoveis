package br.edu.unisep.veiculos.model;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirDetalhesFrota() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.exibirDetalhes());
        }
    }
}

