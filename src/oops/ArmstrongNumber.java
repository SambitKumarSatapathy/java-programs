package oops;
public class ArmstrongNumber {
    public static int countDigits(int num, int count) {
        if (num == 0) {
            return count;
        } else {
            return countDigits(num / 10, count + 1);
        }
    }

    public static int powerDigits(int num, int power) {
        if (num == 0) {
            return 0;
        } else {
            return (int) Math.pow(num % 10, power) + powerDigits(num / 10, power);
        }
    }

    public static boolean isArmstrong(int num) {
        int numDigits = countDigits(num, 0);
        int poweredSum = powerDigits(num, numDigits);
        return poweredSum == num;
    }

    public static void main(String[] args) {
        // Test the function with some sample inputs
        System.out.println(isArmstrong(153)); // true
        System.out.println(isArmstrong(371)); // true
        System.out.println(isArmstrong(9474)); // true
        System.out.println(isArmstrong(9475)); // false
    }
}


