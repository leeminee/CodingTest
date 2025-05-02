package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");
        int max = 0;
        float sum = 0;

        // 세개의 숫자중 최대값 구하기
        for (int i = 0; i < num; i++) {
            int score = Integer.parseInt(scores[i]);
            if (score > max) {
                max = score;
            }
        }

        for (int i = 0; i < num; i++) {
            int score = Integer.parseInt(scores[i]);
            sum += ((float) score/max) * 100;
        }
        float avg = sum / num;
        System.out.println(avg);
    }
}
