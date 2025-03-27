import java.util.Scanner;  // Импортируем класс Scanner для ввода данных с клавиатуры

public class MaximumOfTwoNumbers {  // Определяем главный класс программы
    public static void main(String[] args){  // Метод main - точка входа в программу
        Scanner scan = new Scanner(System.in);  // Создаем объект Scanner для чтения данных с клавиатуры

        System.out.println("Enter first number:");  // Запрашиваем у пользователя первое число
        int num1 = scan.nextInt();  // Считываем первое число с клавиатуры и сохраняем его в переменную num1

        System.out.println("Enter second number:");  // Запрашиваем у пользователя второе число
        int num2 = scan.nextInt();  // Считываем второе число с клавиатуры и сохраняем его в переменную num2

        // Используем конструкцию if-else для сравнения чисел
        if (num1 > num2){  // Если первое число больше второго
            System.out.println("The first number " + num1 + " is bigger than the second number " + num2 + ".");  // Выводим сообщение о том, что первое число больше
        } else if (num2 > num1){  // Если второе число больше первого
            System.out.println("The second number " + num2 + " is bigger than the first number " + num1 + ".");  // Выводим сообщение о том, что второе число больше
        } else {  // В противном случае (если числа равны)
            System.out.println("The numbers are equal.");  // Выводим сообщение о том, что числа равны
        }

        scan.close(); // Закрываем Scanner.
    }
}