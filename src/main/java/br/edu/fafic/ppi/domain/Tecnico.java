package br.edu.fafic.ppi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Tecnico")
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries({
        @NamedQuery(name = "tecnicoByNome", query = "select t from Tecnico t where t.nome =:parametro ")
})
public class Tecnico extends Pessoa {

    @OneToOne(cascade = CascadeType.MERGE)
    private Equipe equipe;

}
