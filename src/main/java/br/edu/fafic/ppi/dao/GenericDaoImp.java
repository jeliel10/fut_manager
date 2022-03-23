package br.edu.fafic.ppi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class GenericDaoImp<T> implements GenericDao<T>{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade01_jpa");
    private EntityManager em = emf.createEntityManager();

    @Override
    public void saveOrUpdate(T entity) {
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
    }

    @Override
    public T findByName(String consulta, String parametro) {
        Query query = em.createNamedQuery(consulta);
        query.setParameter("parametro",parametro);
        return (T) query.getSingleResult();
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public List<T> findAll(String nameQuery) {
        Query query = em.createNamedQuery(nameQuery);
        return query.getResultList();
    }

    public List<T> findListBy(String nameQuery, String parametro) {
        Query query = em.createNamedQuery(nameQuery);
        query.setParameter("parametro", parametro);
        return query.getResultList();
    }

    @Override
    public String findByString(String query, String parametro) {
        Query consulta = em.createNamedQuery(query);
        consulta.setParameter("parametro", parametro);
        return consulta.getSingleResult().toString();
    }
}
