
public class SelectionSort {
    public static void main(String[] args) {
        int[] data = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < data.length; i++){
            selectSort(data);
            System.out.println(data[i]);
        }
    }

    public static void selectSort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            int min = i;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1])
                    min = j + 1;
            }
            Utils.change(data, i, min);
        }
    }



}
