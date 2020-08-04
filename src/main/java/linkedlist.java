public class linkedlist
{
    Node head;  // head of list

    /* Node Class */
    class Node
    {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {data = d; next = null; }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public void print()
    {
        for(Node node = head;node!=null;node=node.next){
            System.out.print(node.data + " ");
        }
    }
    public static void main(String args[])
    {
        linkedlist llist = new linkedlist();

        /* Use push() to construct below list
          1->2->1->3->1  */
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(3);
        llist.push(1);

        llist.print();
        /*Checking count function*/
        // System.out.println("Count of 1 is " + llist.count(1));
    }
}