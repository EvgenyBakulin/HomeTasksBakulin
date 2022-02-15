package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1. ФИО сотрудников");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        task2(fullName);
        task3(fullName);
        task4("Иванов Семён Семёнович");
        task4Split("Иванов Семён Семёнович");
    }

    /*Всем методам передаём строку с ФИО, чтобы изначальная строка оставалась, иначе она будет
     * необратимо меняться, а по нашей задаче она должна сохраняться
     * (как изначальная строка данных о сотруднике)*/
    public static void task2(String s) {
        System.out.println("Задание 2. В верхний регистр");
        s = s.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s);
    }

    public static void task3(String s) {
        System.out.println("Задание 3. С точкой-с-запятой");
        s = s.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела —  " + s);
    }

    public static void task4(String s) {
        System.out.println("Задание 4. Без буквы ё");
        s = s.replace("ё", "е").replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника —  " + s);
    }
    /*Потренировался со split. Только, поскольку нас предупреждали, что складывать в маcсиве строки
    * это некомильфо, занимает очень много памяти и времени, я изучил StringBuilder, и проверял, заменял
    * и складывал с его помощью. Вроде работает)*/
    public static void task4Split(String s) {
        System.out.println("Задание 4. Без буквы ё");
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
           for (String word : arr) {
               StringBuilder sbWord = new StringBuilder(word);
               if (sbWord.indexOf("Ё")!=-1) {
                   sbWord.replace(sbWord.indexOf("Ё"),sbWord.indexOf("Ё")+1,"Е");
               }
               if (sbWord.indexOf("ё")!=-1) {
                   sbWord.replace(sbWord.indexOf("ё"),sbWord.indexOf("ё")+1,"е");
               }
               sb.append(sbWord).append(" ");
           }
           sb.deleteCharAt(sb.length()-1);
           s = sb.toString();
        System.out.println("Данные ФИО сотрудника —  " + s);
    }
}

