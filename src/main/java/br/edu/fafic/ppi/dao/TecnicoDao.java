package br.edu.fafic.ppi.dao;

import br.edu.fafic.ppi.domain.Tecnico;

import java.util.List;

public class TecnicoDao extends GenericDaoImp<Tecnico>{

    @Override
    public void saveOrUpdate(Tecnico entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(Tecnico entity) {
        super.delete(entity);
    }

    @Override
    public Tecnico findByName(String consulta, String parametro) {
        return super.findByName(consulta,parametro);
    }

    @Override
    public List<Tecnico> findAll(String nameQuery) {
        return super.findAll(nameQuery);
    }
}
