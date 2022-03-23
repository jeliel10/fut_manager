package br.edu.fafic.ppi.Main;

import br.edu.fafic.ppi.dao.CampeonatoDao;
import br.edu.fafic.ppi.dao.JogadorDao;
import br.edu.fafic.ppi.dao.TecnicoDao;
import br.edu.fafic.ppi.dao.EquipeDao;
import br.edu.fafic.ppi.domain.*;

import java.util.Arrays;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Jogador jogadorR = new Jogador();

        jogadorR.setNome("Romario");
        jogadorR.setPosicao("Atacante");
        jogadorR.setStatus("Titular");


        Jogador jogadorN = new Jogador();
        jogadorN.setNome("Nene");
        jogadorN.setPosicao("Meia");
        jogadorN.setStatus("Titular");


        Jogador jogadorG = new Jogador();
        jogadorG.setNome("Gabigol");
        jogadorG.setPosicao("Atacante");
        jogadorG.setStatus("reserva");

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Lisca doido");

        Equipe equipe = new Equipe();
        equipe.setNome("União flasco");

        Equipe equipe2 = new Equipe();
        equipe2.setNome("Cruzeiro");

        Campeonato campeonato = new Campeonato();
        campeonato.setNome("Brasileirao");

        JogadorDao jogadorDao = new JogadorDao();

        TecnicoDao tecnicoDao = new TecnicoDao();

        EquipeDao equipeDao =  new EquipeDao();

        //Buscar equipe pelo nome do tecnico
        String tecnicoDaEquipe = tecnicoDao.findByString("equipeByTecnico","Lisca doido");
        System.out.println(tecnicoDaEquipe);

        //Buscar jogador pelo nome da Equipe
        List<Jogador> jogadores = jogadorDao.findListBy("jogadorByEquipe",tecnicoDaEquipe);
        System.out.println(jogadores);

    }

}
