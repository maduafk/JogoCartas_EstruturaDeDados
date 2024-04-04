package Selection;

    public class SelectionSort {
        // Implementação do Selection Sort
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                System.out.println("Passo " + (i + 1) + ":");
                imprimirCartas(arr);

                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            System.out.println("\nCartas ordenadas:");
            imprimirCartas(arr);
        }

        public static void imprimirCartas(int[] cartas) {
            for (int carta : cartas) {
                System.out.print(carta + " ");
            }
            System.out.println();
        }
    }

