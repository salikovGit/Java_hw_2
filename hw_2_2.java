package hw_2;
/*Дана json строка (сохранить в файл и читать из файла) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON,
то сделайте получение через обычный текстовый файл!!!)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class hw_2_2 {
    public static void main(String[] args) throws IOException{
        Scanner fileData = new Scanner(new File("hw_2_2.txt"));
        ArrayList students = new ArrayList<>();
        String[] words = new String[10];
        StringBuilder sb = new StringBuilder();
        while (fileData.hasNext()){
            words = fileData.nextLine().split(", ");
            for (String word : words) {
                for (String el : word.split(" ")) {
                    students.add(el);
                }
            }
        }
        fileData.close();
        for (int i = 0; i < students.size();i+=3){
            sb.append("Студент ").append(students.get(i)).append(" получил ").append(students.get(i+1))
                    .append(" по предмету ").append(students.get(i+2)).append("\n");
        }
        System.out.println(sb);
    }
}
