package inflearn.string;

import java.util.Scanner;

public class _3_wordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // it is time to study

        System.out.println(solution(input));
    }

    private static String solution(String str) {
        String[] arr = str.split(" ");
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            maxLength = Math.max(maxLength, arr[i].length());
        }

        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxLength) {
                answer = arr[i];
            }
        }

        return answer;
    }
}
