import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<String>();
        LinkedList<String>list1 = new LinkedList<String>();

        list.add("Sujal");
        list.add("Akash");
        list.add("Som");
        list.add("Om");
        list.add("Mich");

        list1.add("Namo");

        list.addAll(list1);


        list.addFirst("Mi");
        list.addLast("Sujaa");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(2));

        System.out.println(list.indexOf("Om"));

        

    }
}
