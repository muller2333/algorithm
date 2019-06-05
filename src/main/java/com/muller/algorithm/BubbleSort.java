package com.muller.algorithm;

import com.muller.util.ArrayUtil;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //由小到大排序
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    ArrayUtil.swap(arr, j, j + 1);
                }
            }
            if (flag) {
                break;
            }
        }
    }


}
