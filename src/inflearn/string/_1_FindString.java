package inflearn.string;

import java.util.Scanner;

public class _1_FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstInput = sc.next();
        char secondInput = sc.next().charAt(0);

        System.out.println(solution(firstInput, secondInput));
    }

    private static int solution(String firstInput, char secondInput) {
        int cnt = 0;

        for (char c : firstInput.toUpperCase().toCharArray()) {
            if (c == Character.toUpperCase(secondInput)) {
                cnt++;
            }
        }

        return cnt;
    }
}
