package com.muller.util;

public class ArrayUtil {
    /**
     * 判断数组是否递增
     *
     * @param arr
     * @return
     */
    public static boolean judgeAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断数组是否递减
     *
     * @param arr
     * @return
     */
    public static boolean judgeDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 交换数组的两个数
     *
     * @param arr
     * @param i   第一个数的下标
     * @param j   第二个数的下标
     */
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    /**
     * 将下标为primaryIdx的数插入到targetIdx，下标在[targetIdx+1,primaryIdx-1]区间的数依次后移一位
     *
     * @param arr
     * @param primaryIdx 待插入的数的下标
     * @param targetIdx  待插入数插入的位置
     */
    public static void transfer(int[] arr, int primaryIdx, int targetIdx) {
        int temp = arr[primaryIdx];
        for (int j = primaryIdx; j > targetIdx; j--) {
            arr[j] = arr[j - 1];
        }
        arr[targetIdx] = temp;
    }
}
