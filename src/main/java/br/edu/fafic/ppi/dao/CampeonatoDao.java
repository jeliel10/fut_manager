package br.edu.fafic.ppi.dao;

import br.edu.fafic.ppi.domain.Campeonato;

import java.util.List;


public class CampeonatoDao extends GenericDaoImp<Campeonato>{

    @Override
    public void saveOrUpdate(Campeonato entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(Campeonato entity) {
        super.delete(entity);
    }

    @Override
    public Campeonato findByName(String consulta, String parametro) {
        return super.findByName(consulta,parametro);
    }

    @Override
    public List<Campeonato> findAll(String nameQuery) {
        return super.findAll(nameQuery);
    }
}
