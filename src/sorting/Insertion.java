package sorting;

public class Insertion {

    public static void insertion(int[] list) {

        for (int i = 1; i < list.length; i++) {

            int j = i;
            int k = list[i];

            while ((j > 0) && (list[j - 1] > k)) {

                list[j] = list[j - 1];
                j--;
            }

            list[j] = k;

        }

    }

}
