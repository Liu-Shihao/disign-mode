package com.lsh.mode2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/12 10:06 下午
 * @desc ：排序
 * 定义泛型
 * 并且传入自定义比较规则，会使排序更加灵活
 *
 */
public class SorterPlus<T> {

    public void selectSort(T[] arr,Comparator<T> comparator){
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i+1; j < N; j++) {
                minIndex = comparator.compare(arr[j],arr[minIndex]) < 0 ? j : minIndex;
            }
            swap(arr,minIndex,i);
        }
    }


    public void swap(T[] arr,int i,int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
