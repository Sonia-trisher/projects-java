import java.util.List;

public interface menuService<T> {
    void read(int id);
    List<T> readAll();
    void insert(T item);
    void update(T item);
    void delete(int id);

}
