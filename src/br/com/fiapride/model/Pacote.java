package br.com.fiapride.model;

public class Pacote {
    private String codigoPostal;
    private double peso;
    private String situacao;

    public Pacote(String codigo, double peso, String situacao) {
        this.setCodigo(codigo);
        this.setSituacao(situacao);
        this.setPeso(peso);
    }

    public void mudarSituacao(String situacaoAtualizada) {
        situacao = situacaoAtualizada;
        System.out.println("=== SITUACAO ATUALIZADA ===");
        System.out.println("Situação : " + situacaoAtualizada);
    }

    public String getCodigo() {return codigoPostal;}

    private void setCodigo(String codigo) {this.codigoPostal = codigo;}

    public double getPeso() {return peso;}

    private void setPeso(double peso) {this.peso = peso;}

    public String getSituacao() {return situacao;}

    private void setSituacao(String situacao) {this.situacao = situacao;}
}
