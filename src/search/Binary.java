package search;

public class Binary {

    public int search(int[] arr, int b) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] < b) {
                low = mid + 1;
            } else if (arr[mid] > b) {
                high = mid -1;
            } else {
                return mid;
            }
        }

        return -1;

    }

}
