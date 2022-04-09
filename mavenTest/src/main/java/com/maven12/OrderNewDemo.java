package com.maven12;

import java.util.Arrays;

public class OrderNewDemo {
    public static void main(String[] args) {
        String str = "22 21 23 43 45 32 33 31";
        String[] s_list = str.split(" ");
        int[] arr = new int[s_list.length];
        for (int x=0; x< s_list.length; x++){
            arr[x] = Integer.parseInt(s_list[x]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int x=0; x<arr.length; x++){
            if (x==arr.length-1){
                sb.append(arr[x]);
            }else {
                sb.append(arr[x]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
