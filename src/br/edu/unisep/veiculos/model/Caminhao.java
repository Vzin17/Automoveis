package br.edu.unisep.veiculos.model;

public class Caminhao extends Veiculo {
    private String tipoCarga;

    public Caminhao(String marca, String modelo, int ano, String tipoCarga) {
        super(marca, modelo, ano);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Tipo de Carga: " + tipoCarga;
    }
}
