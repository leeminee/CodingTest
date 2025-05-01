package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String str = String.valueOf(a*b*c);
        int[] input = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            input[num]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(input[i]);
        }
    }
}
