package com.muller.algorithm;

import com.muller.util.ArrayUtil;

public class InsertSort {
    /**
     * 插入排序（从小到大）
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        //待插入的值最终插入的位置
        int insertIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            insertIdx = lookForIdx(arr, 0, i - 1, arr[i]);
            if (insertIdx != i) {
//                ArrayUtil.transfer(arr, i, insertIdx);
                //待插入的值
                int insertVal = arr[i];
                //将下标在[index+1,i-1]区间的数依次后移一位
                for (int j = i; j > insertIdx; j--) {
                    arr[j] = arr[j - 1];
                }
                //将待插入的值插入到对应位置
                arr[insertIdx] = insertVal;
            }
        }
    }

    /**
     * 另一种插入排序（从小到大）
     *
     * @param arr
     */
    public static void insertSort2(int[] arr) {
        //待插入的值
        int insertVal = 0;
        //待插入的值最终插入的位置
        int insertIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIdx = i - 1;
            //从下标i-1开始逐个向前和下标i对应的数insertVal相比,直到当前下标对应的值小于或等于insertVal或者insertIdx小于0为止
            while (insertIdx >= 0 && arr[insertIdx] > insertVal) {
                //每次条件成立，将insertIdx对应的值后移一位
                arr[insertIdx + 1] = arr[insertIdx];
                insertIdx--;
            }
            //将待插入的值插入到对应位置
            arr[insertIdx + 1] = insertVal;
        }
    }

    /**
     * 查找num在已排序数组中的插入位置
     *
     * @param arr
     * @param left  已排序数组的起始位置
     * @param right 已排序数组的结束位置
     * @param num   要插入的数
     * @return
     */
    public static int lookForIdx(int[] arr, int left, int right, int num) {
        while (right > left) {
            int mid = (left + right) / 2;
            if (arr[mid] == num) {
                return mid + 1;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr[left] >= num ? left : left + 1;
    }
}
