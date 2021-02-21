public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        int[] temp = new int[array.length];
        mergeSort(array, 0, array.length - 1, temp);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] data, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(data, start, mid, temp);
            mergeSort(data, mid + 1, end, temp);
            merge(data, start, mid, end, temp);
        }
    }

    public static void merge(int[] data, int start, int mid, int end, int[] temp) {
        int index = 0;
        int left = start;
        int right = mid + 1;
        while (left <= mid && right <= end) {
            if (data[left] < data[right])
                temp[index++] = data[left++];
            else
                temp[index++] = data[right++];
        }
        while (left <= mid)
            temp[index++] = data[left++];
        while (right <= end)
            temp[index++] = data[right++];
        for (int i = 0; i < index; i ++)
            data[i + start] = temp[i];

    }


}
