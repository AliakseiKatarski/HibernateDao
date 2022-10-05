package model.repository;



public interface DefaultRepository<T> {
    void save(T entity);
    void delete(T entity);
    T findById(Integer id, Class<? extends T> T);

}
