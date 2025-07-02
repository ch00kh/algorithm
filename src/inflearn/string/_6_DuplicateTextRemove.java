package inflearn.string;

import java.util.Scanner;

public class _6_DuplicateTextRemove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // ksekkset
        System.out.println(solution(input));
    }

    private static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
