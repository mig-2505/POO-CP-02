package br.com.fiapride.principal;

import br.com.fiapride.model.Caminhao;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Pacote;
import br.com.fiapride.model.Rota;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("ABC1234", 100, -5);
        Moto moto1 = new Moto(false, "DEF5678", 200);

        Pacote pacote1 = new Pacote("BR999", 200, "Pendente");
        Pacote pacote2 = new Pacote("BR888", 11, "Pendente");

        Rota rota1 = new Rota(pacote1, caminhao1);
        Rota rota2 = new Rota(pacote2, moto1);

        rota1.mandarPacote();

        System.out.println();

        rota2.mandarPacote();
        pacote2.mudarSituacao("Entregue");

    }
}
