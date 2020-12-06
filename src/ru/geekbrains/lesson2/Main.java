package ru.geekbrains.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите операцию!");

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Ввведите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        int result;

        if (operation==1){
        }else if (operation==2){
            result = a - b;
        }else if (operation == 3) {
            result = a * b;
        }else{
            result = a / b;
            System.out.println("Ответ " + result);
        }
    }
}
