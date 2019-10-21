package com.search;

import java.util.Arrays;

/**
 * @author user01
 * @create 2019/8/19
 */
public class BinarySearch {
    public static int binarySearch(int[] num,int key){
        int start = 0;
        int end = num.length -1;
        while (start <= end){
            int middle = (start + end)/2;
            if (num[middle] > key) {
                end = middle - 1;
            } else if (num[middle] < key) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,8,6,9,10,33,44,55,66,77,88,99};
        System.out.println(binarySearch(num,44));
    }
}

