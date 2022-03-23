package br.edu.fafic.ppi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
//@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries({
        @NamedQuery(name = "equipeByNome", query = "select e from Equipe e where e.nome =:parametro "),
        @NamedQuery(name= "tecnicoByEquipe", query = "select e from Equipe e where e.nome =:parametro "),
        @NamedQuery(name= "timeByJogador", query = "select e.nome from Equipe e join e.jogadores  jogador where jogador.nome =:parametro "),
        @NamedQuery(name = "equipesByCampeonato",query = "select e from Equipe  e where e.campeonato.nome =:parametro"),
        @NamedQuery(name= "jogadorByStatus", query = "select j from Jogador j where j.status =:parametro "),
        @NamedQuery(name= "equipeByTecnico", query = "select e.nome from Equipe e join e.tecnico  tecnico where tecnico.nome =:parametro "),
        @NamedQuery(name= "jogadorByEquipe", query = "select j.nome from Jogador j join j.equipe  equipe where equipe.nome =:parametro "),

})
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;

    @OneToMany
    private List<Jogador> jogadores;

    @OneToOne
    private Tecnico tecnico;

    @ManyToOne
    private Campeonato campeonato;

    @Override
    public String toString() {
        return "Equipe{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
