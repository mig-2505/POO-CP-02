package br.com.fiapride.model;

public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void mandarPacote() {
        if (veiculo.getCapacidade() < pacote.getPeso()) {
            System.out.println("=== ERRO ===");
            System.out.println("O veiculo nao tem capacidade!");
            pacote.mudarSituacao("Cancelada");
        }
        else {
            System.out.println("=== MANDANDO PACOTE ===");
            System.out.println("Pacote: " + pacote.getCodigo());
            System.out.println("Placa do veiculo: " + getVeiculo().getPlaca());
            System.out.println("Situação: " + getPacote().getSituacao());
        }
    }

    public Pacote getPacote() {return pacote;}

    public void setPacote(Pacote pacote) {this.pacote = pacote;}

    public Veiculo getVeiculo() {return veiculo;}

    public void setVeiculo(Veiculo veiculo) {this.veiculo = veiculo;}
}
