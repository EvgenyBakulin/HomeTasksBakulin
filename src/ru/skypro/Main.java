package ru.skypro;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
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
        task5("Ivanov Ivan Ivanovich");
        task6("ivanov Ivan ivanovich");
        task7("135","246");
        task8("dgdgdhfhdjsjssjdhdhaa");
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
        System.out.println("Задание 4. Без буквы ё через StringBuilder");
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
    public static void task5(String str){
        System.out.println("Задание 5. Разделение ФИО");
        System.out.println(str);
        String lastName = str.substring(0,str.indexOf(' '));
        String name = str.substring(str.indexOf(' ')+1,str.lastIndexOf(' '));
        String middleName = str.substring(str.lastIndexOf(' ')+1);
        System.out.println("Имя - "+name);
        System.out.println("Отчество - "+middleName);
        System.out.println("Фамилия - "+lastName);
    }
    public static void task6(String string) {
        System.out.println("Задание 6. Исправление имён");
        System.out.println(string);
        char [] stringArray = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i< stringArray.length;i++) {
            if (i==0||stringArray[i-1]==' ')
            {
                stringArray[i] = Character.toUpperCase(stringArray[i]);
            }
            sb.append(stringArray[i]);
        }
        System.out.println(sb);
    }
    public static void task7(String string1, String string2) {
        System.out.println("Задание 7. Соединение двух строк в одну");
        char [] str1 = string1.toCharArray();
        char [] str2 = string2.toCharArray();
        StringBuilder str3 = new StringBuilder();
        int num = 0;
        String tail;
        if (str1.length>=str2.length) {
            num = str2.length;
            tail = string1.substring(num);
        }
        else {
            num = str1.length;
            tail = string2.substring(num);
        }
        for (int i = 0;i<num;i++) {
            str3.append(str1[i]);
            str3.append(str2[i]);
        }
        str3.append(tail);
        System.out.println(str3);
    }
    /*Сортируем полученную строку, и далее ищем дубли*/
    public static String sortString(String str) {
        char[] arrStr = str.toCharArray();
        Arrays.sort(arrStr);
        return new String(arrStr);
    }

    public static void doubles(String string) {
        System.out.println(string);
        char[] arrString = string.toCharArray();
        int temp = 0;
        int i = 0;
        while (i < arrString.length) {
            int counter = 1;
            for (int j = i; j < arrString.length -1; j++) {
                if (arrString[i] == arrString[i + arrString.length-1-j]) {
                    counter++;
                    temp++;
                }
            }
                if (counter > 1) {
                    System.out.print(arrString[i]);
                }
                i+=counter;
                if (i> arrString.length-1)
                {break;}
            }

            if (temp == 0) {
                System.out.println("Дублей нет");
            }

        }

    public static void task8(String string){
        System.out.println("Задание 8. Дубли в строке");
        String str = sortString(string);
        doubles(str);
    }
}

