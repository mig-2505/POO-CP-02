package br.com.fiapride.model;

public class Moto extends Veiculo{

    private boolean bau;

    public Moto(boolean bau, String placa, double capacidade) {
        super(placa, capacidade);
        this.setBau(bau);
    }

    public void mostrarDetalhes() {
        System.out.println("Tipo de veiculo: Moto");
    }

    public boolean podeTransportar(Pacote pacote) {
        return getCapacidade() >= pacote.getPeso() && isBau();
    }

    public boolean isBau() {return bau;}

    private void setBau(boolean bau) {this.bau = bau;}

}
