package sorting;

public class Merge {
    public void sort(int[] arr, int lo, int n) {

        int low = lo;
        int high = n;

        if (low >= high) {
            return;
        }

        int mid = ( low + high ) / 2;

        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, lo, mid, n);

    }

    private void merge(int[] arr, int lo, int mid, int n) {

        int low = lo;
        int high = n;

        int end_low = mid + 1;
        int start_high = mid + 1;

        while ((lo <= end_low) && (start_high <= high)) {
            if (arr[low] < arr[start_high]) {
                low++;
            } else {
                int temp = arr[start_high];
                for (int i = start_high - 1; i >= low; i--) {
                    arr[i + 1] = arr[i];
                }

                arr[low] = temp;
                low++;
                end_low++;
                start_high++;

            }
        }
    }
}
