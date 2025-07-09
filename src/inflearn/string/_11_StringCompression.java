package inflearn.string;

import java.util.Scanner;

public class _11_StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // KKHSSSSSSSE -> K2HS7E
        // KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(str.charAt(i));
                if (cnt > 1) {
                    sb.append(cnt);
                }
                cnt = 1;
            }
        }

        return sb.toString();
    }
}