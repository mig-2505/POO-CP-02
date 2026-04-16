package br.com.fiapride.principal;

import br.com.fiapride.model.Caminhao;
import br.com.fiapride.model.Moto;
import br.com.fiapride.model.Pacote;
import br.com.fiapride.model.Rota;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("ABC1234", 140, 5);
        Moto moto1 = new Moto(false, "DEF5678", 20);
        Caminhao caminhao2 = new Caminhao("GHI9012", 110, 1);

        Pacote pacote1 = new Pacote("BR999", 100, "Pendente");
        Pacote pacote2 = new Pacote("BR888", 11, "Pendente");
        Pacote pacote3 = new Pacote("BR777", 110, "Em rota");

        Rota rota1 = new Rota(pacote1, caminhao1);
        Rota rota2 = new Rota(pacote2, moto1);
        Rota rota3 = new Rota(pacote3, caminhao2);

        rota1.mandarPacote();
        pacote1.mudarSituacao("Em rota");

        System.out.println();

        rota2.mandarPacote();

        System.out.println();

        rota3.mandarPacote();
        pacote3.mudarSituacao("Entregue");
    }
}
