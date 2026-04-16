package br.com.fiapride.model;

public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.setPacote(pacote);
        this.setVeiculo(veiculo);
    }

    public void mandarPacote() {
        if (!veiculo.podeTransportar(pacote)) {
            System.out.println("=== ERRO ===");
            System.out.println("O veiculo nao tem capacidade!");
            pacote.mudarSituacao("Cancelada");
        }
        else {
            System.out.println("=== MANDANDO PACOTE ===");
            System.out.println("Pacote: " + pacote.getCodigo());
            System.out.println("Placa do veiculo: " + getVeiculo().getPlaca());
            System.out.println("Situação: " + getPacote().getSituacao());
            veiculo.mostrarDetalhes();
        }
    }

    public Pacote getPacote() {return pacote;}

    private void setPacote(Pacote pacote) {this.pacote = pacote;}

    public Veiculo getVeiculo() {return veiculo;}

    private void setVeiculo(Veiculo veiculo) {this.veiculo = veiculo;}
}
