package beginnerContest269;

// https://atcoder.jp/contests/abc042/tasks/abc042_a

import java.util.Scanner;

public class irohaAndHaiku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int phrase1 = scanner.nextInt();
        int phrase2 = scanner.nextInt();
        int phrase3 = scanner.nextInt();
        if (phrase1 == 5 && phrase2 == 5 && phrase3 == 7) {
            System.out.println("YES");
        } else if (phrase1 == 5 && phrase2 == 7 && phrase3 == 5) {
            System.out.println("YES");
        } else if (phrase1 == 7 && phrase2 == 5 && phrase3 == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}


