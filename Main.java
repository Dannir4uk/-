import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите вычисление");
        String input = sc.nextLine();

        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            return;
        }
        int num1 = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int num2 = Integer.parseInt(parts[2]);

        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            System.out.println("Числа должны быть от 1 до 10");
            return;
        }
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }
        System.out.println("Результат: " + result);
    }
}