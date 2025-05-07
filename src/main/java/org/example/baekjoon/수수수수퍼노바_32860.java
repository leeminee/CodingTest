package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수수수수퍼노바_32860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] supernovas = br.readLine().split(" ");
        int num = Integer.parseInt(supernovas[1]);
        int firstVal = num/26;
        int secondVal = num%26;

        if(secondVal == 0) {
            secondVal = 26;
            firstVal -= 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SN ").append(supernovas[0]);

        if (firstVal > 0) {
            sb.append((char)(firstVal+'A'-1)).append((char)(secondVal+'a'-1));
        } else {
            sb.append((char)(secondVal+'A'-1));
        }
        System.out.println(sb);
    }
}