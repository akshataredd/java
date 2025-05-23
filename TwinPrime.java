import java.util.*;

public class TwinPrime {
    public boolean checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        TwinPrime ob = new TwinPrime();
        boolean result1 = ob.checkPrime(num1);
        boolean result2 = ob.checkPrime(num2);

        if (result1 && result2 && Math.abs(num1 - num2) == 2) {
            System.out.println("Twin prime");
        } else {
            System.out.println("Not Twin prime");
        }
    }
}