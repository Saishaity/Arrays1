package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        ArrayList<Integer> array = new ArrayList<>();
        for(int i= 0; i<arr.length; i++){
            if(i<arr.length-2) {
                array.add(Integer.valueOf(arr[i + 2]));
            }else{
                array.add(Integer.valueOf(arr[i]));
                }
            System.out.println(array.get(i));
        }

    }

}
