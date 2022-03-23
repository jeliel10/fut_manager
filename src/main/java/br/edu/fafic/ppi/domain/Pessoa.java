package br.edu.fafic.ppi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
//@Data
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
@AllArgsConstructor
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + '}';
    }
}
