public class quickSort {

    public static void main(String[] args) {
        int data[] = new int[]{5, 6, 7, 4, 3};
        sort(data,0,4);
        for (int i = 0; i < data.length; i ++){
            System.out.println(data[i]);
        }
    }

    public static void sort(int[] data, int start, int end){
        if (data == null || start > end)
            return;
        int array[] = data;
        int left = start;
        int right = end;
        int temp = array[start];
        while (left < right){
            while (left < right && array[right] >= temp)
                right --;
            while (left < right && array[left] <= temp)
                left ++;
            change(data, left, right);
        }
        change(data, start, left);
        sort(data, start, left - 1);
        sort(data, left + 1, end);
    }

    public static void change(int[] data, int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}
