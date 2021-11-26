package LinkedList;

public class LinkedListTest {

    public static void main(String[] args)
    {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // linkedList.insertInB("item1");
        // linkedList.insertInB("item2");
        // linkedList.insertInB("item3");
        // linkedList.insertInB("item5");

        // linkedList.insertInE("item1");
        // linkedList.insertInE("item2");
        // linkedList.insertInE("item3");
        // linkedList.insertInE("item4");

        // linkedList.insertInN("item1", 0);
        linkedList.insertInN("item1", 1);
        linkedList.insertInN("item2", 2);
        linkedList.insertInN("item3", 3);
        linkedList.insertInN("item4", 4);
        linkedList.insertInN("reitem4", 3);
        // linkedList.insertInN("reitem2", 2);

        // linkedList.traverse(linkedList);

        // System.out.println("-------------------");
        // linkedList.delete("item1");
        // linkedList.delete("item4");

        boolean isPresent = linkedList.isPresent("reitem4");
        System.out.println(isPresent);

        // linkedList.traverse(linkedList);
        // linkedList.traverse(linkedList);
    }

}
