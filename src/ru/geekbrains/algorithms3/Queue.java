package ru.geekbrains.algorithms3;

public class Queue {
    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int items;

    public Queue(int size) {
        this.maxSize = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    public boolean isEmpty(){
        return items == 0;
    }

    public boolean isFull(){
        return items == maxSize;
    }

    public int size(){
        return items;
    }

    public void insert(int i){
        if (isFull()) {
            maxSize *=2;
            int[] temp = new int[maxSize];
            if (rear >= front){
                System.arraycopy(queue, 0, temp, 0, queue.length);
            } else {
                System.arraycopy(queue, 0, temp, 0, rear + 1);
                System.arraycopy(queue, front, temp,
                        size() - (queue.length - front),
                        queue.length - front);
                front = maxSize - front - 1;
            }
            queue = temp;
        }

        if (rear == maxSize - 1)
            rear = -1;
        queue[++rear] = i;
        items++;
    }

    public int remove(){
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        int temp = queue[front++];
        if (front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public int peekFront(){
        return queue[front];
    }
}
