package inflearn.string;

import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class _8_ValidPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // found7, time: study; Yduts; emit, 7Dnuof
        System.out.println(solution(input));
    }

    private static String solution(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }

        char[] array = sb.toString().toCharArray();
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return "NO";
            }
        }
        return "YES";
    }
}
