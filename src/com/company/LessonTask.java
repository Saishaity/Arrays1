package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class LessonTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> same = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int c = 0;
            int s =0;
            int a = Integer.valueOf(input[i]);
            for (int j = 0; j < input.length; j++) {
                int b = Integer.valueOf(input[j]);
                if (a == b) {
                    if (same.contains(b)) {
                        c++;
                    } else {
                        same.add(b);
                        c++;
                        s=1;
                    }
                }
            }
            if(s==1) {
                System.out.println(a + " " + c);
            }
        }
    }
}