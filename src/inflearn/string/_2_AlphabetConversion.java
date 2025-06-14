package inflearn.string;

import java.util.Scanner;

public class _2_AlphabetConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
    }

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char c : str.toCharArray()) {
            answer.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return answer.toString();
    }
}
