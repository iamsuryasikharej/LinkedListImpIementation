public class LinkedList {
    Node head;


    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n;
            n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        System.out.println("added" + node.data);
    }

    public void show() {
        int counter = 0;
        Node n;
        n = head;
        while (n.next != null) {
            counter++;
            System.out.println("at pos " + counter + "   is this data  " + n.data);
            n = n.next;
        }
        System.out.println("at pos " + (counter + 1) + "   is this data  " + n.data);

    }


    public void insertStart(int data)
    {
        Node temp=head;
        Node node=new Node();
        node.data=data;
        node.next=temp;
        head=node;
    }
}

