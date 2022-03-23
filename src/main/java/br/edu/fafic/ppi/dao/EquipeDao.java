package br.edu.fafic.ppi.dao;

import br.edu.fafic.ppi.domain.Equipe;
import br.edu.fafic.ppi.domain.Jogador;
import br.edu.fafic.ppi.domain.Tecnico;

import javax.persistence.Query;
import java.util.List;

public class EquipeDao extends GenericDaoImp <Equipe>{


    @Override
    public void saveOrUpdate(Equipe entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(Equipe entity) {
        super.delete(entity);
    }


    @Override
    public Equipe findByName( String consulta, String parametro) {

        return super.findByName(consulta,parametro);
    }

    @Override
    public List<Equipe> findAll(String nameQuery) {
        return super.findAll(nameQuery);
    }

    public List<Equipe> listByname(String consulta, String parametro){
        return super.findListBy(consulta, parametro);
    }
}
