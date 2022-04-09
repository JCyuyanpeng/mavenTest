package com.maven12;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = {3,6,3,33,66,43,23,45,63,32,321};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
