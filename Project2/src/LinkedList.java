public class LinkedList {
    private Node first;
    private Node end;

    LinkedList()
    {
    first = null;
    end = null;
    }

    public void addAtStart(int x) 
    {
        Node temp = new Node(x);

        if (first == null) 
        {
        first = temp;
        end = temp;
        }

        else
        {
        temp.setNext(end);
        end.setPrev(temp);
        temp.setPrev(first);
        first.setNext(temp);
        first = temp;
        }
    }

    public void printFromStart(int numbers)
    {
    Node temp = end;
    while(numbers > 0)    
        {
        System.out.println(temp.getData());
        temp = temp.getNext();
        numbers = numbers - 1;
        }
    }
    
    public int remover(int K, int M)
    {    
    Node stun = end;
    Node stun_head = end;    
    Node stun_tail = first;
    
    Node cow = first;
    Node cow_head = end;
    Node cow_tail = first;
    
    //System.out.println("stun: "+stun.getData());
    //System.out.println("end: "+end.getData()+"\n");
    
    while(K-1 > 0)
    {
    stun = stun.getNext();
    K--;
    }
    
    while(M-1 > 0)
    {
    cow = cow.getPrev();
    M--;
    }
    
    end = stun;
    first = cow;
    
    if (stun.getData() == cow.getData())
        {   
        System.out.println("no candidates are removed this time");
        
        //remove the stun node
        stun_head = stun.getPrev();
        stun_tail = stun.getNext();       
        stun_head.setNext(stun_tail);
        stun_tail.setPrev(stun_head);
        
        //remove the cow node
        cow_head = cow.getPrev();
        cow_tail = cow.getNext();       
        cow_head.setNext(cow_tail);
        cow_tail.setPrev(cow_head); 
        
        end = stun.getNext();
        
        stun.setPrev(stun);
        stun.setNext(stun);
        
        first = cow.getNext();
        
        cow.setNext(cow);
        cow.setPrev(cow);
        
        return stun.getData();
        }
    
    else
        {
        System.out.println(stun.getData()+" "+cow.getData());
        
        //remove the stun node
        stun_head = stun.getPrev();
        stun_tail = stun.getNext();       
        stun_head.setNext(stun_tail);
        stun_tail.setPrev(stun_head);
        
        //remove the cow node
        cow_head = cow.getPrev();
        cow_tail = cow.getNext();       
        cow_head.setNext(cow_tail);
        cow_tail.setPrev(cow_head); 
        
        if (end.getData() == cow.getData())
        {
        first = stun_head;
        end = cow_tail;
        
        stun.setNext(stun);
        stun.setPrev(stun);
        
        System.out.println("cow: "+cow.getData());
        
        cow.setNext(cow);
        cow.setPrev(cow);
        
        return -1;
        }
        
        else
        {
        end = stun_tail;
        
        stun.setNext(stun);
        stun.setPrev(stun);
        
        first = cow_head;
        
        cow.setNext(cow);
        cow.setPrev(cow);
        
        /*
        System.out.println("end: "+end.getData());
        System.out.println("first: "+first.getData());
        System.out.println("stun: "+stun.getData());
        System.out.println("stun_head: "+stun_head.getData());
        System.out.println("stun_tail: "+stun_tail.getData());
        System.out.println("cow: "+cow.getData());
        System.out.println("cow_head: "+cow_head.getData());
        System.out.println("cow_tail: "+cow_tail.getData()+"\n");
        */
        return -1;}
        }
        
        /*
        System.out.println("end: "+end.getData());
        System.out.println("first: "+first.getData());
        System.out.println("stun: "+stun.getData());
        System.out.println("stun_head: "+stun_head.getData());
        System.out.println("stun_tail: "+stun_tail.getData());
        System.out.println("cow: "+cow.getData());
        System.out.println("cow_head: "+cow_head.getData());
        System.out.println("cow_tail: "+cow_tail.getData());
        */
        
    }            
}