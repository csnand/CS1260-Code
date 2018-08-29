import search.Binary;
import search.Sequential;
import sorting.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 40, 30, 90, 80, 0, 20, 100};

        printArr(arr);
//
//        Bubble bb = new Bubble();
//
//        bb.bubble(arr);
//        Selection s = new Selection();
//        Insertion i = new Insertion();
//        Heap h = new Heap();
//        for (int i = arr.length; i > 1; i--){
//            h.sort(arr, i - 1);
//        }

        Quick qs = new Quick();
        qs.sort(arr, 0, arr.length - 1 );

//        quicksort(arr, 0, arr.length - 1);

//        Merge m = new Merge();
//        m.sort(arr,0, arr.length - 1);
//
//        Bucket bk = new Bucket();
//
//        bk.sort(arr, 100);
//
//        Sequential ssearch = new Sequential();
//        Binary bsearch = new Binary();
//
//        System.out.println(ssearch.search(arr, 100));
//        System.out.println(bsearch.search(arr, 100));

        printArr(arr);

    }


    public static void printArr(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }

    public static void quicksort(int[] arr, int low , int n) {

        int lo = low;
        int hi = n;
        if (lo >= n) {
            return;
        }

        int mid = arr[(lo+hi)/2];

        while (lo < hi) {
            while (lo < hi && arr[lo] < mid) {
                lo++;
            }

            while (lo < hi && arr[hi] > mid) {
                hi++;
            }

            if (lo < hi) {
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
            }

        }

        if (hi < lo) {
            int temp = hi;
            hi = lo;
            lo = temp;
        }

        quicksort(arr, low, lo);
        quicksort(arr, lo == low ? lo + 1 : lo, n);
    }
}
