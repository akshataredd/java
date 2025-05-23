import java.util.*;

public class PerfectNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean b = isPerfect(num);
        if (b) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) { 
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            return true;
        }
        return false;
    }
}
