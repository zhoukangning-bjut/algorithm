package sort;

public class QuickSort {

    public static void main(String[] args) {
        int data[] = new int[]{5, 4, 3, 2, 1};
        quickSort(data, 0, 4);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void quickSort(int[] data, int start, int end) {
        if (data == null || start >= end)
            return;
        int left = start;
        int right = end;
        int temp = data[start];
        while (left < right) {
            while (left < right && data[right] >= temp)
                right--;
            while (left < right && data[left] <= temp)
                left++;
            Util.change(data, left, right);
        }
        Util.change(data, start, left);
        quickSort(data, start, left - 1);
        quickSort(data, left + 1, end);
    }

}
