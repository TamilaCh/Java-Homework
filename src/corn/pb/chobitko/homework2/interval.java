package corn.pb.chobitko.homework2;

import java.util.Scanner;

public class interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int x = in.nextInt();
          if (x >= 0 && x <= 14) {
            System.out.println("Число належить проміжку [0;14]");
        } else
            if (x >= 15 && x <= 35) {
            System.out.println("[Число належить проміжку [15;35]");
        } else
        if (x >= 36 && x <= 50) {
            System.out.println("Число належить проміжку [36;50]");
        } else
        if (x >= 51 && x <= 100) {
            System.out.println("Число належить проміжку [51;100]");
        } else
        if (x<0 || x>100){
            System.out.println("Число не належить вказаним проміжкам");
        }
    }
}

