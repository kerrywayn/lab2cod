package main;

public class Queue {
    private int[] array = new int[1000];

    private int size = 0;
    private int first;
    private int last;

    public void add(int value){
        if (size == 0) {
            first = 0;
            last = 0;
        } else {
            last++;
        }
        array[last] = value;
        size++;
    }

    public int getFirst() {
        return array[first];

    }

    public int removeFirst(){
        int res = array[first];
        first++;
        size--;
        return res;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
