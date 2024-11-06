package ru.mirea.lab22.lab22_1;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.capacity = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return this.top == this.capacity - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + value);
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top--];
    }
    public int getSize() {
        return top + 1;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top];
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.push(4);
        stack.printStack();
        System.out.println(stack.peek());
        stack.printStack();
    }
}
