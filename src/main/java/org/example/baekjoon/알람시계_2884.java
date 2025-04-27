package org.example.baekjoon;

import java.util.Scanner;

public class 알람시계_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (0 <= h && h <= 23 && 0 <= m && m <= 59) {
            if (m-45 >= 0) {
                System.out.println(h + " " + (m-45));
            } else {
                if (h==0) {
                    System.out.println(23 + " " + (60+m-45));
                } else {
                    System.out.println(h-1+ " " + (60+m-45));
                }
            }
        } else {
            System.out.println("0 ≤ H ≤ 23, 0 ≤ M ≤ 59 이여야 합니다.");
        }
    }
}
