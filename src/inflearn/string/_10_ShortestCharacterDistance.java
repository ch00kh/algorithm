package inflearn.string;

import java.util.Scanner;

public class _10_ShortestCharacterDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // teachermode e
        int[] result = solution(input);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(String str) {
        String input = str.split(" ")[0];
        char t = str.charAt(str.length() - 1);

        int[] answer = new int[input.length()];
        int cur = 1000;

        for (int i = 0; i < input.length(); i++) {
            if (input.toCharArray()[i] == t) {
                cur = 0;
            }
            answer[i] = cur++;
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            if ((i != input.length() - 1) && (answer[i] - answer[i + 1] > 1)) {
                answer[i] = answer[i + 1] + 1;
            }
        }

        return answer;
    }
}
