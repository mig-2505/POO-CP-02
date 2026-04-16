package br.com.fiapride.model;

public class Veiculo {

    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
    }

    public void mostrarDetalhes() {
        System.out.println("Veículo genérico");
    }

    public boolean podeTransportar(Pacote pacote) {
        return capacidade >= pacote.getPeso();
    }

    public String getPlaca() {return placa;}

    private void setPlaca(String placa) {this.placa = placa;}

    public double getCapacidade() {return capacidade;}

    private void setCapacidade(double capacidade) {this.capacidade = capacidade;}

}
