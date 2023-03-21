package lesson2;

public class Main {
    public static void main(String[] args) {
        LinkedListImpl<Integer> integerLinkedList = new LinkedListImpl<>();
        System.out.println(integerLinkedList.getFirst());
        integerLinkedList.insert(1);
        integerLinkedList.insert(2);
        integerLinkedList.insert(3);
        System.out.println(integerLinkedList.get(3));
        integerLinkedList.insert(4);
        System.out.println(integerLinkedList.getFirst());
        System.out.println(integerLinkedList);
        integerLinkedList.insertFirst(10);
        System.out.println(integerLinkedList.get(2));
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.removeFirst());
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.get(5));
        System.out.println(integerLinkedList.remove(4));
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.contains(4));
        System.out.println(integerLinkedList.contains(5));
        System.out.println(integerLinkedList.size());
    }
}