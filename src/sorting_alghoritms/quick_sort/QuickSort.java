package sorting_alghoritms.quick_sort;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int rightStart = partition(arr, start, end);
        quickSort(arr, start, rightStart - 1);
        quickSort(arr, rightStart, end);

    }
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
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
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74};

        printArray(array);

        quickSort(array, 0, array.length - 1);
        printArray(array);
    }
}
