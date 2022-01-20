public class Node {
    private int data;
    private Node next;
    private Node prev;

    public Node (int data)
    {
        this.data = data;
    }

    public void setNext(Node temp)
    {
        this.next = temp;
    }

    public Node getNext()
    {
        return this.next;
    }

    public Node getPrev()
    {
        return this.prev;
    }

    public void setPrev(Node temp)
    {
        this.prev = temp;
    }

    public int getData()
    {
        return this.data;
    }
}