package manager;

import java.util.ArrayList;

public interface IStudentManager<E>{
    void add(E e);
    void update(int id,E e);
    void remove(int id);
    ArrayList<E> findAll();
    ArrayList<E> getName( String name );
    int findByid(int id);

}
