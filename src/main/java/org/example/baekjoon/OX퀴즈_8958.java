package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] sums = new int[num];

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            int sum = 0;
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            sums[i] = sum;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(sums[i]);
        }
    }
}
