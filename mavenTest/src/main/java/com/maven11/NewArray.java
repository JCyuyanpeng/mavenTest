package com.maven11;

import java.util.Arrays;

public class NewArray {
    public static void main(String[] args) {
        int[] array = {11,31,21,2,3,24,6};
        System.out.println("排序前：" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("排序后：" + Arrays.toString(array));
    }
}
