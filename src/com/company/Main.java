package com.company;

import java.util.*;

public class Main {
    private static int[] push(int[] array, int push) {
        int[] longer = new int[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }
    public static void main(String[] args) {
        //1
//        int [] arr = new int[0];
//        for (int i=1;i<100;i++){
//            if(i%2!=0){
//                arr= push(arr, i);
//               // System.out.println(i);
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//
//        }

        //2
//        int[] arr=new int[20];
//        for(int i=0;i<arr.length;i++){
//            if(i<2){
//                arr[i]=1;
//            } else {
//                arr[i]=arr[i-2]+arr[i-1];
//            }
//        }
//        for (int el:arr){
//            System.out.print(el+" ");
//        }
        //3
        int[][] arr=new int[8][5];
        Random rand = new Random();

        for (int i=0;i<8;i++){
            for (int j=0;j<5;j++){
                arr[i][j]=rand.nextInt(100);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}

