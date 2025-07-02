package inflearn.string;

import java.util.Scanner;

public class _4_wordFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCount = sc.nextInt();

        for (int i = 0; i < inputCount; i++) {
            System.out.println(solution(sc.next()));
        }
    }

    private static String solution(String str) {
        char[] charArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = charArray.length; i > 0; i--) {
            sb.append(charArray[i-1]);
        }
        return sb.toString();
    }

}
