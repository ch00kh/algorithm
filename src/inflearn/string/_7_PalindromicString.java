package inflearn.string;

import java.util.Arrays;
import java.util.Scanner;

public class _7_PalindromicString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // gooG -> YES
        System.out.println(solution(input));
    }

    private static String solution(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length()/2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }
}
