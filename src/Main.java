import sorting.Bubble;
import sorting.Heap;
import sorting.Insertion;
import sorting.Selection;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 40, 30, 90, 80, 0, 20};

        printArr(arr);

        for (int i = arr.length; i > 1; i--){
            Heap.heap(arr, i - 1);
        }

        printArr(arr);

    }


    public static void printArr(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
}
