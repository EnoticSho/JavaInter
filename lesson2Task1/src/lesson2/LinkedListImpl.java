package lesson2;

public class LinkedListImpl<E> implements LinkedList<E> {

    private int length;
    private Node<E> first;

    @Override
    public void insertFirst(E e) {
        first = new Node<>(e, first);
        length++;
    }

    @Override
    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        }
        first = first.next;
        length--;
        return true;
    }

    @Override
    public E getFirst() {
        return !isEmpty() ? first.value : null;
    }

    @Override
    public void insert(E e) {
        if (length == 0) {
            first = new Node<>(e, null);
            length++;
            return;
        }
        Node<E> current = first;
        while (current != null) {
            if (current.next == null) {
                current.next = new Node<>(e, null);
                length++;
                break;
            }
            current = current.next;
        }
    }

    @Override
    public boolean remove(E e) {
        Node<E> current = first;
        Node<E> prev = null;
        while (current != null) {
            if (current.value.equals(e)) {
                break;
            }
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        if (current.equals(first)) {
            removeFirst();
        }
        prev.next = current.next;
        length--;
        return true;
    }

    @Override
    public E get(int pos) {
        if (pos > length) {
            return null;
        }
        Node<E> current = first;
        while (pos != 1) {
            current = current.next;
            pos--;
        }
        return current.value;
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = first;
        while (current != null) {
            if (current.value.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public void display() {
        System.out.print(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = first;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.append("]").toString();
    }

    public class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}
