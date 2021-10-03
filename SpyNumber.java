/*
 * A spy number is a number where the sum of its 
 * digits equals the product of its digits. For example, 
 * 1124 is a spy number, the sum of its digits is 
 * 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.
 */

import java.util.Scanner;

public class SpyNumber {

    public static boolean isSpy(int num) {
        int product = 1, sum = 0, digit;

        while (num > 0) {
            digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }

        if (product == sum)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            if (isSpy(num))
                System.out.println(num + " is Spy Number.");
            else
                System.out.println(num + " is not Spy Number.");
        } finally {
            sc.close();
        }
    }
}