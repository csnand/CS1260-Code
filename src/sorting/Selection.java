package sorting;

public class Selection {

    public void sort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < list.length; j++) {

                if (list[j] < list[min]) {
                    min = j;
                }

            }

            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;

        }

    }

}
