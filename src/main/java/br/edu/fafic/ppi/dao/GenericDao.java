package br.edu.fafic.ppi.dao;

import java.util.List;


public interface GenericDao <T>{

    void saveOrUpdate(T entity);
    T findByName(String query, String parametro);
    void delete(T entity);
    List<T> findAll(String nameQuery);
    String findByString(String query, String parametro);

}
