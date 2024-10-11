package br.edu.unisep.veiculos.model;

public class Moto extends Veiculo {
    private String tipo;

    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Tipo: " + tipo;
    }
}
