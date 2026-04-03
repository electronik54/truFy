package April2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanr = new Scanner(System.in);
        Random ran = new Random();
        int a;
        int b;
        int iteration = 0;
        int answer;

        do {
            a = ran.nextInt(10);
            b = ran.nextInt(10);
            System.out.println(++iteration + ":solve " + a + "+" + b + "=");
            answer = scanr.nextInt();
            if (a + b == answer) {
            System.out.println("INCORRECT ANSWER, CONTINUING LOOP")}
        } while (a + b != answer);

        System.out.println("CORRECT ANSWER, LOOP END");
    }
}
