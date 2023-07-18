package 排序.归并排序;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        var a=new int[] { 5,4,3,2,1 };
        mergeSort(a,0,4);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] a,int left,int right) {
        if(left>=right)return;
        int mid=left+right>>1;
        mergeSort(a,left, mid);
        mergeSort(a, mid + 1, right);
        int k = 0, i = left, j = mid + 1;
        int[] temp=new int[a.length];
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }
        for (i = left,j=0; i <= right; i++,j++) {
            a[i] = temp[j];
        }
    }
}
