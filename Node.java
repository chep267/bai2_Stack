package dongcode.stack;


class Node {

    int item;
    Node next;

    public Node(int data, Node next)
    {
        this.item = data;
        this.next = next;
    }

    public int getItem()
    {
        return item;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

}