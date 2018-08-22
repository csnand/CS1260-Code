package search;

public class Sequential {

    public int search(int[] arr, int b) {

        for (int i = 0; i < arr.length; i++) {
            if (b == arr[i]) {
                return i;
            }
        }

        return -1;

    }

}
