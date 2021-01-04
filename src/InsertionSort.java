public class InsertionSort {
    static int[] list = {6, 8, 3, 5, 9, 7, 2, 1};

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--)
                list[k + 1] = list[k];
                list[k + 1] = currentElement;
        }

    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");

        }
    }


}
