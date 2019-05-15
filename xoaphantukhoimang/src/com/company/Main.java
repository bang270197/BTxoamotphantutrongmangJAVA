package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 9;
        arr[1] = 1;
        arr[2] = 18;
        arr[3] = 21;
        arr[4] = 4;
        int x;
        Scanner scanner =new Scanner(System.in);
        for (int f=0;f<arr.length;f++){
            System.out.print(arr[f]+"\t");
        }
        System.out.println("Nhap gi tri can xoa");
        x=scanner.nextInt();
        int index=find(arr,x);
           for (int j=index;j<arr.length-1;j++){
               arr[j]=arr[j+1];
           }
         for (int k=0;k<arr.length;k++){
             System.out.print(arr[k]+"\t");
         }
    }
    private static int find(int[] arr,int x){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
