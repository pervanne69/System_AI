package ru.mirea.lab23.lab23_1;

public class QueueTest {
    public static void main(String[] args) {

        // Тест 1
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());

        System.out.println("------------------");

        // Тест 2
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(arrayQueueADT, "t");
        ArrayQueueADT.enqueue(arrayQueueADT, "c");
        System.out.println(ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println(ArrayQueueADT.size(arrayQueueADT));
        System.out.println(ArrayQueueADT.isEmpty(arrayQueueADT));
        ArrayQueueADT.clear(arrayQueueADT);
        System.out.println(ArrayQueueADT.isEmpty(arrayQueueADT));

        System.out.println("------------------");

        // Тест 3

        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.clear();
        System.out.println(arrayQueue.isEmpty());



    }
}
