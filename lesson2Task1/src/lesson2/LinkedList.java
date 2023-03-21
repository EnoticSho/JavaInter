package lesson2;

public interface LinkedList<E> {
    void insertFirst(E e);
    boolean removeFirst();
    E getFirst();
    void insert(E e);
    boolean remove(E e);
    E get(int pos);
    boolean contains(E e);
    int size();
    boolean isEmpty();
    void display();

}
