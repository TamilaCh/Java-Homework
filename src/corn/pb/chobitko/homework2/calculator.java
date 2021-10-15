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
        switch(sign) {
            case "+": ans = operand1 + operand2;
                break;
            case "-": ans = operand1 - operand2;
                break;
            case "*": ans = operand1 * operand2;
                break;
            case "/": ans = operand1/operand2;
                if(operand2!= 0)
                    System.out.println("Результат виконання операції:" + operand1 + " " + sign + " " + operand2 + " = " + ans);
                else System.out.println("На нуль ділити не можна!");
                break;
            default:
                return;
        }
        System.out.println("Результат виконання операції:" + operand1 + " " + sign + " " + operand2 + " = " + ans);
    }

}
