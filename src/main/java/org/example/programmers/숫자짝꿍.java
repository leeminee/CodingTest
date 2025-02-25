package org.example.programmers;


public class 숫자짝꿍 {

    public static void main(String[] args) {
        System.out.println(solution("12325", "345"));
    }

    public static String solution(String X, String Y) {
        // 각 숫자의 등장 횟수를 저장할 배열
        int[] countX = new int[10];
        int[] countY = new int[10];

        // X와 Y의 각 숫자 개수 카운트
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // 공통 숫자 찾기
        StringBuilder answer = new StringBuilder();
        for(int i = 9; i >= 0; i--) { // 큰 숫자부터 체크
            int minCount = Math.min(countX[i], countY[i]); // 공통 개수 중 최소값
            for(int j = 0; j < minCount; j++) {
                answer.append(i); // 숫자 추가
            }
        }

        // 예외 처리
        if(answer.length()== 0) return "-1"; // 공통 숫자가 없음.
        if(answer.charAt(0) == '0') return "0"; // 0으로만 구성됨.

        return answer.toString();
    }
}
