package sort;//最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)

public class BubbleSort {
    public static void main(String[] args) {

        int[] data = new int[]{5, 4, 3, 2, 1};
        bubbleSort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }


    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++)
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    Util.change(data, j, j + 1);
                }
            }
    }
}
