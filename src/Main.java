import search.Binary;
import search.Sequential;
import sorting.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 40, 30, 90, 80, 0, 20, 100};

        printArr(arr);

//        Bubble bb = new Bubble();
//        Selection s = new Selection();
//        Insertion i = new Insertion();
//        Heap h = new Heap();
//        for (int i = arr.length; i > 1; i--){
//            H.sort(arr, i - 1);
//        }

//        Quick qs = new Quick();
//        qs.sort(arr, 0, arr.length - 1 );

//        Merge m = new Merge();
//        m.sort(arr,0, arr.length - 1);

        Bucket bk = new Bucket();

        bk.sort(arr, 100);

        Sequential ssearch = new Sequential();
        Binary bsearch = new Binary();

        System.out.println(ssearch.search(arr, 100));
        System.out.println(bsearch.search(arr, 100));;

        printArr(arr);

    }


    public static void printArr(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
}
