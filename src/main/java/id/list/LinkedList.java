package id.list;

public class LinkedList {

    Node head;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // method to insert a new Node
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null) {
            list.head = newNode;
        }else{
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }

    // method to print linked list
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        while(currNode != null) {
            System.out.print (currNode.data + "");
            currNode = currNode.next;
        }
    }

    // delete a node
    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node currNode = list.head;
        Node prev = null;

        // case 1.
        // if head it self hold the key to be deleted
        if(currNode != null && currNode.data == key) {
            list.head = currNode.next;

            System.out.println(key + " found and deleted");

            return list;
        }

        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while(currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }

    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);

        System.out.println();

        // Delete node with value 1
        // In this case the key is ***at head***
//        deleteByKey(list, 1);

        deleteByKey(list, 5);
    }
}
