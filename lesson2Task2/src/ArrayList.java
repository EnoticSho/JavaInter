public interface ArrayList<E> {
    void insert(E e);
    void insert(int pos, E e);
    boolean remove(int pos);
    boolean isEmpty();
    int size();
    boolean contains(E e);
    E get(int pos);
    void display();
}
