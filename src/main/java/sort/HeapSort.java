package sort;

import utils.Util;

public class HeapSort {


    public static void main(String[] args) {
        int[] data = new int[]{5, 4, 3, 2, 1};
        buildHeap(data);
        for (int i : data) {
            System.out.println(i);
        }
        for (int i = data.length - 1; i >= 0; i--) {
            Util.change(data, i, 0);
            adjustHeap(data, 0, i);
        }

        for (int i : data) {
            System.out.println(i);
        }
    }

    public static void buildHeap(int[] data) {
        for (int i = data.length / 2 - 1; i >= 0; i--) {
            adjustHeap(data, i, data.length);
        }
    }


    public static void adjustHeap(int[] data, int i, int length) {
        int max = i;
        if (i * 2 + 1 < length && data[max] < data[i * 2 + 1])
            max = i * 2 + 1;
        if (i * 2 + 2 < length && data[max] < data[i * 2 + 2])
            max = i * 2 + 2;
        if (max != i) {
            Util.change(data, max, i);
            adjustHeap(data, max, length);
        }
    }
}
