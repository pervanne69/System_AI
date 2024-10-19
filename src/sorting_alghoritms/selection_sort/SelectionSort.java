package sorting_alghoritms.selection_sort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int minimum = 10000000;
        int minimumIndex;
        for (int i = 0; i < arr.length; i++) {
            minimum = arr[i];
            minimumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (minimum > arr[j]) {
                    minimum = arr[j];
                    minimumIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = minimum;
            arr[minimumIndex] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74};

        printArray(array);

        selectionSort(array);
        printArray(array);
    }
}
