package March;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int base = s.nextInt(), powerRaised = s.nextInt();
        int result = power(base, powerRaised);

        System.out.println(base + "^" + powerRaised + "=" + result);
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {

            // recursive call to power()
            return (base * power(base, powerRaised - 1));
        }
        else {
            return 1;
        }
    }
}
