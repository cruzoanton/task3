package com.company;

import java.util.Random;
import java.util.Scanner;

public class Human {
    Boolean gender;
    String name;
    String surName;
    float height;
    float weight;
    float rost, ves; //переменные для ребенка

    public Human(Boolean gender, String name, String surName, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surName = surName;
        this.height = height;
        this.weight = weight;
    }

    protected Boolean talk(Object a, Object b) {  //сверяем только пол, остальные параметры не имеют значения
        Human first = (Human) a;
        Human second = (Human) b;
        System.out.print("Будут ли говорить?  ");
        if (!first.gender && !second.gender) {
            System.out.println("Да!");
            return true;
        } else if (!first.gender && second.gender) {
            System.out.println("Да!");
            return true;
        } else if (first.gender && !second.gender) {
            System.out.println("Да!");
            return true;
        } else if (first.gender && second.gender) {
            Random r = new Random();
            if (r.nextInt(100) < 50) {
                System.out.println("Да!");
                return true;
            } else {
                System.out.println("Нет!");
                return false;
            }
        }
        System.out.println("Нет!");
        return false;
    }

    protected Boolean company(Object a, Object b) { //сверка терпения по половым признакам
        Human first = (Human) a;
        Human second = (Human) b;
        System.out.print("Будут ли терпеть общество друг друга?  ");
        if (!first.gender && !second.gender) {
            Random r = new Random();
            if (r.nextInt(100) < 5) {
                System.out.println("Да!");
                return true;
            }
        } else if (!first.gender && second.gender) {
            Random r = new Random();
            if (r.nextInt(100) < 70) {
                System.out.println("Да!");
                return true;
            }
        } else if (first.gender && !second.gender) {
            Random r = new Random();
            if (r.nextInt(100) < 70) {
                System.out.println("Да!");
                return true;
            }
        } else if (first.gender && second.gender) {
            Random r = new Random();
            if (r.nextInt(100) < 5.6) {
                System.out.println("Да!");
                return true;
            }
        }
        {
            System.out.println("Нет!");
            return false;
        }
    }

    protected Boolean together(Object a, Object b) { //тут вместо полового признака сверяем рост
        Human first = (Human) a;
        Human second = (Human) b;
        System.out.print("Будут тусить вместе?  ");
        if (Math.abs(first.height - second.height) < height / 10) {    //разница в росте до 10%
            Random r = new Random();
            if (r.nextInt(100) < 95) {
                System.out.println("Да, вероятность была 95%");
                return true;
            }
        } else {                                        //разница более 10%
            Random r = new Random();
            if (r.nextInt(100) < 85) {
                System.out.println("Да, вероятность была 85%");
                return true;
            }
            System.out.println("Нет, вероятность была 15%");
            return false;
        }
        System.out.println("Нет, вероятность была 5% (");
        return false;
    }



    @Override
    public String toString() {
        String pol = gender ? "Мужчина " : "Женщина ";
        return pol + name + " " + surName + " Ростом= " + height + "см и Весом= " + weight + "кг";
    }
    protected static Human scanHuman() {//метод сканирования объекта
        Scanner scan = new Scanner(System.in);
        boolean a;
        String b, c;
        float d, e;
        System.out.println("Пол (m для мужчины)");
        a = scan.hasNext("m");
        scan.nextLine();
        System.out.println("Имя");
        b = scan.next();
        System.out.println("Фамилия");
        c = scan.next();
        System.out.println("рост");
        d = scan.nextFloat();
        System.out.println("вес");
        e = scan.nextFloat();
        scan.nextLine();
        Human hum = new Human(a, b, c, d, e);
        return hum;
    }
}
