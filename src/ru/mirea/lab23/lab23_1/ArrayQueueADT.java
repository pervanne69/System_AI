package ru.mirea.lab23.lab23_1;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    // Инвариант size >= 0, 0 <= head <= elements.length, 0 <= tail <= elements.length

    // Добавление элемента в конец очереди
    // Предусловие: elements != null
    // Постусловие: размер очереди увеличиваем на 1
    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (element == null) {
            throw new NullPointerException("Element can not be null");
        }
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    // Возвращает первый элемент в очереди
    // Предусловие: очередь не пуста
    // Постусловие: очередь не меняется
    public static Object element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.head];
    }

    // Удаляет первый элемент из очереди и возвращает его
    // Предусловие: очередь не пуста
    // Постусловие: размер очереди уменьшается на 1
    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    // Возвращает размер очереди
    // Постусловие: очередь не меняется
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Проверяет, есть ли элементы в очереди
    // Постусловие: очередь не меняется
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Удаляет все элементы из очереди
    // Постусловие: Очередь становится пустой
    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[10];
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * queue.elements.length];
        for (int i = 0; i < queue.size; i++) {
            newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
        }
        queue.elements = newElements;
        queue.head = 0;
        queue.tail = queue.size;
    }
}
