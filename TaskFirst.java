package Seminar_2;

import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

    //Функция проверяет на палиндром и возвращает булевое значение
    //Проверяет строку на равность этой же развёрнутой строке
    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", "")).reverse().toString());
    }
}