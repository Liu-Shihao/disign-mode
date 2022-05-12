package com.lsh.mode2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 10:06 下午
 * @desc ：排序
 *
 */
public class Sorter {

    //选择排序进行排序
    public void selectSort(Comparable[] arr){
        // 每次找到最小的，直接交换
        //0~n 1~n
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i+1; j < N; j++) {
                minIndex = arr[j].compareTo(arr[minIndex]) < 0 ? j : minIndex;
            }
            swap(arr,minIndex,i);
        }
    }


    public void swap(Comparable[] arr,int i,int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
