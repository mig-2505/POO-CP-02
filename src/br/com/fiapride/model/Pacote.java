package br.com.fiapride.model;

public class Pacote {
    private String codigoPostal;
    private double peso;
    private String situacao;

    public Pacote(String codigo, double peso, String situacao) {
        this.codigoPostal = codigo;
        this.situacao = situacao;

        if (peso < 0) {
            System.out.println("Capacidade inválida!");
        } else {
            this.peso = peso;
        }
    }

    public void mudarSituacao(String situacaoAtualizada) {
        situacao = situacaoAtualizada;
        System.out.println("=== SITUACAO ATUALIZADA ===");
        System.out.println("Situação : " + situacaoAtualizada);
    }

    public String getCodigo() {return codigoPostal;}

    public void setCodigo(String codigo) {this.codigoPostal = codigo;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public String getSituacao() {return situacao;}

    public void setSituacao(String situacao) {this.situacao = situacao;}
}
