package com.lsh.mode11.iterator;

import java.util.Arrays;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/17 9:41 下午
 * @desc ：
 */
public class ArrayList implements MyCollection {

    private Object[] arr = new Object[10];
    private int size ;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object t) {
        if (size>= arr.length){
            //扩容
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[size++] = t;
    }

    @Override
    public MyIterator iterator() {
        MyIterator arrayListIterator = new MyIterator() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                if (currentIndex < size) return true;
                return false;
            }

            @Override
            public Object next() {
                return arr[currentIndex++];
            }
        };

        return arrayListIterator;
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList.size);
        MyIterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
