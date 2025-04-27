package org.example.baekjoon;

import java.io.*;

public class 빠른AplusB_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
