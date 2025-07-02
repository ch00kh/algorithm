package inflearn.string;

import java.util.Scanner;

public class _5_TurnOverCertainCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // a#b!GE*T@S
        System.out.println(solution(input));
    }

    private static String solution(String str) {
        char[] charArray = str.toCharArray();

        int p = 0;
        int q = charArray.length - 1;

        while (p < q) {
            if (!Character.isAlphabetic(charArray[p])) {
                p++;
            } else if (!Character.isAlphabetic(charArray[q])) {
                q--;
            } else {
                char tmp = charArray[p];
                charArray[p] = charArray[q];
                charArray[q] = tmp;
                p++;
                q--;
            }
        }
        return String.valueOf(charArray);
    }

}
