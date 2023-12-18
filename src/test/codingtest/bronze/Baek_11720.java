package codingtest.bronze;

import java.util.Scanner;

public class Baek_11720 {
    public static void main(String[] args) {
        // 문자 '1'은 아스키코드 값 49이다
        // 숫자 1 = '1' - 48
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
