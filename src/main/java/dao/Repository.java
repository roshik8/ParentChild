package dao;

import models.Child;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class Repository<T> implements IRepository<T> {
    protected Class<T> typeOfT;

    public Repository(Class<T> typeOfT){
        this.typeOfT = typeOfT;
    }

    @Override
    public T findById(int id) {
        return getSession().get(typeOfT, id);
    }

    private Session getSession() {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    @Override
    public void add(T entity) {
        getSession().save(entity);
    }

    @Override
    public void update(T entity) {
        getSession().update(entity);

    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public List<T> findAll() {
        return getSession().createQuery("from " + typeOfT.getName()).list();
    }


}
