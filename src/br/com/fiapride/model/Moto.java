package br.com.fiapride.model;

public class Moto extends Veiculo{

    private boolean bau;

    public Moto(boolean bau, String placa, double capacidade) {
        super(placa, capacidade);
        this.bau = bau;
    }

    public boolean isBau() {return bau;}

    public void setBau(boolean bau) {this.bau = bau;}

}
