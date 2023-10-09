import com.datastructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        removeDuplicates(list);

    }

    private static void removeDuplicates(LinkedList<Integer> list) {

        LinkedList<Integer> current = list;
        LinkedList<Integer> next = list;

        if(current.data == current.next.val) {
            next = current.next.next;
            current.next = next;
            current = current.next;
        }else {
            current = current.next;
        }
    }
}