package br.edu.fafic.ppi.dao;

import br.edu.fafic.ppi.domain.Equipe;
import br.edu.fafic.ppi.domain.Jogador;

import javax.persistence.Query;
import java.util.List;
import java.util.UUID;

public class JogadorDao extends GenericDaoImp <Jogador> {


    @Override
    public void saveOrUpdate(Jogador entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(Jogador entity) {
        super.delete(entity);
    }


    @Override
    public Jogador findByName(String consulta, String parametro) {
        return super.findByName(consulta,parametro);
    }

    public List<Jogador> listByname(String consulta, String parametro){
        return super.findListBy(consulta, parametro);
    }




    @Override
    public List<Jogador> findAll(String nameQuery) {
        return super.findAll(nameQuery);
    }
}
