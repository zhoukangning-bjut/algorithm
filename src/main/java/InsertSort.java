public class InsertSort {
    public static void main(String[] args) {
        int[] data = new int[]{5, 4, 3, 2, 1};
        insertSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void insertSort(int[] data) {
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < i; j++) {
                if (data[i - j] < data[i - j - 1])
                    Util.change(data, i - j, i - j - 1);
                else
                    break;
            }
    }
}
