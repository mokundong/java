package com.mkd.sort;

/**
 * 归并排序<br/>
 * <ul>
 * <li>申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列</li>
 * <li>设定两个指针，最初位置分别为两个已经排序序列的起始位置</li>
 * <li>比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置</li>
 * <li>重复步骤3直到某一指针达到序列尾</li>
 * <li>将另一序列剩下的所有元素直接复制到合并序列尾</li>
 * </ul>
 */
class MergeDemo {
    public static void mergeSort(int[] numbers, int left, int right) {
        int t = 1;// 每组元素个数
        int size = right - left + 1;
        while (t < size) {
            int s = t;// 本次循环每组元素个数
            t = 2 * s;
            int i = left;
            while (i + (t - 1) < size) {
                merge(numbers, i, i + (s - 1), i + (t - 1));
                i += t;
            }
            if (i + (s - 1) < right)
                merge(numbers, i, i + (s - 1), right);
        }
    }
    //归并算法实现
    private static void merge(int[] data, int p, int q, int r) {
        int[] B = new int[data.length];
        int s = p;
        int t = q + 1;
        int k = p;
        while (s <= q && t <= r) {
            if (data[s] <= data[t]) {
                B[k] = data[s];
                s++;
            } else {
                B[k] = data[t];
                t++;
            }
            k++;
        }
        if (s == q + 1)
            B[k++] = data[t++];
        else
            B[k++] = data[s++];
        for (int i = p; i <= r; i++)
            data[i] = B[i];
    }

}

