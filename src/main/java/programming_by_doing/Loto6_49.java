package programming_by_doing;

import java.util.Random;

public class Loto6_49 {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int num1, num2, num3, num4, num5, num6;

        num1 = random.nextInt(1, 50);
        num2 = random.nextInt(1, 50);
        num3 = random.nextInt(1, 50);
        num4 = random.nextInt(1, 50);
        num5 = random.nextInt(1, 50);
        num6 = random.nextInt(1, 50);

        System.out.println("Numerele din seara aceasta sunt: ");
        Thread.sleep(3000);
        System.out.print(num1 + " - ");
        Thread.sleep(3000);
        System.out.print(num2 + " - ");
        Thread.sleep(3000);
        System.out.print(num3 + " - ");
        Thread.sleep(3000);
        System.out.print(num4 + " - ");
        Thread.sleep(3000);
        System.out.print(num5 + " - ");
        Thread.sleep(3000);
        System.out.print(num6);
    }
}
