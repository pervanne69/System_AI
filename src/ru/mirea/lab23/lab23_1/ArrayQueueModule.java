package ru.mirea.lab23.lab23_1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    // Инвариант size >= 0, 0 <= head <= elements.length, 0 <= tail <= elements.length

    // Добавление элемента в конец очереди
    // Предусловие: elements != null
    // Постусловие: размер очереди увеличиваем на 1
    public static void enqueue(Object element) {
        if (element == null) {
            throw new NullPointerException("Element can not be null");
        }
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Возвращает первый элемент в очереди
    // Предусловие: очередь не пуста
    // Постусловие: очередь не меняется
    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    // Удаляет первый элемент из очереди и возвращает его
    // Предусловие: очередь не пуста
    // Постусловие: размер очереди уменьшается на 1
    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    // Возвращает размер очереди
    // Постусловие: очередь не меняется
    public static int size() {
        return size;
    }

    // Проверяет, есть ли элементы в очереди
    // Постусловие: очередь не меняется
    public static boolean isEmpty() {
        return size == 0;
    }

    // Удаляет все элементы из очереди
    // Постусловие: Очередь становится пустой
    public static void clear() {
        elements = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * elements.length];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
        tail = size;
    }

}
