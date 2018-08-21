package sorting;

public class Heap {

    public static void heap(int[] arr, int bound) {

        int i, o;
        int lChild, rChild, mChild, root, temp;
        root = (bound - 1)/2;

        for (o = root; o >= 0; o--) {

            for (i = root; i >= 0; i--) {

                lChild = (2*i)+1;
                rChild = (2*i)+2;

                if ((lChild <= bound) && (rChild <= bound)) {

                    if (arr[rChild] >= arr[lChild]) {
                        mChild = rChild;
                    } else {
                        mChild = lChild;
                    }

                } else {

                    if (rChild > bound) {
                        mChild = lChild;
                    } else{
                        mChild = rChild;
                    }

                }

                if (arr[i] < arr[mChild]) {
                    temp = arr[i];
                    arr[i] = arr[mChild];
                    arr[mChild] = temp;
                }

            }

        }

        temp = arr[0];
        arr[0] = arr[bound];
        arr[bound] = temp;

        return;
    }

}
