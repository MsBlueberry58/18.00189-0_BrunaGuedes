package br.maua.DAO;

import java.util.List;
/**
 * Interface genérica utilizada para gerar os métodos que a classe PersonagensDAO terá que implementar.
 *
 * @param <T>
 */
public interface DAO<T> {
    List<T> getAll();

    void insert(T t);


}


