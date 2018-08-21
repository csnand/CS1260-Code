package sorting;

public class Bubble {


    public static void bubble(int[] list){

        int n = list.length;

        for (int pass = 1; pass < n; pass++){

            for (int i = 0; i < n - pass; i++){

                if (list[i] > list[i + 1]) {

                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    public static void improvedBubble(int[] list) {

        boolean carryOn = true;

        while (carryOn) {

            carryOn = false;

            for (int i = 0; i < list.length - 1; i++) {

                if (list[i] > list[i + 1]) {

                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    carryOn = true;

                }

            }

        }

    }


    public static void superBubble(int[] list){

        int currentLowest = 0;
        int currentHighest = list.length - 1;

        while (currentLowest < currentHighest) {

            int oldLowest = currentLowest;
            int oldHighest = currentHighest;

            currentLowest = list.length;

            for (int i = 0; i < oldHighest; i++) {

                if (list[i] > list[i + 1]) {

                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    if (i < currentLowest) {

                        currentLowest = i -1;

                        if (currentLowest < 0) {

                            currentLowest = 0;

                        } else if (i > currentHighest) {
                            currentHighest = i + 1;
                        }
                    }

                }

            }

        }

    }







}
