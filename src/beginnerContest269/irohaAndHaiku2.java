package beginnerContest269;

import java.util.Scanner;

public class irohaAndHaiku2 {
    // better solution for iroha and Haiku

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n denotes number of input,
        // a,b denotes the number of times 5 and 7 comes up
        int n = 3;
        int a = 0;
        int b= 0;
        while (n> 0) {
            n = scanner.nextInt();
            if (n == 5) a++;
            if(n==7) b++;
            n--;
        }

        if (a == 2 && b == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
