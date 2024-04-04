package Heap;

public class HeapSort {
    public static void heapSort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);

        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            System.out.println("Passo " + (n - 1) + ":");
            imprimirCartas(arr);

            heapify(arr, i, 0);
        }

        System.out.println("\nCartas ordenadas:");
        imprimirCartas(arr);
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }

    }

    public static void imprimirCartas(int[] cartas) {
        for (int carta : cartas) {
            System.out.print(carta + " ");
        }
        System.out.println();
    }
}
