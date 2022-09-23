package beginnerContest42;

import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc042/tasks/arc058_a
public class irohaObsession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter total that Iroha has to pay
        int total = scanner.nextInt();
        //enter number of digits she dislikes
        int numHateDigits = scanner.nextInt();
        // enter the digits, better store them an array
        int[] hateArray = new int[numHateDigits];
        for(int i = 0; i < numHateDigits; i++){
            hateArray[i] = scanner.nextInt();
        }
        Arrays.sort(hateArray);
        // print array of disliked Digits
        //note to self: sout(hateArray) doesnt work
        System.out.println(Arrays.toString(hateArray));
    }

    // check if the digits to pay are valid
    private static boolean isValid(int total, int[] hateArray){
        while(total > 0){
            int digits = total % 10;
            if(Arrays.asList(hateArray).contains(digits)){
                return false;
            }
            total /= 10;
        }
        return true;
    }

    // calculate the amount to be paid

    // produce another array with digits Iroha's ok with
    //TODO





}
