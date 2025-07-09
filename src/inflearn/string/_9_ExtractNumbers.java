package inflearn.string;

import java.util.Scanner;

public class _9_ExtractNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // g0en2T0s8eSoft
        System.out.println(solution(input));
    }

    private static int solution(String str) {
        char[] charArray = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
