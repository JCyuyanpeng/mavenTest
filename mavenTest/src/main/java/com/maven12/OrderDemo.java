package com.maven12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderDemo {
    public static void main(String[] args) {
        String s = "12 23 34 45 56 21 23 25";
        String[] s_list = s.split(" ");
        Arrays.sort(s_list);
        StringBuilder s2 = new StringBuilder();
        for (int x=0; x<s_list.length; x++){
//            s2.add(s_list[x]);
            s2 = s2.append(s_list[x]).append(" ");
        }
        String s3 = s2.toString();
        System.out.println(s3);
    }
}
