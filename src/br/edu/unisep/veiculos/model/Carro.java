package br.edu.unisep.veiculos.model;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Número de Portas: " + numeroPortas;
    }
}
