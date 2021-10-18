package corn.pb.chobitko.homework2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число 1: ");
        int operand1;
        operand1 = scan.nextInt();
        System.out.print("Введіть число 2: ");
        int operand2;
        operand2 = scan.nextInt();
        System.out.print("Введіть знак +,-,*,/: ");
        String sign;
        sign = scan.next();
        int ans;
        ans = 0;
        switch (sign) {
            case "+": ans = operand1 + operand2;
                break;
            case "-": ans = operand1 - operand2;
                break;
            case "*": ans = operand1 * operand2;
            System.out.println("Результат виконання операції:" + operand1 + " " + sign + " " + operand2 + " = " + ans);
           break;
            case "/":
                if (operand2 == 0) { System.out.println("На 0 ділити не можна!");}
                 else { ans = operand1 / operand2;
                System.out.println("Результат виконання операції:" + operand1 + " " + sign + " " + operand2 + " = " + ans);}
            default:
        }
    }
}



