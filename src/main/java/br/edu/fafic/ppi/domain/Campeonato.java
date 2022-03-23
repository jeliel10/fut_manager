package br.edu.fafic.ppi.domain;


import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries({
        @NamedQuery(name = "campeonato", query = "select c from Campeonato c where c.nome =:parametro")
})
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;

    @OneToMany
    private List<Equipe> equipe;

    @Override
    public String toString() {
        return "Campeonato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
