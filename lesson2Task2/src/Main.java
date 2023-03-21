import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListImpl<Integer> arrayList = new ArrayListImpl<>(6);
        arrayList.insert(1);
        arrayList.insert(2);
        arrayList.insert(3);
        arrayList.insert(4);
        arrayList.insert(5);
        System.out.println(Arrays.toString(arrayList.getArray()));
        arrayList.insert(2,6);
        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(Arrays.toString(arrayList.getArray()));
    }
}