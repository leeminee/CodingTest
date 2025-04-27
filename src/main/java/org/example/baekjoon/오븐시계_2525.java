package org.example.baekjoon;

import java.util.Scanner;

public class 오븐시계_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookTime = sc.nextInt();
        if (0 <= hour && hour <= 23 && 0 <= min && min <= 59 && 0 <= cookTime && cookTime <= 1000) {
            int newMin = min + cookTime;
            hour += newMin / 60;
            newMin = newMin % 60;

            if (hour >= 24) {
                hour %= 24;
            }

            System.out.println(hour +" "+newMin);
        } else {
            System.out.println("0 ≤ H ≤ 23, 0 ≤ M ≤ 59, 0 ≤ C ≤ 1,000 이여야 합니다.");
        }
    }
}
