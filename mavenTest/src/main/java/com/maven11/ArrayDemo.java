package com.maven11;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] array = {1,3,2,4,2};
        System.out.println("前" + array(array));
        for (int x=0; x<array.length-1; x++){
            for (int y=0; y<array.length-1-x; y++){
                if (array[y] > array[y+1]){
                    int tem = array[y];
                    array[y] = array[y+1];
                    array[y+1] = tem;
                }
            }
        }
        System.out.println(array[0]);
    }

    public static String array(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0; i<array.length; i++){
            if (i == array.length -1){
                sb.append(array[i]);
            }else {
                sb.append(array[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
