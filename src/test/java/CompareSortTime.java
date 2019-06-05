import com.muller.algorithm.BubbleSort;
import com.muller.algorithm.InsertSort;
import com.muller.util.ArrayUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Random;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CompareSortTime {
    int[] arr = new int[100_000];
    int[] arr2 = new int[arr.length];
    int[] arr3 = new int[arr.length];

    @BeforeAll
    public void before() {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(arr.length * 50) + 1;
            arr[i] = arr.length - i;
            arr2[i] = arr[i];
            arr3[i] = arr[i];
        }
//        System.out.println("排序前:" + Arrays.toString(arr));
    }

    @Test
    public void bubbleSort() {
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr);
        long end = System.currentTimeMillis();
        if (ArrayUtil.judgeAsc(arr)) {
            System.out.println("冒泡排序成功,耗时:" + (end - start) + "ms");
        } else {
            System.out.println("冒泡排序失败!");
        }
    }

    @Test
    public void insertSort() {
        long start = System.currentTimeMillis();
        InsertSort.insertSort(arr2);
        long end = System.currentTimeMillis();
        if (ArrayUtil.judgeAsc(arr2)) {
            System.out.println("插入排序成功,耗时:" + (end - start) + "ms");
        } else {
            System.out.println("插入排序失败!");
        }
    }

    @Test
    public void insertSort2() {
        long start = System.currentTimeMillis();
        InsertSort.insertSort2(arr3);
        long end = System.currentTimeMillis();
        if (ArrayUtil.judgeAsc(arr3)) {
            System.out.println("插入排序(2)成功,耗时:" + (end - start) + "ms");
        } else {
            System.out.println("插入排序(2)失败!");
        }
    }
}
