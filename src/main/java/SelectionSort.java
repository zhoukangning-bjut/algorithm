
public class SelectionSort {
    public static void main(String[] args) {
        int[] data = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < data.length; i++) {
            selectSort(data);
            System.out.println(data[i]);
        }
    }

    public static void selectSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int temp = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[temp])
                    temp = j;
            }
            Util.change(data, temp, i);
        }
    }


}
