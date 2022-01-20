// heap index starts from 0,1,2...
// myArray index starts from 1,2,3...

import java.util.PriorityQueue;
import java.util.Queue;

public class ClsPQHeap {
    
    private int back;
    private int heap[];
	
    public ClsPQHeap (int amount)
    {
        heap = new int[amount];
        back = 0;
    }
    
    public boolean isEmpty(){ 
        if (back == 0)
            return true;
        
        else
            return false;
	}
    
    public boolean isFull(){ 
        if  (heap.length == back)
            return true;
        
        else
            return false;
	}
    
    
    public void add(int x)
    {
    back++;
    int i = back;
    
    if (heap.length == back)
    {System.out.println("Did not add "+x+" array is full.");}
    
    else
    {
        heap[back] = x;
        if (heap[(int)i/2] > heap[back])
        {
        do{
        heap[i] = heap[(int)i/2];
        heap[(int)i/2] = x;
        i = (int)i/2;
        }while(heap[(int)i/2] > 0);
        }
    }
    /*int i = back;
    if (heap.length == 0)
        heap[back] = x;
    
    else if (heap.length != 0 && heap[(int)back/2] <= x)
        heap[back] = x;
    
    else if (heap.length != 0 && heap[(int)back/2] > x)
        {
        while(heap[(int)i/2] > x)
            {
            heap[i] = heap[(int)i/2];
            heap[(int)i/2] = x;
            i = (int)i/2;
            }
        }*/
    }
    
    public void print()
    {
    
    int n = 1;
    for (int i = 1; i < back+1; i++)
    {
    System.out.println(n+". "+ heap[i]);
    n++;
    }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int myArray[] = {15, 5, 8, 4, 9, 22, 17, 2, 14, 1};
        ClsPQHeap heap = new ClsPQHeap(myArray.length);
        for(int i = 0; i<myArray.length; i++){
            
            heap.add(myArray[i]);
        
            heap.print();
            System.out.println("");        
        }
    }    
}

/*
Did not add 1 array is full.
1. 2
2. 4
3. 8
4. 5
5. 9
6. 22
7. 17
8. 15
9. 14
*/