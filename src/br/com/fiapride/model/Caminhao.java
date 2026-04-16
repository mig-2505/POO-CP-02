package br.com.fiapride.model;

public class Caminhao extends Veiculo{

    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        this.setEixos(eixos);
    }

    public void mostrarDetalhes() {
        System.out.println("Tipo de veiculo: Caminhão");
    }

    public boolean podeTransportar(Pacote pacote) {
        return getCapacidade() >= pacote.getPeso() && getEixos() > 0;
    }

    public int getEixos() {return eixos;}

    private void setEixos(int eixos) {this.eixos = eixos;}
}

