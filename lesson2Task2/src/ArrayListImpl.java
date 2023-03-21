public class ArrayListImpl<E> implements ArrayList<E> {
    private E[] array;

    public E[] getArray() {
        return array;
    }

    private int size;

    public ArrayListImpl() {
        this.array = (E[]) new Object[10];
        this.size = 0;
    }

    public ArrayListImpl(int length) {
        this.array = (E[]) new Object[length];
        this.size = size;
    }

    @Override
    public void insert(E e) {
        if (array.length == size) {
            grow();
        }
        array[size] = e;
        size++;
    }

    @Override
    public void insert(int pos, E e) {
        if (pos > array.length) {
            return;
        }
        if (array.length == size) {
            grow();
        }
        for (int i = size; i > pos; i--) {
            array[i] = array[i-1];
        }
        array[pos] = e;
        size++;
    }

    private void grow() {
        E[] newArray = (E[]) new Object[ (int) (array.length * 1.5)];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public boolean remove(int pos) {
        if (pos > array.length || isEmpty()) {
            return false;
        }
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int pos) {
        return size < pos ? null : array[pos];

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size;) {
            sb.append(array[i]);
            i++;
            if (i != size) {
                sb.append("->");
            }
        }
        return sb.append("]").toString();
    }
}
