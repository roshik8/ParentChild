package dao;

import java.util.List;

public interface IRepository<T> {
    public T findById(int id);
    public void add(T entity);
    public void update(T entity);
    public void delete(T entity);
    public List<T> findAll();
}
