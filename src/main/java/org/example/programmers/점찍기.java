package org.example.programmers;

public class 점찍기 {
    public static void main(String[] args) {
        System.out.println(solution(2,4));
        System.out.println(solution(1,5));
    }

    public static long solution(int k, int d) {
        long answer = 0; // 가능한 점의 개수

        for(int x = 0; x <= d; x += k) { // x 좌표를 k의 배수로 증가
            int maxY = (int)Math.sqrt((long)d*d - (long)x*x); // 주어진 x에 대해 가능한 최대 y값 찾기
            answer += (maxY / k) +1; // 0부터 maxY까지 k 간격으로 배치된 개수
        }
        return answer;
    }
}
