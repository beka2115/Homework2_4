
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> boysNames = new ArrayList<>();
        int num = 5;
        for (int i = 0; i < 5; i++) {

            System.out.print(num + " Имя: ");
            String name = scanner.nextLine();
            boysNames.add(name);
            num -= 1;
        }
        System.out.println("Список мальчиков ->");
        System.out.println(boysNames);
        System.out.println("-----------------");

        ArrayList<String> girlsName = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (num == 0) {
                num = 5;
            }
            System.out.print(num + " Имя: ");
            String name = scanner.nextLine();
            girlsName.add(name);
            num -= 1;
        }
        System.out.println("Список девочек ->");
        System.out.println(girlsName);
        System.out.println("-----------------");


        ArrayList<String> allNames = new ArrayList<>();
        for (int i = 0; i < boysNames.size(); i++) {
            if (num == 0) {
                num = 4;
            }
            allNames.add(boysNames.get(i));
            allNames.add(girlsName.get(num));
            num -= 1;
        }
        System.out.println("Список  после объединения списков->");
        System.out.println(allNames);
        //Arrays.sort(allNames.size());
        allNames.sort((first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println("---------------");
        System.out.println("Список  после сортировки по возрастанию ->");
        System.out.println(allNames);


    }

}