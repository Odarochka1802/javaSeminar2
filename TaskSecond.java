package Seminar_2;

import java.io.*;


public class TaskSecond {
    public static void main(String[] args) {

        String str = doRepeated();
        System.out.println(str);

        String str_2 = doRepeatedSecond();
        System.out.println(str_2);

        fileWrite(str);
    }

        //Первый вариант с встроенной функцией
        public static String doRepeated () {
            long time = System.currentTimeMillis();
            String word = "TEST";
            // Повторяем строку 100 раза
            String repeated = word.repeat(100);
            System.out.println("Время выполнения c '.repeat': " + (double) (System.currentTimeMillis() - time));
            return repeated;
        }

        //Второй вариант с цыклом возвращаем StringBuilder в виде String
        //Здесь вроде исключений быть не должно, конкретное число и конкретная строка
        public static String doRepeatedSecond () {
            long time_2 = System.currentTimeMillis();
            String word = "TEST";
            StringBuilder str = new StringBuilder(100);
            for (int i = 0; i < 100; i++) {
                str.append(word);
            }
            String stroka = str.toString();
            System.out.println("Время выполнения c '.append': " + (double) (System.currentTimeMillis() - time_2));
            return stroka;
        }

        //Метод записывает в файл и обрабатывает исключения при оштбке записи
        public static void fileWrite (String text){
            try (FileWriter writer = new FileWriter("our_new_fail.txt", false)) {
                // запись строки
                writer.write(text);

                writer.flush();
                System.out.println("Файл успешно записан");
            } catch (IOException ex) {

                System.out.println("Ошибка записи" + ex.getMessage());
            }
        }
    }
